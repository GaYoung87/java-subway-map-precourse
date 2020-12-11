package subway;

import subway.domain.station.Station;
import subway.domain.station.StationRepository;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO: 프로그램 구현

//        System.out.println(InputView.getMainMenuCommand(scanner));
//        System.out.println(Station.stationCheck(scanner.nextLine()));
        System.out.println(StationRepository.findStationName(scanner.nextLine()));
    }
}
