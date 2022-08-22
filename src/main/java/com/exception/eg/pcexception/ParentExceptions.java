package com.exception.eg.pcexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ParentExceptions {

    /* If overridden method is throwing and Exception
       then its mandatory for Parent to throw an Exception (eg. IOException) */

    public void getInfo() throws Exception{

        FileReader file = new FileReader("C:\\sumit.txt");
        System.out.println("I'm in Parent Method");
    }

    //Checked Exceptions
    /**
     * When parent method is throwing one of more checked or Unchecked Exception
     * child should at least throw one checked Exception
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void method() throws IOException{
        FileReader file = new FileReader("C:\\sumit.txt");
        System.out.println("I'm in Parent Method");
    }

    // Un-Checked Exception
    /**
     * overridden methods of parent & child can throw any Un-Checked Exceptions
     * No any relation is mandatory for it. Generic Exception can't be thrown
     * @throws NullPointerException
     * @throws IllegalArgumentException
     */
    public void unChecked() throws NullPointerException, IllegalArgumentException {
       String s = null;
       System.out.println(s.toLowerCase());
    }
}
