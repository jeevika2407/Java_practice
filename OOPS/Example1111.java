package com.oops;

class Example1111 {
    public static void concat1(String s1) {
        s1 = s1 + " Ram";
    }

    public static void concat2(StringBuilder s2) {
        s2.append("raj");
    }

    public static void concat3(StringBuffer s3) {
        s3.append("ravi");
    }

    public static void main(String args[]) {
        String s1 = "hello";
        concat1(s1);
        System.out.println("String: " + s1);

        StringBuilder s2 = new StringBuilder("hello ");
        concat2(s2);
        System.out.println("StringBuilder: " + s2);

        StringBuffer s3 = new StringBuffer("hello ");
        concat3(s3);
        System.out.println("StringBuffer: " + s3);
    }
}
