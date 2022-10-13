import java.util.Date;
import java.util.List;

public interface Syllabus_Interface {

    public abstract List<Syllabus> getPreviousSyllabus(Date from, Date to,Syllabus syllabus,Course course);


    public abstract List<Syllabus> generateSyllabus(Syllabus syllabus,Course course);


}
