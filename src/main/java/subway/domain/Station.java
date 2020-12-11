package subway.domain;

public class Station {
    private String name;

    public Station(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static boolean stationCheck(String station) {
        if (!StationCheck.checkStationLength(station)) {
            System.out.println("[ERROR] 노선 이름은 2글자 이상 입력해야합니다.");
            return false;
        }
        if (!StationCheck.checkStationEndPoint(station)) {
            System.out.println("[ERROR] 노선이름은 OO선 또는 O호선으로 끝나야 합니다.");
            return false;
        }
        return true;
    }
}
