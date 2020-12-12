package subway.domain.station;

public class StationCheck extends Validator {

    private static final String NULL_ERROR_MESSAGE = "[ERROR] null값을 입력하셨습니다.";
    public static final String STATION_LENGTH_ERROR_MESSAGE = "[ERROR] 노선 이름은 2글자 이상 입력해야합니다.";
    public static final String STATION_END_POINT_ERROR_MESSAGE = "[ERROR] 노선이름은 OO선 또는 O호선으로 끝나야 합니다.";

    private static final int MIN_LENGTH_OF_STATION = 2;

    private final String stationName;

    public StationCheck(String stationName) {
        validate(stationName);
        this.stationName = stationName;
    }

    public String getName() {
        return stationName;
    }

    @Override
    public void validate(String station) {
        super.validate(station);
        checkStationLength(station);
        checkStationEndPoint(station);
    }

    public void checkStationLength(String station) {
        if (station.length() < MIN_LENGTH_OF_STATION) {
            System.out.println(STATION_LENGTH_ERROR_MESSAGE);
//            throw new IllegalArgumentException(STATION_LENGTH_ERROR_MESSAGE);
        }
    }

    public void checkStationEndPoint(String station) {
        if (!station.endsWith("역")) {
            System.out.println(STATION_END_POINT_ERROR_MESSAGE);
//            throw new IllegalArgumentException(STATION_END_POINT_ERROR_MESSAGE);
        }
    }
}
