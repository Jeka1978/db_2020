package com.deutsche.services.good_example;

import demo.Person;

/**
 * @author Evgeny Borisov
 */
public class MainService {

    private HelperService helperService;

    public MainService(HelperService helperService) {
        this.helperService = helperService;

    }

    public void doWork() {

        System.out.println("working...");
        helperService.help();
    }
}
