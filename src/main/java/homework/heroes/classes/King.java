package homework.heroes.classes;

import homework.heroes.AbstractHero;
import homework.heroes.RoyalHero;

public class King extends AbstractHero {
    public King() {
        super("King", (int) (Math.random() * 10) + 5, (int) (Math.random() * 10) + 5);
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
