package org.drools.drl.parser.antlr4;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;

class DRLParserTest {

    @Test
    void parseWithBasicAPIs() {
        // basic drl
        String drl = """
                package org.drools.drl.parser.antlr4
                import org.example.Person
                rule "Hello World"
                when
                  $p : Person(age > 18 || < 30)
                then
                  System.out.println("Hello World");
                end
                """;

        CharStream charStream = CharStreams.fromString(drl);
        org.drools.drl.parser.antlr4.DRLLexer drlLexer = new org.drools.drl.parser.antlr4.DRLLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(drlLexer);
        org.drools.drl.parser.antlr4.DRLParser drlParser = new org.drools.drl.parser.antlr4.DRLParser(commonTokenStream);
        org.drools.drl.parser.antlr4.DRLParser.CompilationUnitContext compilationUnitContext = drlParser.compilationUnit();
        System.out.println(compilationUnitContext.toStringTree(drlParser));
    }
}
