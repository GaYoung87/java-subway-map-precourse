package subway.domain;

import java.util.ArrayList;

public class StationCheck {

    private static final int MIN_LENGTH_OF_STATION = 2;
    public StationCheck() {

    }

    public static boolean checkStationLength(String station) {
        if (station.length() < MIN_LENGTH_OF_STATION) {
            return false;
        }
        return true;  // true여야 okay
    }

    public static boolean checkStationEndPoint(String station) {
        if (station.endsWith("역")) {
            return true;  // true여야 okay
        }
        return false;
    }
}
