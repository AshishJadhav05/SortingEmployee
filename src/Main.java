import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<Employee>();
        Employee e1 = new Employee(1,"Ashish",25000,"fullStackDeveloper");
        Employee e2 = new Employee(2,"Krushna",26000,"javaDeveloper");
        Employee e3 = new Employee(3,"Vaibhav",30000,"frontEndDeveloper");
        Employee e4 = new Employee(4,"Purushottam",30000,"frontEndDeveloper");
        Employee e5 = new Employee(5,"Bhagyashree",25000,"backendDeveloper");
        Employee e6 = new Employee(6,"Rachana",26000,"pythonDeveloper");
        Employee e7 = new Employee(7,"Dharmaraj",25000,"fullStackDeveloper");
        Employee e8 = new Employee(8,"Ganesh",30000,"frontEndDeveloper");
        Employee e9 = new Employee(9,"Narendra",30000,"javaDeveloper");
        Employee e10 = new Employee(10,"Sunidhi",30000,"backendDeveloper");

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);
        employees.add(e9);
        employees.add(e10);

      //  List<Employee> sortedByName = employees.stream()
       //         .sorted((employee1,employee2) -> employee1.getName().compareTo(employee2.getName())).collect(Collectors.toList());

       // System.out.println(sortedByName+"\r");
        Collections.sort(employees, new SortById());
        System.out.println(employees);

    }
}
