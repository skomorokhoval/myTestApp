package employee;

/**
 * Created by elizavetaskomorohova on 18.02.18.
 */
public class EmployeeTest {
    public static void main (String[] args){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Ivan Ivanov", 7500, 1987,12,15);
        staff[1] = new Employee("Petr Petrov", 9000, 1988,11,1);
        staff[2] = new Employee("Sidr Sidorov", 8700, 1990,3,15);
        for (Employee e:staff)
            e.raiseSalary(5);
        for (Employee e:staff)
            System.out.println("name= " +e.getName() + ", salary = "+e.getSalary() + ", hireday = "+e.getHireDay());

    }
}
