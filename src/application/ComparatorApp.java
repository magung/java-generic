package application;

import java.util.Arrays;
import java.util.Comparator;

import data.Person;

public class ComparatorApp {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Budi", "Indonesia"),
            new Person("Agung", "Indonesia"),
            new Person("Joko", "Indonesia"),
        };
        System.out.println(Arrays.toString(people));
    
        Comparator<Person> comparator = new Comparator<Person>() {
    
            @Override
            public int compare(Person o1, Person o2) {
                
                return o1.getName().compareTo(o2.getName());
            }
            
        };
    
        Arrays.sort(people, comparator);

        System.out.println(Arrays.toString(people));
    
    }
    

}
