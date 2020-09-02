package homework.heroes;

public interface RoyalHero {
    static void kick(AbstractHero a, AbstractHero b) {
        b.setHp(Math.max((
                        b.getHp() - (int) (Math.random() * (a.getPower() + 1))
                ), 0)
        );
    }
}
