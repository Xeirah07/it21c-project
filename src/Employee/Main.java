package Employee;

import java.time.LocalDate;

public class Main {
	
	
public static void main(String[] args) {
		
		Employee employee1 = new Employee ("Roberta Petrus", 50000, LocalDate.parse("2021-04-01"));
        Employee employee2 = new Employee ("Loyd Blair", 70000, LocalDate.parse("2015-04-01"));
        Employee employee3 = new Employee ("Magdalena Artemon", 50000, LocalDate.parse("2011-01-15"));
        
       
       System.out.println(employee1.name + "     " + employee1.salary +" " + employee1.hiredate);
       System.out.println(employee2.name + "         " + employee2.salary +" " + employee2.hiredate);
       System.out.println(employee3.name + "  " + employee3.salary +" " + employee3.hiredate);
}
} 