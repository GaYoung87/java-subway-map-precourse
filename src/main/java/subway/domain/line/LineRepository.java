package subway.domain.line;

import java.util.*;
import java.util.stream.Collectors;

public class LineRepository {
    private static List<Line> lines = new ArrayList<>();
    private final String DUPLICATE_LINE_ERROR_MESSAGE = "[ERROR] 이미 등록된 노선 이름입니다. 중복되지 않는 노선이름을 입력해주세요.";

    public LineRepository() {
        this.lines = new LinkedList<>();
    }

    public static List<Line> lines() {
        return Collections.unmodifiableList(lines);
    }

    public List<String> lineNames() {
        return lines.stream().map(Line::getName).collect(Collectors.toList());
    }

    public LineRepository addLine(Line line) {
        if (lines.contains(line)) {
            System.out.println(DUPLICATE_LINE_ERROR_MESSAGE);
        }
        lines.add(line);
        return this;
    }

    public static boolean deleteLineByName(String name) {
        return lines.removeIf(line -> Objects.equals(line.getName(), name));
    }
}
