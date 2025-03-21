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
        //Susan
        person1.children.get(0).addChild(new Person("Zain", "Zimbabwe"));/* adding to Susan */
        //Bobette
        person1.children.get(2).addChild(new Person("Bob III", "Belise"));
        person1.children.get(2).addChild(new Person("Jasmine", "Canada"));
        //Jill
        person1.children.get(1).addChild(new Person("Jonathan", "Canada"));
        person1.children.get(1).addChild(new Person("Zev", "Canada"));

//Gen 4
        //Zain
        person1.children.get(0).children.get(0).addChild(new Person("Zain Jr", "Mexico"));
        person1.children.get(0).children.get(0).addChild(new Person("Zainette", "Mexico"));
        //BobIII
        person1.children.get(2).children.get(0).addChild(new Person("Bob IV", "Belise"));
        //Jasmine
        person1.children.get(2).children.get(1).addChild(new Person("Zaiesha", "Canada"));
        person1.children.get(2).children.get(1).addChild(new Person("Steve", "USA"));
        //Jonathan
        person1.children.get(1).children.get(0).addChild(new Person("Elliott", "Spain"));
        //Zev
        person1.children.get(1).children.get(1).addChild(new Person("Sorata", "Japan"));

//Gen 5
        person1.children.get(1).children.get(1).children.get(0).addChild(new Person("Aaron", "North Korea"));

        printFamily(person1, 1);
        System.out.println("Whole family size: " + countFamily(person1));

        printCanadian(person1, 1);

    }//run

    public static int countFamily(Person ptemp) {
        if (!ptemp.children.isEmpty()) {
            int num = 0;
            for (int i = 0; i < ptemp.children.size(); i++) {
                num += countFamily(ptemp.children.get(i));
            }
            return num + 1;
        } else {
            return 1;
        }

    }//countFamily

    public static void printCanadian(Person ptemp, int index) {
        if (index == 1) {
            System.out.println("Canadians in family");
        }
        if (!ptemp.children.isEmpty()) {
            for (int i = 0; i < ptemp.children.size(); i++) {
                if (ptemp.children.get(i).country.equalsIgnoreCase("Canada")) {
                    String spacing = "";
                    for (int j = 0; j < index; j++) spacing += " ";
                    {
                        System.out.println(spacing + ptemp.children.get(i).name);
                    }
                    printCanadian(ptemp.children.get(i),index+1 );
                }

            }

        }
    }//printCanadian

    public static void printFamily(Person ptemp, int index) {
        if (index == 1) {
            System.out.println("Root:" + ptemp.name);
        }
        if (!ptemp.children.isEmpty()) {
            for (int i = 0; i < ptemp.children.size(); i++) {
                String spacing = "";
                for (int j = 0; j <= index; j++) spacing += " ";
                {
                    System.out.println(spacing + ptemp.children.get(i).name);
                    printFamily(ptemp.children.get(i), index + 1);
                }
            }
        }
//got help from zev for this part
    }//printFamily



}//FamilyTreeMain
