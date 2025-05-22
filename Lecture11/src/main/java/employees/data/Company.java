package employees.data;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Company {
    private long id;
    private String name;
    private EnumMap<Position, Double> baseSalaryByPosition;
    private Set<EmployeeContract> contracts;

    public Company(long id, String name) {
        this.id = id;
        this.name = name;
        this.baseSalaryByPosition = new EnumMap<>(Position.class);
        this.contracts = new HashSet<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnumMap<Position, Double> getBaseSalaryByPosition() {
        return baseSalaryByPosition;
    }

    public void setBaseSalaryByPosition(EnumMap<Position, Double> baseSalaryByPosition) {
        this.baseSalaryByPosition = baseSalaryByPosition;
    }

    public Set<EmployeeContract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<EmployeeContract> contracts) {
        this.contracts = contracts;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return id == company.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
