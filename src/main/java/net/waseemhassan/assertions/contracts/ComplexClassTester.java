package net.waseemhassan.assertions.contracts;

public interface ComplexClassTester<Self, ObjectCreationModelType> extends ClassTester<Self> {
    Self createObjectUsingModel(ObjectCreationModelType model);
}
