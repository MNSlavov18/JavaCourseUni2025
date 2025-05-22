package JavaClass;

import JavaClass.Data.Company;
import JavaClass.Data.Employee;
import JavaClass.Data.Position;
import JavaClass.Service.CompanyService;
import JavaClass.Service.CompanyServiceImpl;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = 
                new Employee("Ivan", LocalDate.of(2000,2,3), Position.SINIOR);
        Employee employee2 =
                new Employee("Jana", LocalDate.of(2000,2,5), Position.MID);
        Employee employee3 =
                new Employee("Georgi", LocalDate.of(2000,1,3), Position.SINIOR);
        Employee employee4 =
                new Employee("Lora", LocalDate.of(2001,2,3), Position.JUNIOR);
        
        Company company = new Company("SAP");
        
        CompanyService companyService = new CompanyServiceImpl();
        companyService.hireEmployee(company, employee1);
        companyService.hireEmployee(company, employee2);
        companyService.hireEmployee(company, employee3);
        companyService.hireEmployee(company, employee4);
        
        companyService.printEmployees(company);
        System.out.println();
        companyService.printEmployeeSortedByBD(company);
        System.out.println();
        companyService.printEmployees(company);
        System.out.println();
        companyService.printEmployeeFilteredByPosition(company, Position.SINIOR);
        System.out.println();
        companyService.employeesName(company)
                .stream()
                .forEach(System.out::println);
        System.out.println();
        System.out.println(companyService.youngestEmployee(company).get());
        
        companyService.addSalaryByPosition(company, Position.JUNIOR, 1000);
        companyService.addSalaryByPosition(company, Position.MID, 2500);
        companyService.addSalaryByPosition(company, Position.MID, 3500);
        companyService.addSalaryByPosition(company, Position.SINIOR, 5500);
        
        System.out.println();
        companyService.printSalaryByPosition(company);
    }
}