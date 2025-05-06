package JavaClass.service;

import JavaClass.data.CompanyEvent;
import JavaClass.data.Employee;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;

public class CompanyEventServiceImpl implements CompanyEventService {
    
    @Override
    public boolean addEmployeeToEvent(CompanyEvent companyEvent, Employee employee)
    {
        if(companyEvent.getEmployees().contains(employee)) {
            return false;
        }
       return companyEvent.getEmployees().add(employee);
    }

    @Override
    public void printEmployeeList(CompanyEvent companyEvent) {
        for (Employee employee : companyEvent.getEmployees())
        {
            System.out.println(employee);
        }
    }

    @Override
    public void printEmployeesSortedByName(CompanyEvent companyEvent) {
        companyEvent.getEmployees().sort(Comparator.comparing(Employee::getName));
        printEmployeeList(companyEvent);
    }

    @Override
    public void printEmployeesSortedByAge(CompanyEvent companyEvent) {
        PriorityQueue<Employee> employees = new PriorityQueue<>
                (Comparator.comparing(Employee::getDateOfBirth)
                        //.thenComparing(Employee.getPosition)
                        .thenComparing(Employee::getName));
        employees.addAll(companyEvent.getEmployees());
        while(!employees.isEmpty())
        {
            System.out.println(employees.poll());
        }
    }

    @Override
    public void registerEmployees(CompanyEvent companyEvent) {
        ArrayDeque<Employee> employees = 
                new ArrayDeque<>(companyEvent.getEmployees());
        while(!employees.isEmpty())
        {
            System.out.println(employees.poll());
        }
    }
}
