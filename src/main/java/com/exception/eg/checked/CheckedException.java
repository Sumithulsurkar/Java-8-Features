package com.exception.eg.checked;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedException {

    /**
     * Exception which are checked at Compile time
     * If any Method throws an exception then either it should be handled OR should
     * use throws keyword
     * @throws IOException
     */

    static void m() throws IOException {
        try (FileWriter fileWriter = new FileWriter("C:/sumit.txt")) {
        }
    }

    public static void main(String[] args) throws IOException {
        CheckedException ch = new CheckedException();
        ch.m();
    }
}
