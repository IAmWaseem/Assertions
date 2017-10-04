package net.waseemhassan.assertions;

import net.waseemhassan.assertions.implementations.AssertJAssertions;

public class DefaultAssertionsFactory implements AssertionsFactory {
    @Override
    public AssertionsBase getDefaultAssertionsInstance() {
        return new AssertJAssertions();
    }
}