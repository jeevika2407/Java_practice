package com.collections;

import java.util.*;

class Person implements Comparable<Person> {
    String firstName, lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Person other) {
        return this.firstName.compareTo(other.firstName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

public class Col06 {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Priscilla", "Wagner"));
        people.add(new Person("Tom", "Parker"));
        people.add(new Person("Elvis", "Presley"));

        Collections.sort(people);

        System.out.println("Sorted people by first name:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
