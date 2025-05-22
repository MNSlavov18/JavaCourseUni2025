package employees.service;

import employees.data.Company;
import employees.data.EmployeeContract;
import employees.data.Position;

import java.util.Comparator;
import java.util.TreeSet;

public class CompanyServiceImpl implements CompanyService {
    @Override
    public void putBaseSalaryByPosition(Company company, Position position, double baseSalary) {
        company.getBaseSalaryByPosition()
                .putIfAbsent(position, baseSalary); // PutifAbsent za da go dobavq samo kogato go nqma
    }

    @Override
    public void printBaseSalaryByPosition(Company company) {
        company.getBaseSalaryByPosition()
                .entrySet()
                .stream()
                .forEach(System.out::println);
    }

    @Override
    public void hireEmployee(Company company, EmployeeContract employeeContract) {
        company.getContracts().add(employeeContract);
    }

    @Override
    public void printContracts(Company company) {
        company.getContracts()
                .stream()
                .forEach(System.out::println);
    }

    @Override
    public void printContractsByDate(Company company) {
        TreeSet<EmployeeContract> contractTreeSet  =
                new TreeSet<>(Comparator.comparing(EmployeeContract::getSinged)
                                .thenComparing(EmployeeContract::getId));
        contractTreeSet.addAll(company.getContracts());
        contractTreeSet.stream()
                .forEach(System.out::println);
    }
}
