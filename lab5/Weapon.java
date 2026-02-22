package lab5;

public class Weapon implements Cloneable {
    public String name;
    public int damage;
    public Weapon(String n, int d) { this.name = n; this.damage = d; }
    @Override public Weapon clone() { return new Weapon(name, damage); }
}
