/*package com.exception;
import java.io.*;
public class FileWriterr {
	public static void main(String args[]) {
		char b[]=new char[128];
		try {
			
			if (args.length < 2) {
                System.out.println("Please provide input and output file paths as arguments.");
//                return;
            }
			
			FileReader fr=new FileReader(args[0]);
			FileWriter fw=new FileWriter(args[1]);
			
			int count=0;
			int read=0;
			while((read=fr.read(b)) != -1) {
				fw.write(b);
				count += read;
			}
			System.out.println("Total count: "+count+" characters");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
*/
package com.exception;
import java.io.*;

public class FileWriterr {
    public static void main(String args[]) {
        char b[] = new char[128];
        try {
            
            if (args.length < 2) {
                System.out.println("Please provide input and output file paths as arguments.");
                return;
            }

            FileReader fr = new FileReader(args[0]);
            FileWriter fw = new FileWriter(args[1]);

            int count = 0;
            int read = 0;
            while ((read = fr.read(b)) != -1) {
                fw.write(b, 0, read);  
                count += read;
            }
            System.out.println("Total count: " + count + " characters");

            fr.close();
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
