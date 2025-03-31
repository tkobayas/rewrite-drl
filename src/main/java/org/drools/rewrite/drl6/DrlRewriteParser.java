package org.drools.rewrite.drl6;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.Nullable;
import org.openrewrite.ExecutionContext;
import org.openrewrite.Parser;
import org.openrewrite.SourceFile;

public class DrlRewriteParser implements Parser {

    @Override
    public @NotNull Stream<SourceFile> parseInputs(Iterable<Input> sources, @Nullable Path relativeTo, ExecutionContext ctx) {
        List<SourceFile> sourceFiles = new ArrayList<>();
        for (Input input : sources) {
            DrlSourceFile sourceFile = new DrlSourceFile(input.getSource(ctx).readFully(), input.getPath());
            sourceFiles.add(sourceFile);
        }
        return sourceFiles.stream();
    }

    @Override
    public boolean accept(Path path) {
        return true;
    }

    @Override
    public Path sourcePathFromSourceText(Path prefix, String sourceCode) {
        return prefix.resolve("myDrl.drl");
    }

    public static DrlRewriteParser.Builder builder() {
        return new DrlRewriteParser.Builder();
    }

    public static class Builder extends Parser.Builder {

        public Builder(Class<? extends SourceFile> sourceFileType) {
            super(sourceFileType);
        }

        public Builder() {
            super(DrlSourceFile.class);
        }

        @Override
        public Parser build() {
            return new DrlRewriteParser();
        }

        @Override
        public String getDslName() {
            return "";
        }
    }
}
