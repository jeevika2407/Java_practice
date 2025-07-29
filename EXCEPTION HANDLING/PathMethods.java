package com.exception;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMethods {

	public static void main(String[] args) {
		Path p1=Paths.get("C:\\Users\\kirub\\eclipse-workspace\\ExceptionHandling\\src\\com\\exception\\input.txt");
		Path normalizedPath=p1.normalize();
		Path p2=Paths.get("C:\\Users\\kirub\\eclipse-workspace\\ExceptionHandling\\src\\com\\exception\\input.txt");
		System.out.println("NormalizedPath: "+normalizedPath);
		Path subPath=p1.subpath(1, 3);
		System.out.println("SubPath: "+subPath);
		System.out.println("getFileName: "+p1.getFileName());
		System.out.println("getParent: "+p1.getParent());
		System.out.println("getNameCount: "+p1.getNameCount());
		System.out.println("getRoot: "+p1.getRoot());
		System.out.println("isAbsolute: "+p1.isAbsolute());
		System.out.println("isAbsolutePath: "+p1.toAbsolutePath());
		System.out.println("toURI: "+p1.toUri());
		
		if(p1.equals(p2)) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
	}

}
