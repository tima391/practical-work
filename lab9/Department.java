package lab9;

import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent {
    private List<OrganizationComponent> components = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void add(OrganizationComponent component) {
        components.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public void display(int depth) {
        System.out.println("  ".repeat(depth) + "+ Отдел: " + name);
        for (OrganizationComponent component : components) {
            component.display(depth + 1);
        }
    }

    @Override
    public double getBudget() {
        double totalBudget = 0;
        for (OrganizationComponent component : components) {
            totalBudget += component.getBudget();
        }
        return totalBudget;
    }

    @Override
    public int getEmployeeCount() {
        int count = 0;
        for (OrganizationComponent component : components) {
            count += component.getEmployeeCount();
        }
        return count;
    }

    public void findAndDisplayEmployee(String empName) {
        for (OrganizationComponent component : components) {
            if (component instanceof Employee && component.getName().equalsIgnoreCase(empName)) {
                System.out.println("Найден сотрудник: " + component.getName());
                component.display(0);
            } else if (component instanceof Department) {
                ((Department) component).findAndDisplayEmployee(empName);
            }
        }
    }

    public void listAllEmployees() {
        for (OrganizationComponent component : components) {
            if (component instanceof Employee || component instanceof Contractor) {
                System.out.println(component.getName());
            } else if (component instanceof Department) {
                ((Department) component).listAllEmployees();
            }
        }
    }
}
