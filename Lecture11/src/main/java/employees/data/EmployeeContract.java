package employees.data;

import java.time.LocalDate;
import java.util.Objects;

public class EmployeeContract {
    private final long id;
    private LocalDate singed;
    private Employee employee;
    private Position position;
    private static long numberOfContracts = 0;

    public EmployeeContract(LocalDate singed, Employee employee, Position position) {
        numberOfContracts++;
        this.id = numberOfContracts;
        this.singed = singed;
        this.employee = employee;
        this.position = position;
    }

    public long getId() {
        return id;
    }

    public LocalDate getSinged() {
        return singed;
    }

    public void setSinged(LocalDate singed) {
        this.singed = singed;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public static long getNumberOfContracts() {
        return numberOfContracts;
    }

    public static void setNumberOfContracts(long numberOfContracts) {
        EmployeeContract.numberOfContracts = numberOfContracts;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeContract that = (EmployeeContract) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "EmployeeContract{" +
                "id=" + id +
                ", singed=" + singed +
                ", employee=" + employee +
                ", position=" + position +
                '}';
    }
}
