package subway.domain.station;

public class Station {

    private final StationCheck stationCheck;

    public Station(String name) {
        this.stationCheck = new StationCheck(name);
    }

    public String getName() {
        return stationCheck.getName();
    }

}
