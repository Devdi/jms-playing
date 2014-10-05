package com.devdi.webapp;

import org.junit.Test;

import javax.naming.OperationNotSupportedException;

/**
 * Created by devdi on 3/1/14.
 */
public class HomeControllerTest {

    @Test(expected = OperationNotSupportedException.class)
    public void test() throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }
}
