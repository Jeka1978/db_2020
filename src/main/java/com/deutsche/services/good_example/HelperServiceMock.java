package com.deutsche.services.good_example;

/**
 * @author Evgeny Borisov
 */
public class HelperServiceMock implements HelperService {
    @Override
    public void help() {
        System.out.println("MOCK YOU");
    }
}
