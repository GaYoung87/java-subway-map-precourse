package subway.domain.line;

import subway.view.Validator;

public class LineCheck {

    public static final String LINE_LENGTH_ERROR_MESSAGE = "[ERROR] 노선 이름은 2글자 이상 입력해야합니다.";
    public static final String LINE_END_POINT_ERROR_MESSAGE = "[ERROR] 노선이름은 OO선 또는 O호선으로 끝나야 합니다.";

    private static final int MIN_LENGTH_OF_STATION = 2;

    private final String lineName;

    public LineCheck(String lineName) {
        isOkay(lineName);
        this.lineName = lineName;
    }

    public String getName() {
        return lineName;
    }

    public void isOkay(String line) {
        Validator.validate(line);
        checkLineLength(line);
        checkLineEndPoint(line);
    }
    
    public void checkLineLength(String line) {
        if (line.length() < MIN_LENGTH_OF_STATION) {
            System.out.println(LINE_LENGTH_ERROR_MESSAGE);
        }
    }

    public void checkLineEndPoint(String line) {
        if (!line.endsWith("선") || !line.endsWith("호선")) {
            System.out.println(LINE_END_POINT_ERROR_MESSAGE);
        }
    }
}
