package application;

import java.util.Arrays;

import data.Person;

public class ComparebleApp {
    public static void main(String[] args) {
     
        Person[] people = {
            new Person("Agung", "Indonesia"),
            new Person("Budi", "Indonesia"),
            new Person("Joko", "Indonesia"),
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));

    }
}
