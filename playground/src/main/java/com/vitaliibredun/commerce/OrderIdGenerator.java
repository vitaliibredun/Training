package com.vitaliibredun.commerce;

import org.apache.commons.lang3.RandomStringUtils;

public class OrderIdGenerator {
    private final int length;

    public OrderIdGenerator(int length) {
        this.length = length;
    }

    public String generate() {
        return RandomStringUtils.randomNumeric(length);
    }

    public static String generateDefault() {
        return RandomStringUtils.randomNumeric(3);
    }
}
