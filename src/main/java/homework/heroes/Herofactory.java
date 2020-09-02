package homework.heroes;

import java.util.Random;

public class Herofactory {

    public static AbstractHero createHero()  {
        try {
            return (AbstractHero) Class.
                    forName(
                            "homework.heroes.classes." +
                                    Heroes.values()[new Random().nextInt(Heroes.values().length)])
                    .newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
