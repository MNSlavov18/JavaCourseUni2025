package JavaClass.Data;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Employee {
    private UUID uuid;
    private String name;
    private LocalDate dob;
    private Position position;

    public Employee(String name, LocalDate dob, Position position) {
        this.uuid = UUID.randomUUID() ;
        this.name = name;
        this.dob = dob;
        this.position = position;
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position     position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(uuid, employee.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(uuid);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", position=" + position +
                '}';
    }
}
