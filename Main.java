abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract void getRole();

    public void showInfo() {
        System.out.println("Employee Name: " + name);
    }
}

class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void getRole() {
        System.out.println("Role: Manager");
    }
}

class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }

    @Override
    public void getRole() {
        System.out.println("Role: Developer");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Manager("Alice");
        Employee e2 = new Developer("Bob");

        e1.showInfo();
        e1.getRole();

        System.out.println();

        e2.showInfo();
        e2.getRole();
    }
}
