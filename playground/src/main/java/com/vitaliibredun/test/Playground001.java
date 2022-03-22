package com.vitaliibredun.test;

import org.apache.commons.lang3.StringUtils;


public class Playground001 {
    public static void main(String[] args) {
        validate(args);
        String name = trimAndCapitalize(args[0]);
        sayHi(name);
    }

    private static void validate(String[] args) {
        if (args.length == 0)
            throw new IllegalStateException("Мне нужно имя");
        if (StringUtils.isBlank(args[0])) {
            throw new IllegalArgumentException("Имя пустое");
        }
    }

    static void sayHi(String name) {
        System.out.println("Hey, " + name);
    }

    static String trimAndCapitalize(String name) {
        String trim = StringUtils.trim(name);
        return StringUtils.capitalize(trim);
    }
}
