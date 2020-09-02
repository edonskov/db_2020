package homework.heroes.classes;

import homework.heroes.AbstractHero;
import lombok.Data;

public class Elf extends AbstractHero {

    public Elf() {
        super("Elf", 10, 10);
    }

    @Override
    public void kick(AbstractHero c) {
        elfPower(c);
        super.kick(c);
    }

    @Override
    public void counterKick(AbstractHero x) {
        elfPower(x);
    }

    private void elfPower(AbstractHero a) {
        if (getPower() > a.getPower()) {
            a.setHp(0);
        } else {
            a.setPower(a.getPower() - 1);
        }
    }
}
