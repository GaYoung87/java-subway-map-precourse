package subway.domain.station;

public class StationCheck {

    private static final String NULL_ERROR_MESSAGE = "[ERROR] null값을 입력하셨습니다.";
    public static final String STATION_LENGTH_ERROR_MESSAGE = "[ERROR] 노선 이름은 2글자 이상 입력해야합니다.";

    private static final int MIN_LENGTH_OF_STATION = 2;

    private void checkNull(String station) {
        if (station == null) {
            throw new IllegalArgumentException(NULL_ERROR_MESSAGE);
        }
    }

    public void checkStationLength(String station) {
        if (station.length() < MIN_LENGTH_OF_STATION) {
            throw new IllegalArgumentException(STATION_LENGTH_ERROR_MESSAGE);
        }
    }
}
