package homework.heroes;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GameManager {

    public static void main(String[] args)  {
        play(5);
    }

    static void play(int numberOfPlayers)  {
        Random rand = new Random();

        List<AbstractHero> players = createPlayers(numberOfPlayers);
        List<AbstractHero> tempList = players.stream().filter(AbstractHero::isAlive).collect(Collectors.toList());

        status(players);
        if (tempList.size() < 2) System.exit(0);

        do {
            AbstractHero hero1 = tempList.get(rand.nextInt(tempList.size()));
            tempList = players.stream().filter(player -> (player.isAlive() && player != hero1)).collect(Collectors.toList());
            AbstractHero hero2 = tempList.get(rand.nextInt(tempList.size()));
            fight(hero1, hero2);
            tempList = players.stream().filter(AbstractHero::isAlive).collect(Collectors.toList());
            status(players);
        } while (tempList.size() > 1);
    }

    private static List<AbstractHero> createPlayers(int numberOfPlayers) {
        return Stream.generate(() -> null)
                .limit(numberOfPlayers)
                .map(n -> Herofactory.createHero())
                .collect(Collectors.toList());
    }

    private static void fight(AbstractHero hero1, AbstractHero hero2) {
        System.out.println("\nFIGHT between " + hero1.toString() + " and " + hero2.toString() + " has began!");
        hero1.kick(hero2);
    }

    private static void status(List<AbstractHero> players) {
        players.forEach(n -> System.out.println(n.toString()));
    }
}
