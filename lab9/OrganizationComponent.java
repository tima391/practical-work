package lab9;

public abstract class OrganizationComponent {
    protected String name;

    public OrganizationComponent(String name) {
        this.name = name;
    }

    public abstract void display(int depth);
    public abstract double getBudget();
    public abstract int getEmployeeCount();

    public String getName() {
        return name;
    }

    public void add(OrganizationComponent component) {
        throw new UnsupportedOperationException("Операция не поддерживается");
    }
    public void remove(OrganizationComponent component) {
        throw new UnsupportedOperationException("Операция не поддерживается");
    }
}
