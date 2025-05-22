package JavaClass;

import employees.data.Company;
import employees.data.Employee;
import employees.data.EmployeeContract;
import employees.data.Position;
import employees.service.CompanyService;
import employees.service.CompanyServiceImpl;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"Ivan", LocalDate.of(1999,12,12));
        Employee employee2 = new Employee(2,"Georgi", LocalDate.of(2000,12,12));
        Employee employee3 = new Employee(3,"Ivana", LocalDate.of(2001,12,12));
        Employee employee4 = new Employee(3,"Gergana", LocalDate.of(2003,12,12));

        EmployeeContract employeeContract = 
                new EmployeeContract(LocalDate.of(2025,5,7),employee,Position.REGULAR);    
        EmployeeContract employeeContract2 = 
                new EmployeeContract(LocalDate.of(2025,5,6),employee2,Position.REGULAR);    
        EmployeeContract employeeContract3 = 
                new EmployeeContract(LocalDate.of(2025,5,7),employee3,Position.SENIOR);
        
        Company company = new Company(1,"SAP");

        CompanyService companyService = new CompanyServiceImpl();
        
        companyService.hireEmployee(company, employeeContract);
        companyService.hireEmployee(company, employeeContract);
        companyService.hireEmployee(company, employeeContract2);
        companyService.hireEmployee(company, employeeContract3);

        companyService.printContracts(company);
        System.out.println();
        
        companyService.printContractsByDate(company);
        System.out.println();
        
        
        companyService.putBaseSalaryByPosition(company,Position.JUNIOR,1500);
        companyService.putBaseSalaryByPosition(company,Position.REGULAR,2500);
        companyService.putBaseSalaryByPosition(company,Position.SENIOR,4000);
        
        companyService.printBaseSalaryByPosition(company);
      
    }
}