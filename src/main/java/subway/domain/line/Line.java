package subway.domain.line;

import subway.domain.station.Station;
import subway.domain.station.StationRepository;

import java.util.Objects;

public class Line {
    private final LineCheck lineCheck;
    private final StationRepository stationRepository;

    public Line(final String lineName, final String startStation, final String endStation) {
        this.lineCheck = new LineCheck(lineName);
        this.stationRepository = new StationRepository().addStation(startStation).addStation(endStation);
    }

    public Line(final LineCheck lineCheck, final StationRepository stationRepository) {
        this.lineCheck = lineCheck;
        this.stationRepository = stationRepository;
    }

    public String getName() {
        return lineCheck.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (!(o instanceof Line)) { return false; }
        Line line = (Line) o;
        return Objects.equals(getName(), line.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
