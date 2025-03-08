package com.interviews;

import org.apache.commons.codec.binary.Base64;

import java.io.*;


public class StringToImg {

    public static void main(String[] args) throws IOException {

                //encode image to Base64 String
                File f = new File("H:/encode/sourceImage.png"); //change path of image according to you
                FileInputStream fis = new FileInputStream(f);
                byte byteArray[] = new byte[(int)f.length()];
                fis.read(byteArray);
                String imageString = Base64.encodeBase64String(byteArray);
                //decode Base64 String to image
                FileOutputStream fos = new FileOutputStream("H:/decode/destinationImage.png"); //change path of image according to you
                byteArray = Base64.decodeBase64(imageString);
                fos.write(byteArray);

                fis.close();
                fos.close();
    }
}
