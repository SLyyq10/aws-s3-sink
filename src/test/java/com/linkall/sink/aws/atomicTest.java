package com.linkall.sink.aws;

import java.util.concurrent.atomic.AtomicInteger;

public class atomicTest {

    private static final AtomicInteger num = new AtomicInteger(0);

    public static void main(String[] args) {
        num.getAndAdd(1);
        int val = 0;
        if(num.intValue() > val){
            System.out.println(num.intValue() == val);
        }
    }

}
