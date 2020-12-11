package subway.domain.station;

public class StationCheck {

    private static final String NULL_ERROR_MESSAGE = "null 값을 입력하셨습니다.";

    private void checkNull(String input) {
        if (input == null) {
            throw new IllegalArgumentException(NULL_ERROR_MESSAGE);
        }
    }
}
