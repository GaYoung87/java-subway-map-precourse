package subway.domain.station;

import java.util.Objects;

public class Station {

    private final StationCheck stationCheck;

    public Station(String name) {
        this.stationCheck = new StationCheck(name);
    }

    public String getName() {
        return stationCheck.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (!(o instanceof Station)) { return false; }
        Station station = (Station) o;
        return Objects.equals(stationCheck, station.stationCheck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stationCheck);
    }
}
