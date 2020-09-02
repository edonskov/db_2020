package homework.heroes.classes;

import homework.heroes.AbstractHero;

public class Hobbit extends AbstractHero {

    public Hobbit() {
        super("Hobbit", 0, 3);
    }

    @Override
    public void kick(AbstractHero c) {
        toCry();
        c.counterKick(this);
    }

    @Override
    public void counterKick(AbstractHero x) {
        toCry();
    }

    private void toCry() {
        System.out.println(this.getName() + ": \"AAAAA\"");
    }
}
