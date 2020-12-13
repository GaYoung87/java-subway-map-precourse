package subway.domain.station;

import java.util.*;
import java.util.stream.Collectors;

public class StationRepository {
    private static List<Station> stations = new ArrayList<>();
    private final String DUPLICATE_STATION_ERROR_MESSAGE = "[ERROR] 이미 등록된 역 이름입니다. 중복되지 않는 역이름을 입력해주세요.";
    private static final String INFO="[INFO] ";

    public StationRepository() {
        this.stations = new LinkedList<>();
    }

    public StationRepository(final List<Station> stations) {
        this.stations = stations;
    }

    public List<Station> stations() {
        return Collections.unmodifiableList(stations);
    }

    public StationRepository addStation(String station) {
        return add(stations.size(), station);
    }

    public StationRepository add(int index, String station) {
        if (stations.contains(station)) {
            System.out.println(DUPLICATE_STATION_ERROR_MESSAGE);
        }
        stations.add(index, new Station(station));
        return new StationRepository(stations);
    }

    public boolean deleteStation(String name) {
        return stations.removeIf(station -> Objects.equals(station.getName(), name));
    }

    public static void printAllStation(){
        stations.forEach(station -> printInfo(station.getName()));
    }

    public static void printInfo(String info){
        System.out.println(INFO+info);
    }
}
