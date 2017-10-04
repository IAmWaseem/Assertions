package net.waseemhassan.assertions.contracts;

public interface ClassTester<Self> {
    Self forConstructor(Object... arguments);
}