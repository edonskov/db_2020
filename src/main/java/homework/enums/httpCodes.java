package homework.enums;

import java.util.Arrays;

public enum httpCodes {
    Informational(100, 199),
    Success(200, 299),
    Redirection(300, 399),
    ClientError(400, 499),
    ServerError(500, 599);

    private final int min;
    private final int max;


    private httpCodes(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public String getRangeHttp() {
        return String.format("%d,%d", min, max);
    }

    public static httpCodes get(int val) {
        return Arrays.stream(values())
                .filter(r -> val >= r.min && val <= r.max)
                .findFirst()
                .orElse(null);
    }
}
