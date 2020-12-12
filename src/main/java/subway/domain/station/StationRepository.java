package subway.domain.station;

import java.util.*;

public class StationRepository {
    private static final List<Station> stations = new ArrayList<>();
    private final String DUPLICATE_STATION_ERROR_MESSAGE = "[ERROR] 이미 등록된 역 이름입니다. 중복되지 않는 역이름을 입력해주세요.";

    public List<Station> stations() {
        return Collections.unmodifiableList(stations);
    }

    public boolean addCheck(Station station) {
        if (addStation(station)){
            stations.add(station);
            return true;
        }
        return false;
    }

    public boolean addStation(Station station) {
        if (stations.contains(station)) {
            System.out.println(DUPLICATE_STATION_ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean deleteStation(String name) {
        return stations.removeIf(station -> Objects.equals(station.getName(), name));
    }
}
