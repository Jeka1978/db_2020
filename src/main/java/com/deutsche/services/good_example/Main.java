package com.deutsche.services.good_example;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        HelperService helper = new HelperServiceMock();
        MainService mainService = new MainService(helper);
        mainService.doWork();
    }
}
