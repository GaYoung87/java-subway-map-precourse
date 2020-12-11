package subway.domain.station;

public class FindStationNameException extends Exception{

    private static final String MESSAGE = "등록되지 않은 지하철 역 입니다.";

    public FindStationNameException(final String input) {
        super(String.format(MESSAGE));
    }
}
