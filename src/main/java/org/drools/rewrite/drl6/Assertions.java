package org.drools.rewrite.drl6;

import org.jspecify.annotations.Nullable;
import org.openrewrite.test.SourceSpec;
import org.openrewrite.test.SourceSpecs;

public class Assertions {

    public static SourceSpecs drl(@Nullable String before) {
        return new SourceSpec<>(DrlSourceFile.class, null, DrlRewriteParser.builder(), before, null);
    }

    public static SourceSpecs drl(@Nullable String before, @Nullable String after) {
        return new SourceSpec<>(DrlSourceFile.class, null, DrlRewriteParser.builder(), before, s -> after);
    }
}
