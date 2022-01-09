package ArrayList;

import java.util.ArrayList;
import java.util.List;

class Employee{
    private String id;
    private String name;
    private String city;

    public Employee(String id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

public class Test{
    public static void main(String[] args) {

        Employee e1 = new Employee("101","John","London");
        Employee e2 = new Employee("102","Peter","Dubai");
        Employee e3 = new Employee("103","Carlos","New York");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        System.out.println("All employees: ");
        System.out.println(employeeList);

    }
}