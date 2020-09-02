package homework.heroes.classes;

import homework.heroes.AbstractHero;
import homework.heroes.RoyalHero;

public class Knight extends AbstractHero implements RoyalHero {

    String weapon = "Axe";

    public Knight() {
        super("Knight", (int) (Math.random() * 10) + 2, (int) (Math.random() * 10) + 2);
    }

    @Override
    public void kick(AbstractHero c) {
        RoyalHero.kick(this, c);
        c.counterKick(this);
    }

    @Override
    public void counterKick(AbstractHero x) {
        RoyalHero.kick(this, x);
    }
}
