import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Professor implements Syllabus_Interface {

    private String name;
    private String role;

    private List<Course> courses = new ArrayList<Course>();

    public Professor(String name, Syllabus syllabus, List<Course> courses, String role) {
        this.name = name;
        this.courses = courses;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }


    public Syllabus generateSyllabusTemplates(int courseId) {

        return null;
    }

    public Syllabus editSyllabus(Syllabus syllabus) {

        return null;
    }

    public Syllabus displaySyllabus(int syllabusID) {

        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor professor)) return false;
        return Objects.equals(name, professor.name) && Objects.equals(courses, professor.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, courses);
    }

    @Override
    public List<Syllabus> getPreviousSyllabus(Date from, Date to,Syllabus syllabus,Course course) {
        return null;
    }

    @Override
    public List<Syllabus> generateSyllabus(Syllabus syllabus,Course course) {
        return null;
    }
}