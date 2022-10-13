import java.util.Date;
import java.util.List;

public class AdjunctLecturer extends SyllabusDecorator {

    private Syllabus_Interface syllabusDecorator;
    Professor professor;

    public AdjunctLecturer(Syllabus_Interface s, Professor professor) {
        super(s);
        this.professor = professor;
    }

    public String getTemplate() {
        return null;
    }

    @Override
    public List<Syllabus> generateSyllabus(Syllabus syllabus, Course course) {
        return super.generateSyllabus(syllabus, course);
    }

    @Override
    public List<Syllabus> getPreviousSyllabus(Date from, Date to, Syllabus syllabus, Course course) {
        return super.getPreviousSyllabus(from, to, syllabus, course);
    }
}
