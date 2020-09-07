package homework.exams_generation;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Difficult {
    EASY(10), MEDIUM(100), HARD(1000);

    private final int difficultRate;

    public int getDifficultRate() {
        return difficultRate;
    }
}
