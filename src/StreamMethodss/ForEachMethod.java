package StreamMethodss;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethod {

    public static void main(String[] args) {
        List<Employee> emp=new ArrayList<>();
        emp.add(new Employee("Ganesh",12000.0));
        emp.add(new Employee("Rajesh",13001.0));
        emp.add(new Employee("kamesh",14005.0));
        emp.add(new Employee("Sanjay",13000.0));
        emp.add(new Employee("Ajay",17111.0));
        emp.add(new Employee("Piyush",21000.0));
        emp.add(new Employee("Sohel",18000.0));


        emp.stream().filter(i->(int)i.salary%2==0).forEach(System.out::println);

    }
}
class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}