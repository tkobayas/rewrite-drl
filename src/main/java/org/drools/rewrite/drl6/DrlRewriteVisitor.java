package org.drools.rewrite.drl6;

import org.openrewrite.Tree;
import org.openrewrite.TreeVisitor;

/**
 * This class is a thin wrapper to associate a custom Antlr4 visitor with DrlSourceFile
 */
public class DrlRewriteVisitor<P> extends TreeVisitor<Tree, P> {

    public DrlSourceFile visitDrlSourceFile(DrlSourceFile drlSourceFile, P p) {
        String drl = drlSourceFile.getDrlText();
        System.out.println("Original DRL: " + drl);
//        return new DrlSourceFile(drl, drlSourceFile.getSourcePath());
        // TODO: check if the drl is modified. If yes, create a new DrlSourceFile with the modified drl using withDrlText
        return drlSourceFile;
    }
}
