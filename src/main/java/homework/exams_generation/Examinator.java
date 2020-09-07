package homework.exams_generation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static homework.exams_generation.Difficult.*;
import static homework.exams_generation.RandomUtil.getValueByDifficult;
import static homework.exams_generation.RandomUtil.randomOperator;

/**
 * @author Evgeny Borisov
 */
public class Examinator {
    private double value1;
    private double value2;
    Operator operator;

    public List<Exercise> generate(int amount, Difficult difficult) {
        return Stream.generate(() -> null)
                .limit(amount)
                .map((n) -> {
                    value1 = getValueByDifficult(difficult);
                    value2 = getValueByDifficult(difficult);
                    operator = randomOperator();
                    return new Exercise(
                            value1,
                            value2,
                            operator.doMathOperation(value1,value2),
                            operator
                    );
                })
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        new Examinator().generate(10, HARD)
                .forEach(System.out::println);
    }
}
