package JavaClass.Data;

import java.util.*;

public class Company {
    private UUID uuid;
    private String name;
    private Set<Employee> employees;
    private Map<Position,Double> baseSalaryByPosition;

    public Company( String name) {
        this.uuid = UUID.randomUUID() ;
        this.name = name;
        this.employees = new HashSet<>();
        this.baseSalaryByPosition = new EnumMap<>(Position.class);
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Map<Position, Double> getBaseSalaryByPosition() {
        return baseSalaryByPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(uuid, company.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(uuid);
    }

    @Override
    public String toString() {
        return "Company{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
