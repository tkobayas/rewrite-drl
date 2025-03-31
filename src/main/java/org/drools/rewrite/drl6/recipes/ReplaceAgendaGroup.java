package org.drools.rewrite.drl6.recipes;

import org.drools.rewrite.drl6.DrlRewriteVisitor;
import org.jetbrains.annotations.NotNull;
import org.openrewrite.ExecutionContext;
import org.openrewrite.Recipe;
import org.openrewrite.TreeVisitor;

public class ReplaceAgendaGroup extends Recipe {

    @Override
    public String getDisplayName() {
        return "Replace agenda-group with ruleflow-group";
    }

    @Override
    public String getDescription() {
        return "Replaces the agenda-group with ruleflow-group in the given rule.";
    }

    @Override
    public TreeVisitor<?, ExecutionContext> getVisitor() {
        // TODO: implement a custom antlr visitor for this recipe. Then pass it to the DrlRewriteVisitor
        return new DrlRewriteVisitor();
    }

}
