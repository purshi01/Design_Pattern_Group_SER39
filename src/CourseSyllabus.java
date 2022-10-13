import java.util.Date;
import java.util.List;

public class CourseSyllabus implements Syllabus_Interface {

    public List<Syllabus> getPreviousSyllabus(Date from, Date to) {

        return null;
    }

    public void getCourseTemplate() {

    }


    @Override
    public List<Syllabus> getPreviousSyllabus(Date from, Date to, Syllabus syllabus, Course course) {
        return null;
    }

    @Override
    public List<Syllabus> generateSyllabus(Syllabus syllabus, Course course) {
        return null;
    }
}
