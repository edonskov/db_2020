package homework.exams_generation;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RandomUtil {

    private static Random random = new Random();

    public static double getValueByDifficult(Difficult difficult) {
        return (double) ((int) (Math.random() * difficult.getDifficultRate() * 100)) / 10;
    }

    public static <T> T randomItem(List<T> list) {
        return list.get(random.nextInt(list.size()));
    }

    public static Operator randomOperator() {
        return randomItem(Arrays.asList(Operator.values()));
    }
}