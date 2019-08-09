package mygroup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;




public class TestEmployee {

    public static Logger logger = LoggerFactory.getLogger(TestEmployee.class);

    public static void main(String args []){

        Employee e1 = new Employee(32, "Liang9", 4200, "climate");
        Employee e2 = new Employee(20, "Liang3", 1200, "climate");
        Employee e3 = new Employee(25, "Liang2", 5200, "climate");
        Employee e4 = new Employee(32, "Liang1", 4200, "math");
        Employee e5 = new Employee(78, "Liang4", 9200, "math");

        ArrayList<Employee> mylist = new ArrayList();

        Collections.addAll(mylist,e1,e2,e3,e4,e5);
//        Collections.sort(mylist, (o1,o2)->o1.getSalary()-o2.getSalary());
        Collections.sort(mylist, Comparator.comparing(Employee::getAge).thenComparing(Employee::getSalary).thenComparing(Employee::getName));

//        Collections.sort(mylist, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        System.out.println(mylist);

        ArrayList<String> cars = new ArrayList<>();

        cars.add("volvo");
        cars.add("nissan");
        cars.add("honda");
        cars.add("mazda");

        Collections.sort(cars);


        for (String car: cars
             ) {
            System.out.println(car);
        }




    }
}
