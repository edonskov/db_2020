package homework.heroes;

import lombok.Data;

@Data
public abstract class AbstractHero implements Hero {
    public String name;
    public int power;
    public int hp;

    public AbstractHero(String name, int power, int hp) {
        this.name = name;
        this.power = power;
        this.hp = hp;
    }

    @Override
    public void kick(AbstractHero c) {
        c.setHp(Math.max(c.getHp() - getPower(), 0));
        c.counterKick(this);
    }

    @Override
    public void counterKick(AbstractHero x) {
        x.setHp(Math.max(x.getHp() - getPower(), 0));
    }

    @Override
    public boolean isAlive() {
        return getHp() > 0;
    }

    public String toString() {
        return "" + (isAlive() ? "ALIVE" : "DEAD") + " hero(" + this.getName() + ", power=" + this.getPower() + ", hp=" + this.getHp() + ")";
    }
}
