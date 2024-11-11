package com.java.oops;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


/**
 * Interface Vs Abstract class
 *
 * Interface:
 * 	- HAS A capability
 * 	- Serializable as an Interface
 * 	- Assume that we have two classes in your application,
 * 	  which are implementing Serializable interface
 *
 * 		Employee implements Serializable
 *
 * 		Game implements Serializable
 *
 * 	- Here we can't establish any relation through Serializable interface between Employee and Game,
 * 	- which are meant for different purpose.
 * 	- Both are capable of Serializing the state and the comparision ends there.
 *
 * Abstract class:
 * 	- IS A relation
 * 	- Reader is an abstract class.
 * 	- BufferedReader is a Reader
 * 	- FileReader is a Reader
 * 	- FileReader and BufferedReader are used for common purpose : Reading data, and they are related through Reader class.
 *
 */
public class AbstractVsInterface {

    Reader a = new Reader() {
        @Override
        public int read(char[] cbuf, int off, int len) throws IOException {
            return 0;
        }

        @Override
        public void close() throws IOException {

        }
    };

    FileReader f;
    {
        try {
            f = new FileReader("s");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
