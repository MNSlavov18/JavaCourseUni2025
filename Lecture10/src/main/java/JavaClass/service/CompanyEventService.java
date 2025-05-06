package JavaClass.service;

import JavaClass.data.CompanyEvent;
import JavaClass.data.Employee;

public interface CompanyEventService {
    
    boolean addEmployeeToEvent(CompanyEvent companyEvent, Employee employee);
    void printEmployeeList(CompanyEvent companyEvent);
    void printEmployeesSortedByName(CompanyEvent companyEvent);
    void printEmployeesSortedByAge(CompanyEvent companyEvent);
    void registerEmployees(CompanyEvent companyEvent);
}
