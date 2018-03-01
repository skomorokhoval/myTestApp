package employee;

import java.util.GregorianCalendar;
import java.util.*;

/**
 * Created by elizavetaskomorohova on 18.02.18.
 */
public class Employee {
    private String name;
    private double salary;
    private Date hireDay;
    public Employee (String n, double s,int year, int month, int day)
    {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
        hireDay = calendar.getTime();
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public Date getHireDay(){
        return hireDay;
    }
    public void raiseSalary (double byPercent){
        double raise = this.salary * byPercent/100;
        this.salary+=raise;
    }

}
