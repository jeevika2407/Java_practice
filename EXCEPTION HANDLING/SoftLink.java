package com.exception;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class SoftLink {

    public static void main(String[] args) {
        Path existingFilePath = Paths.get("D:\\com\\exception\\input1.txt");
        Path symLinkPath = Paths.get("D:\\new1.txt");

        try {
           
            Files.createSymbolicLink(symLinkPath, existingFilePath);
            
        } catch (IOException e) {
            System.err.println(e);
        } catch (UnsupportedOperationException e) {
            System.err.println(e);
        }
    }
}
