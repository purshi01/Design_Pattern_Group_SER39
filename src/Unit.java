import javax.management.Descriptor;
import java.util.Objects;

public class Unit {

    private String name;
    private String description;
    private String content;

    public Unit(String name, String description, String content) {
        this.name = name;
        this.description = description;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Unit unit)) return false;
        return Objects.equals(name, unit.name) && Objects.equals(description, unit.description) && Objects.equals(content, unit.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, content);
    }
}
