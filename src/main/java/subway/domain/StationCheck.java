package subway.domain;

import java.util.ArrayList;

public class StationCheck {

    private static final int MIN_LENGTH_OF_STATION = 2;
    public StationCheck() {

    }

    public static boolean checkStationLength(String station) {
        if (station.length() < MIN_LENGTH_OF_STATION) {
            System.out.println("[ERROR] 역이름은 2글자 이상 입력해야합니다.");
            return false;
        }
        return true;  // true여야 okay
    }

    public static boolean checkStationEndPoint(String station) {
        if (station.substring(station.length() - 1).equals("역")) {
            System.out.println("[ERROR] 역이름은 OO역으로 끝나야 합니다.");
            return true;  // true여야 okay
        }
        return false;
    }

    public static boolean checkStationDuplicate(String station, ArrayList<String> stationList) {
        if (stationList.contains(station)) {
            System.out.println("[ERROR] 이미 등록된 역 이름입니다. 중복되지 않는 역이름을 입력해주세요.");
            return true;  // false여야 okay
        }
        return false;
    }
}
