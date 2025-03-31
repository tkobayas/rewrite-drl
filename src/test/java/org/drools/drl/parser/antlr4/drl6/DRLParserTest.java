package org.drools.drl.parser.antlr4.drl6;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import org.drools.drl.parser.antlr4.drl6.gen.DRLLexer;
import org.drools.drl.parser.antlr4.drl6.gen.DRLParser;
import org.drools.drl.parser.antlr4.drl6.gen.DRLParserBaseListener;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test rewriting with Antlr4 APIs directly
 */
class DRLParserTest {

    private static final String DRL6_DRL = """
                package org.drools.drl.parser.antlr4.drl6
                import org.example.Person
                rule "Hello World"
                agenda-group "group1"
                dialect "mvel"
                when
                  $p : Person(age > 18 || < 30)
                then
                  System.out.println("Hello World");
                end
                """;

    @Test
    void writeOriginalString() {
        CharStream charStream = CharStreams.fromString(DRL6_DRL);
        DRLLexer drlLexer = new DRLLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(drlLexer);
        DRLParser drlParser = new DRLParser(commonTokenStream);
        DRLParser.CompilationUnitContext compilationUnitContext = drlParser.compilationUnit();

        // write back to string preserving the original formatting
        String originalReconstructed = commonTokenStream.getText(compilationUnitContext.getSourceInterval());
        System.out.println(originalReconstructed);

        assertThat(originalReconstructed).isEqualTo(DRL6_DRL);
    }

    @Test
    void replaceWord() {
        CharStream charStream = CharStreams.fromString(DRL6_DRL);
        DRLLexer drlLexer = new DRLLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(drlLexer);
        DRLParser drlParser = new DRLParser(commonTokenStream);
        DRLParser.CompilationUnitContext compilationUnitContext = drlParser.compilationUnit();

        TokenStreamRewriter rewriter = new TokenStreamRewriter(commonTokenStream);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new DRLParserBaseListener() {
            @Override
            public void enterStringAttribute(DRLParser.StringAttributeContext ctx) {
                // Replace only if DRL_AGENDA_GROUP
                if (ctx.DRL_AGENDA_GROUP() != null) {
                    TerminalNode agendaGroup = ctx.DRL_AGENDA_GROUP();
                    rewriter.replace(agendaGroup.getSymbol(), "ruleflow-group");
                }
            }
        }, compilationUnitContext);

        String rewritten = rewriter.getText();
        System.out.println(rewritten);

        String expected = DRL6_DRL.replace("agenda-group", "ruleflow-group");

        assertThat(rewritten).isEqualTo(expected);
    }

    @Test
    void insertWord() {
        CharStream charStream = CharStreams.fromString(DRL6_DRL);
        DRLLexer drlLexer = new DRLLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(drlLexer);
        DRLParser drlParser = new DRLParser(commonTokenStream);
        DRLParser.CompilationUnitContext compilationUnitContext = drlParser.compilationUnit();

        TokenStreamRewriter rewriter = new TokenStreamRewriter(commonTokenStream);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new DRLParserBaseListener() {
            @Override
            public void enterRelationalOp(DRLParser.RelationalOpContext ctx) {
                // Insert left operand
                if (ctx.LT() != null) {
                    TerminalNode lt = ctx.LT();
                    rewriter.insertBefore(lt.getSymbol(), "age ");
                }
            }
        }, compilationUnitContext);

        String rewritten = rewriter.getText();
        System.out.println(rewritten);

        String expected = DRL6_DRL.replace("|| < 30", "|| age < 30");

        assertThat(rewritten).isEqualTo(expected);
    }
}
