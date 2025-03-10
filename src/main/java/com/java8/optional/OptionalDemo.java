package com.java8.optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        //Use Optional.of() when the value is guaranteed to be non-null (to avoid unnecessary checks)
        //Use Optional.ofNullable() when the value might be null to prevent NullPointerExceptions

        Optional<String> str = Optional.of("Hello");
        System.out.println(str.get());

        Optional<String> str2 = Optional.of(null); // NullPointerException
        System.out.println(str2.get());
        Optional<String> str3 = Optional.ofNullable(null); // it returns Optional.empty()

    }
}
