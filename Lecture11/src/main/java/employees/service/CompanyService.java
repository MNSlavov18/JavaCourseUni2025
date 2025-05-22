package employees.service;

import employees.data.Company;
import employees.data.Employee;
import employees.data.EmployeeContract;
import employees.data.Position;

public interface CompanyService {
    void putBaseSalaryByPosition(Company company, Position position, double baseSalary);
    void printBaseSalaryByPosition(Company company);
    void hireEmployee(Company company, EmployeeContract employeeContract);
    void printContracts(Company company);
    void printContractsByDate(Company company);
}
