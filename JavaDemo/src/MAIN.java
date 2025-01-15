package com.coderabbit.demo;

import com.coderabbit.demo.service.SimpleService;

public class MAIN {
    public static void main(String[] args) {
        System.out.println("Happy new year!");
        SimpleService service = new SimpleService();
        service.printMessage();
        System.out.println("Happy new year !!!");
    }
}