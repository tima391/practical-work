package lab5;

import java.util.*;

public class Character implements Cloneable {
    public String name;
    public int health, strength;
    public Weapon weapon;
    public List<String> skills = new ArrayList<>();

    @Override
    public Character clone() {
        try {
            Character copy = (Character) super.clone();
            copy.weapon = this.weapon.clone(); // Глубокая копия оружия
            copy.skills = new ArrayList<>(this.skills); // Копия списка способностей
            return copy;
        } catch (CloneNotSupportedException e) { return null; }
    }
}