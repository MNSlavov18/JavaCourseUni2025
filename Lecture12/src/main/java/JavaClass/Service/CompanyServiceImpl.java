package JavaClass.Service;

import JavaClass.Data.Company;
import JavaClass.Data.Employee;
import JavaClass.Data.Position;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class CompanyServiceImpl implements CompanyService {

    @Override
    public boolean hireEmployee(Company company, Employee employee) {
        return company.getEmployees().add(employee);
    }

    @Override
    public void printEmployees(Company company) {
        company.getEmployees()
                .stream()
                .forEach(System.out::println);
    }

    @Override
    public void printEmployeeSortedByBD(Company company) {
        company.getEmployees()
                .stream()
                .sorted(Comparator.comparing(Employee::getDob))
                .forEach(System.out::println);
    }

    @Override
    public void printEmployeeFilteredByPosition(Company company, Position position) {
        company.getEmployees()
                .stream()
                .filter(employee -> employee.getPosition().equals(position))
                .sorted(Comparator.comparing(Employee::getName).reversed()
                        .thenComparing(Employee::getUuid))
                .forEach(System.out::println);
    }

    @Override
    public Set<String> employeesName(Company company) {
        return company.getEmployees()
                .stream()
                .map(employee -> employee.getName())
                .collect(Collectors.toSet());
    }

    @Override
    public Optional<Employee> youngestEmployee(Company company) {
        return company.getEmployees()
                .stream()
                .max(Comparator.comparing(Employee::getDob));
    }

    @Override
    public void addSalaryByPosition(Company company, Position position, double salary) {
        company.getBaseSalaryByPosition().putIfAbsent(position, salary);
    }

    @Override
    public void printSalaryByPosition(Company company) {
        company.getBaseSalaryByPosition()
                .entrySet()
                .stream()
                .map(entry->entry.getValue())
                .filter(salary -> salary > 2500)
                .forEach(System.out::println);
    }
}
