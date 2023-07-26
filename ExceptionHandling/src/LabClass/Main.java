package LabClass;

import java.lang.reflect.Field;
import java.util.Arrays;

class ObjectSorter {

    static <T> void sort(T[] objects) {
        Arrays.sort(objects, (obj1, obj2) -> {
            try {
                Field field1 = obj1.getClass().getDeclaredFields()[0];
                Field field2 = obj2.getClass().getDeclaredFields()[0];
                return field1.getName().compareTo(field2.getName());
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        });
    }
}

public class Main {

    public static void main(String[] args) {
        // Create an array of Person objects
        Person[] people = new Person[] {
                new Person("Rafid", 25),
                new Person("Ragib", 30),
                new Person("Sakib", 20)
        };

        // Sort the array of Person objects
        ObjectSorter.sort(people);

        // Print the sorted array of Person objects
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}

