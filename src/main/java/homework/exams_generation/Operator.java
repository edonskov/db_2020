package homework.exams_generation;

import lombok.RequiredArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public enum Operator {
    PLUS("+") {
        @Override
        public double doMathOperation(double value1, double value2) { return value1 + value2; }
    },MINUS("-") {
        @Override
        public double doMathOperation(double value1, double value2) {
            return value1 - value2;
        }
    },MULTIPLY("*") {
        @Override
        public double doMathOperation(double value1, double value2) {
            return value1 * value2;
        }
    }, DIVIDE("/") {
        @Override
        public double doMathOperation(double value1, double value2) {
            return value1 / value2;
        }
    };

    private final String sign;

    public abstract double doMathOperation(double value1, double value2);
}
