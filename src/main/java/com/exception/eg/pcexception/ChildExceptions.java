package com.exception.eg.pcexception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ChildExceptions extends ParentExceptions {

      /* Overridden method does not throw 'java.io.IOException'
       Parent method is not throwing any Checked Exception (IOException) */

    //Checked Exceptions
    public void getInfo() throws IOException {
        System.out.println("I'm in Child Method");
    }

    //Checked Exceptions
    /**
     *
     * @throws IOException
     */
    public void method() throws IOException{
        FileReader file = new FileReader("C:\\sumit.txt");
        System.out.println("I'm in Parent Method");
    }

    public void validateUser(int id, String name) throws Exception {
        //if any method throwing any exception, then its caller method also needs to through an exception
        getInfo();
    }

    // Un-Checked Exception
    /**
     * @throws IOException
     */
    public void unChecked() throws IllegalArgumentException {
        String s = null;
        System.out.println(s.toLowerCase());
    }

    public static void main(String[] args) throws IOException {
        /* Its mandatory to caller method to throws an Exception
           if invoking method is throwing an Exception*/
        ChildExceptions ce = new ChildExceptions();
        ce.getInfo();
    }
}
