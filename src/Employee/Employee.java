package Employee;

import java.time.LocalDate;
public class Employee {

	String name;
    int salary;
    LocalDate hiredate;
    
    Employee(String name, int salary, LocalDate hiredate){
        this.name= name;
        this.salary= salary;
        this.hiredate= hiredate;
    }
     
   
}
