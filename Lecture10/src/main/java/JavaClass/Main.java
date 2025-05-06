package JavaClass;

import JavaClass.data.CompanyEvent;
import JavaClass.data.Employee;
import JavaClass.data.Position;
import JavaClass.service.CompanyEventService;
import JavaClass.service.CompanyEventServiceImpl;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee(1,"Ivanov",
                Position.SENIOR, LocalDate.of(2002,1,1));
        Employee employee2 = new Employee(2,"Ganchevz",Position.REGULAR,
                LocalDate.of(2003,6,1));
        Employee employee3 = new Employee(3,"Slavov",Position.JUNIOR ,
                LocalDate.of(2004,9,14));

        CompanyEvent companyEvent = new CompanyEvent(1,"Party");
        CompanyEventService companyEventService = new CompanyEventServiceImpl();
        
        companyEventService.addEmployeeToEvent(companyEvent,employee);
        companyEventService.addEmployeeToEvent(companyEvent,employee2);
        companyEventService.addEmployeeToEvent(companyEvent,employee3);
        
        companyEventService.printEmployeesSortedByName(companyEvent);
        System.out.println();
        companyEventService.printEmployeesSortedByName(companyEvent);
        System.out.println();
        companyEventService.printEmployeesSortedByAge(companyEvent);
        System.out.println();
    }
}