package org.drools.rewrite.drl6;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.UUID;

import org.jspecify.annotations.Nullable;
import org.openrewrite.Checksum;
import org.openrewrite.Cursor;
import org.openrewrite.FileAttributes;
import org.openrewrite.PrintOutputCapture;
import org.openrewrite.SourceFile;
import org.openrewrite.Tree;
import org.openrewrite.TreeVisitor;
import org.openrewrite.marker.Markers;

public class DrlSourceFile implements SourceFile  {

    private final String drlText;
    private final UUID id;
    private final Markers markers;
    private final Path sourcePath;
    private final Charset charset;
    private final boolean charsetBomMarked;
    private final Checksum checksum;
    private final FileAttributes fileAttributes;

    public DrlSourceFile(String drlText, Path sourcePath) {
        this(drlText, UUID.randomUUID(), Markers.EMPTY, sourcePath, StandardCharsets.UTF_8, false, null, null);
    }

    public DrlSourceFile(String drlText, UUID id, Markers markers, Path sourcePath, Charset charset,
                         boolean charsetBomMarked, Checksum checksum, FileAttributes fileAttributes) {
        this.drlText = drlText;
        this.id = id;
        this.markers = markers;
        this.sourcePath = sourcePath;
        this.charset = charset;
        this.charsetBomMarked = charsetBomMarked;
        this.checksum = checksum;
        this.fileAttributes = fileAttributes;
    }

    public DrlSourceFile withDrlText(String drlText) {
        if (drlText.equals(this.drlText)) {
            return this;
        }
        return new DrlSourceFile(drlText, id, markers, sourcePath, charset, charsetBomMarked, checksum, fileAttributes);
    }

    @Override
    public Path getSourcePath() {
        return sourcePath;
    }

    @SuppressWarnings("unchecked")
    @Override
    public DrlSourceFile withSourcePath(Path path) {
        if (path.equals(sourcePath)) {
            return this;
        }
        return new DrlSourceFile(drlText, id, markers, path, charset, charsetBomMarked, checksum, fileAttributes);
    }

    @Override
    public @Nullable Charset getCharset() {
        return charset;
    }

    @SuppressWarnings("unchecked")
    @Override
    public DrlSourceFile withCharset(Charset charset) {
        if (charset.equals(this.charset)) {
            return this;
        }
        return new DrlSourceFile(drlText, id, markers, sourcePath, charset, charsetBomMarked, checksum, fileAttributes);
    }

    @Override
    public boolean isCharsetBomMarked() {
        return charsetBomMarked;
    }

    @SuppressWarnings("unchecked")
    @Override
    public DrlSourceFile withCharsetBomMarked(boolean marked) {
        if (marked == this.charsetBomMarked) {
            return this;
        }
        return new DrlSourceFile(drlText, id, markers, sourcePath, charset, marked, checksum, fileAttributes);
    }

    @Override
    public @Nullable Checksum getChecksum() {
        return checksum;
    }

    @SuppressWarnings("unchecked")
    @Override
    public DrlSourceFile withChecksum(@Nullable Checksum checksum) {
        if ((this.checksum == null && checksum == null) || (this.checksum != null && this.checksum.equals(checksum))) {
            return this;
        }
        return new DrlSourceFile(drlText, id, markers, sourcePath, charset, charsetBomMarked, checksum, fileAttributes);
    }

    @Override
    public @Nullable FileAttributes getFileAttributes() {
        return fileAttributes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public DrlSourceFile withFileAttributes(@Nullable FileAttributes fileAttributes) {
        if ((this.fileAttributes == null && fileAttributes == null) || (this.fileAttributes != null && this.fileAttributes.equals(fileAttributes))) {
            return this;
        }
        return new DrlSourceFile(drlText, id, markers, sourcePath, charset, charsetBomMarked, checksum, fileAttributes);
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public Markers getMarkers() {
        return markers;
    }

    @SuppressWarnings("unchecked")
    @Override
    public DrlSourceFile withMarkers(Markers markers) {
        if (markers.equals(this.markers)) {
            return this;
        }
        return new DrlSourceFile(drlText, id, markers, sourcePath, charset, charsetBomMarked, checksum, fileAttributes);
    }

    @SuppressWarnings("unchecked")
    @Override
    public DrlSourceFile withId(UUID id) {
        if (id.equals(this.id)) {
            return this;
        }
        return new DrlSourceFile(drlText, id, markers, sourcePath, charset, charsetBomMarked, checksum, fileAttributes);
    }

    public String getDrlText() {
        return drlText;
    }

    // Work with DrlRewriteVisitor
    @Override
    public <P> boolean isAcceptable(TreeVisitor<?, P> v, P p) {
        return v.isAdaptableTo(DrlRewriteVisitor.class);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <R extends Tree, P> R accept(TreeVisitor<R, P> v, P p) {
        return (R) v.adapt(DrlRewriteVisitor.class).visitDrlSourceFile(this, p);
    }

    @Override
    public String printAll() {
        return drlText;
    }

    @Override
    public <P> TreeVisitor<?, PrintOutputCapture<P>> printer(Cursor cursor) {
        return new DrlRewritePrinter<>();
    }
}
