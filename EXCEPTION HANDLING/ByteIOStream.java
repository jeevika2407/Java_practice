package com.exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteIOStream {
    public static void main(String args[]) {
       
        if (args.length < 2) {
            System.out.println("Usage: java com.exception.ByteIOStream <input file> <output file>");
            return;
        }

        byte[] b = new byte[128]; 
        try {
            FileInputStream fis = new FileInputStream(args[0]);
            FileOutputStream fos = new FileOutputStream(args[1]);

            System.out.println("Bytes available: " + fis.available());
            int count = 0;
            int read;
            
            while ((read = fis.read(b)) != -1) { 
                fos.write(b, 0, read);
                count += read;
            }
            
            System.out.println("Total bytes copied: " + count);

            fis.close();
            fos.close();
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
