package clas;

import java.util.UUID;

public class ClasMain {
    public static void main(String[] args) {
        Person tom = new Person();
        tom.id = UUID.randomUUID().toString();
        tom.name = "Tom";
        tom.displayInfo();
    }
}

class Person {
    String name;
    String id;
    void displayInfo() {
        System.out.printf("Name: %s \tId: %d\n",name, id);
    }
}