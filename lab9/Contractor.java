package lab9;

public class Contractor extends OrganizationComponent {
    private String position;
    private double fixedPayment;

    public Contractor(String name, String position, double fixedPayment) {
        super(name);
        this.position = position;
        this.fixedPayment = fixedPayment;
    }

    @Override
    public void display(int depth) {
        System.out.println("  ".repeat(depth) + "* [КОНТРАКТОР] " + name + " (" + position + ")");
    }

    @Override
    public double getBudget() {
        return 0;
    }

    @Override
    public int getEmployeeCount() {
        return 1;
    }
}