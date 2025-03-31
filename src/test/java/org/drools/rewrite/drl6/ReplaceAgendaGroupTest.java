package org.drools.rewrite.drl6;

import org.drools.rewrite.drl6.recipes.ReplaceAgendaGroup;
import org.junit.jupiter.api.Test;
import org.openrewrite.test.RewriteTest;

import static org.drools.rewrite.drl6.Assertions.drl;

class ReplaceAgendaGroupTest implements RewriteTest {

    @Test
    void replaceInRule() {
        rewriteRun(
                spec -> spec.recipe(new ReplaceAgendaGroup()),
                drl("""
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
                            """,
                    """
                            package org.drools.drl.parser.antlr4.drl6
                            import org.example.Person
                            rule "Hello World"
                            ruleflow-group "group1"
                            dialect "mvel"
                            when
                              $p : Person(age > 18 || < 30)
                            then
                              System.out.println("Hello World");
                            end
                            """)
        );
    }
}