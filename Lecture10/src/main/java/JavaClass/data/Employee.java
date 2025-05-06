package JavaClass.data;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private Position position;

    public Employee(int id, String name,Position position, LocalDate dateOfBirth ) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.dateOfBirth = dateOfBirth;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", position=" + position +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public int compareTo(Employee o) {
        return this.getDateOfBirth().compareTo(o.getDateOfBirth());
    }
}
