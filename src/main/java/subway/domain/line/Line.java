package subway.domain.line;

public class Line {
    private final LineCheck lineName;

    public Line(final String lineName) {
        this.lineName = new LineCheck(lineName);
    }

    public String getName() {
        return lineName.getName();
    }
}
