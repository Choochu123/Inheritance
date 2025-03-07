package FamilyTree;

import java.util.ArrayList;

public class FamilyTreeMain {

    public static void run() {
//Gen 1
        Person person1 = new Person("Bobbie", "Mexico");

//Gen 2
        person1.addChild(new Person("Susan", "Canada"));
        person1.addChild(new Person("Jill", "Canada"));
        person1.addChild(new Person("Bobette", "Zimbabwe"));

//Gen 3
        person1.children.get(0).addChild(new Person("Zain", "Zimbabwe"));/* adding to Susan */
        person1.children.get(2).addChild(new Person("Bob III", "Belise"));
        person1.children.get(2).addChild(new Person("Jasmine", "Canada"));
//Gen 4
        person1.children.get(0).children.get(0).addChild(new Person("Zain Jr", "Mexico"));
        person1.children.get(0).children.get(0).addChild(new Person("Zainette", "Mexico"));
        person1.children.get(2).children.get(0).addChild(new Person("Bob IV", "Belise"));
        person1.children.get(2).children.get(1).addChild(new Person("Zaiesha", "Canada"));
        person1.children.get(2).children.get(1).addChild(new Person("Steve", "USA"));

    }//run

    public static int countFamily(Person ptemp) {
        int num = 0;

        return num;
    }//countFamily

    public static void printCanadian(Person ptemp) {

    }//printCanadian


}//FamilyTreeMain
