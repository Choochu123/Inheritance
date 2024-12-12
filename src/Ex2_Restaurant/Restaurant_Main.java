package Ex2_Restaurant;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Restaurant_Main {
    public static void run() {
        ArrayList<Employee> allEmp = new ArrayList<>();

//        Employee a = new Employee();
//        System.out.println(a.getName());
        allEmp.add(new Manager(50000));
        allEmp.add(new Manager(40000));
        allEmp.add(new Worker(15.00));
        allEmp.add(new Worker(18.50));

        for (Employee e:allEmp) {
            System.out.println(e.getPay());
        }

    }
}
