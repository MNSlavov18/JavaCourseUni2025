package JavaClass.Service;

import JavaClass.Data.Company;
import JavaClass.Data.Employee;
import JavaClass.Data.Position;

import java.util.Optional;
import java.util.Set;

public interface CompanyService {
    boolean hireEmployee(Company company, Employee employee);
    
    void printEmployees(Company company);
    
    void printEmployeeSortedByBD(Company company);
    
    void printEmployeeFilteredByPosition(Company company, Position position);
    
    Set<String> employeesName(Company company);

    Optional<Employee> youngestEmployee(Company company);
    
    void addSalaryByPosition(Company company, Position position,double salary);
    
    void printSalaryByPosition(Company company);
}
