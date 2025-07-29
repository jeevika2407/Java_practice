package com.exception;

import java.io.*;

public class SerNonSer implements Serializable {
    public int empId;
    public String empName;

    public SerNonSer(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public static class Serialization {
        public static void main(String args[]) {
            SerNonSer object = new SerNonSer(1, "Ram");
            String filename = "file.ser";

            try {
                FileOutputStream file = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(file);
                out.writeObject(object);
                out.close();
                file.close();

                System.out.println("Object has been serialized");

            } catch (IOException ex) {
                System.out.println("IOException is caught");
            }

            SerNonSer object1 = null;

            try {
                FileInputStream file = new FileInputStream(filename);
                ObjectInputStream in = new ObjectInputStream(file);

                object1 = (SerNonSer) in.readObject();
                in.close();
                file.close();

                System.out.println("Object has been deserialized");
                System.out.println("Emp ID: " + object1.empId);
                System.out.println("Emp Name: " + object1.empName);
                
                

            } catch (IOException | ClassNotFoundException ex) {
                System.out.println("Exception is caught: " + ex.getMessage());
            }
            
        }
    }
}



/*package com.exception;

import java.io.*;

public class SerNonSer implements Serializable {
    private static final long serialVersionUID = 1L;
    private int empId;
    private String empName;

    public SerNonSer(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Emp ID: " + empId + ", Emp Name: " + empName;
    }

    public static class Serialization {
        public static void main(String args[]) {
            SerNonSer object = new SerNonSer(1, "Ram");
            String filename = "file.ser";

            serializeObject(object, filename);
            SerNonSer deserializedObject = deserializeObject(filename);

            if (deserializedObject != null) {
                System.out.println("Deserialized Object: " + deserializedObject);
            }
        }

        public static void serializeObject(SerNonSer object, String filename) {
            try (FileOutputStream file = new FileOutputStream(filename);
                 ObjectOutputStream out = new ObjectOutputStream(file)) {
                out.writeObject(object);
                System.out.println("Object has been serialized");
            } catch (IOException ex) {
                System.out.println("IOException during serialization: " + ex.getMessage());
            }
        }

        public static SerNonSer deserializeObject(String filename) {
            SerNonSer object = null;
            try (FileInputStream file = new FileInputStream(filename);
                 ObjectInputStream in = new ObjectInputStream(file)) {
                object = (SerNonSer) in.readObject();
                System.out.println("Object has been deserialized");
            } catch (IOException | ClassNotFoundException ex) {
                System.out.println("Exception during deserialization: " + ex.getMessage());
            }
            return object;
        }
    }
}
*/
