package net.waseemhassan.assertions;

import net.waseemhassan.assertions.contracts.Assertions;

public class AssertionsProxy<Factory extends AssertionsFactory> implements Assertions {
    private AssertionsBase assertions;
    private Factory assertionFactory;

    public AssertionsProxy() {
        assertions = assertionFactory.getDefaultAssertionsInstance();
    }

    @Override
    public Assertions throwsException(Class exceptionType) {
        return assertions.throwsException(exceptionType);
    }

    @Override
    public Assertions isEqualTo(Object... expected) {
        return assertions.isEqualTo(expected);
    }

    @Override
    public Assertions isTrue() {
        return assertions.isTrue();
    }

    @Override
    public Assertions isFalse() {
        return assertions.isFalse();
    }

    @Override
    public void doAssert() throws Exception {
        assertions.doAssert();
    }

    @Override
    public Assertions useObjectMapper() {
        return assertions.useObjectMapper();
    }

    protected void setResult(Object[] result) {
        assertions.setResult(result);
    }
}