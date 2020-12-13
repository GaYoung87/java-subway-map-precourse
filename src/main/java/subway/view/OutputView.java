package subway.view;

public class OutputView {
    private static final String MAIN_MENU = "## 메인 화면\n1. 역관리\n2. 노선 관리\n3. 구간 관리\n4. 지하철 노선도 출력\nQ. 종료\n";
    private static final String CHOOSE_COMMAND_MESSAGE = "## 원하는 기능을 선택하세요.";
    private static final String INFO_MESSAGE = "[INFO] ";
    private static final String STATION_SAVE_MESSAGE = "지하철 역이 등록되었습니다.";
    private static final String LINE_SAVE_MESSAGE = "지하철 노선이 등록되었습니다.";

    public static void printMainMenu() {
        System.out.println(MAIN_MENU);
        printChooseCommandMessage();
    }

    public static void printChooseCommandMessage() {
        System.out.println(CHOOSE_COMMAND_MESSAGE);
    }

    public static void printStationSaveMessage() {
        System.out.println(INFO_MESSAGE+STATION_SAVE_MESSAGE);
    }

    public static void printLineSaveMessage() {
        System.out.println(INFO_MESSAGE+LINE_SAVE_MESSAGE);
    }
}