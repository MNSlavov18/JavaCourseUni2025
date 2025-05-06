package JavaClass.data;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CompanyEvent {
    
    private long id;
    private String name;
    private ArrayList<Employee>  employees;

    public CompanyEvent(long id, String name) {
        this.id = id;
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
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

    @Override
    public String toString() {
        return "CompanyEvent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
