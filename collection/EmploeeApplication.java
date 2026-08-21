/*5.Sort Employees Using Comparable
Create an Employee class with:
6.id
7.name
salary
Implement Comparable<Employee> and sort employees based on salary in ascending order. */

import java.util.*;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private long salary;

    Employee() {
    }

    Employee(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.salary > o.salary) {
            return 1;
        } else if (this.salary < o.salary) {
            return -1;
        } else {
            return 0;
        }
    }
}

class EmploeeApplication {
    public static void main(String[] args) {

        List<Employee> al = new ArrayList<>();

        al.add(new Employee(1, "Latika", 1000));
        al.add(new Employee(2, "Vinod", 4000));
        al.add(new Employee(3, "Patil", 3000));
        al.add(new Employee(4, "Laoo", 2000));

        System.out.println("Before Sorting:");

        for (Employee e : al) {
            System.out.println(
                e.getId() + "\t" +
                e.getName() + "\t" +
                e.getSalary()
            );
        }

        Collections.sort(al);

        System.out.println("\nAfter Sorting (Salary Ascending):");

        for (Employee e : al) {
            System.out.println(
                e.getId() + "\t" +
                e.getName() + "\t" +
                e.getSalary()
            );
        }
    }
}