import java.util.Date;
import java.util.Objects;

public class Course {
    private String course_name;
    private int course_id;
    private String course_department;
    private Date start_date;
    private Date end_date;
    private Syllabus syllabus;

    public Course(String course_name, int course_id, String course_department, Date start_date, Date end_date, Syllabus syllabus) {
        this.course_name = course_name;
        this.course_id = course_id;
        this.course_department = course_department;
        this.start_date = start_date;
        this.end_date = end_date;
        this.syllabus = syllabus;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_department() {
        return course_department;
    }

    public void setCourse_department(String course_department) {
        this.course_department = course_department;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Syllabus getSyllabus() {
        return syllabus;
    }
}