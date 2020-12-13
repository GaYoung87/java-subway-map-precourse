package subway.domain.line;

import java.util.Objects;

public class Line {
    private final LineCheck lineName;

    public Line(final String lineName) {
        this.lineName = new LineCheck(lineName);
    }

    public String getName() {
        return lineName.getName();
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
