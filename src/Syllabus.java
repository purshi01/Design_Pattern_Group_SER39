import java.util.List;
import java.util.Objects;

public class Syllabus extends SyllabusGeneration implements Syllabus_Interface {

    private Course course;
    private int id;
    private List<Unit> units;

    public Syllabus() {

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Syllabus(Course course, List<Unit> units) {
        this.course = course;
        this.units = units;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Syllabus syllabus)) return false;
        return Objects.equals(course, syllabus.course) && Objects.equals(units, syllabus.units);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course, units);
    }


}
