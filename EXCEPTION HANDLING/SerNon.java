package com.exception;

import java.io.*;

public class SerNon implements Serializable {
    private static final long serialVersionUID = 11111L;
    transient int empAge; 
    static int depId; 
    public int empId;
    public String empName;

    public SerNon(int empAge, int empId, String empName, int depId) {
        this.empAge = empAge;
        this.empId = empId;
        this.empName = empName;
        this.depId = depId; 
    }

    public static void printdata(SerNon obj) {
        System.out.println("Emp ID: " + obj.empId);
        System.out.println("Emp Name: " + obj.empName);
        System.out.println("Emp Age (transient): " + obj.empAge); 
        System.out.println("Dep ID (static): " + depId); 
    }

    public static class Serialization {
        public static void main(String args[]) {
            SerNon object = new SerNon(22, 1, "Ram", 1001);
            String filename = "file.ser";

            try {
                FileOutputStream file = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(file);
                out.writeObject(object);
                out.close();
                file.close();

                System.out.println("Object has been serialized\nData before Serialization:");
                printdata(object);

                // Changing values after serialization
                object.depId = 2000;
                object.empAge = 30;
                object.empName="jeev";

            } catch (IOException ex) {
                System.out.println("IOException is caught");
            }

            object = null;

            try {
                FileInputStream file = new FileInputStream(filename);
                ObjectInputStream in = new ObjectInputStream(file);
                object = (SerNon) in.readObject();
                in.close();
                file.close();

                System.out.println("\nObject has been deserialized\nData after Deserialization:");
                printdata(object); 

            } catch (IOException | ClassNotFoundException ex) {
                System.out.println("Exception is caught: " + ex.getMessage());
            }
        }
    }
}
