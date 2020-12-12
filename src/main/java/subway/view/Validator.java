package subway.view;

public class Validator {
    static final String NULL_ERROR_MESSAGE = "null 값을 입력하셨습니다.";

    public static void validate(String input) {
        checkNull(input);
    }

    private void checkNull(String input) {
        if (input == null) {
            System.out.println(NULL_ERROR_MESSAGE);
//            throw new IllegalArgumentException(NULL_ERROR_MESSAGE);
        }
    }
}
