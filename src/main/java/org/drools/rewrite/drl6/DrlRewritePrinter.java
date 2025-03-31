package org.drools.rewrite.drl6;

import org.jspecify.annotations.Nullable;
import org.openrewrite.PrintOutputCapture;
import org.openrewrite.Tree;
import org.openrewrite.TreeVisitor;

public class DrlRewritePrinter<P> extends TreeVisitor<DrlSourceFile, PrintOutputCapture<P>> {

    @Override
    public @Nullable DrlSourceFile visit(@Nullable Tree tree, PrintOutputCapture<P> p) {
        if (tree instanceof DrlSourceFile) {
            DrlSourceFile file = (DrlSourceFile) tree;
            p.append(file.printAll());
            return file;
        }
        return null;
    }
}
