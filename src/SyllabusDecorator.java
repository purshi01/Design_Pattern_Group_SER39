import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SyllabusDecorator implements Syllabus_Interface {

    private Syllabus_Interface wrappee;

    private Syllabus_Interface syllabusgenerator;

    public SyllabusDecorator(Syllabus_Interface s) {

    }

    @Override
    public List<Syllabus> getPreviousSyllabus(Date from, Date to,Syllabus syllabus,Course course) {

        syllabus.setCourse(course);
        Unit unit1 = new Unit("Unit 1", "First unit", "Unit 1 content");
        Unit unit2 = new Unit("Unit 2", "Second unit", "Unit 2 content");
        Unit unit3 = new Unit("Unit 3", "Third unit", "Unit 3 content");
        Unit unit4 = new Unit("Unit 4", "Fourth unit", "Unit 4 content");
        List<Unit> units = new ArrayList<>();
        units.add(unit1);
        units.add(unit2);
        units.add(unit3);
        units.add(unit4);
        syllabus.setUnits(units);
        List<Syllabus> syllabusList = new ArrayList<>();
        syllabus.setCourse(course);
        syllabusList.add(syllabus);
        return syllabusList;
    }

    @Override
    public List<Syllabus> generateSyllabus(Syllabus syllabus,Course course) {
        syllabus.setCourse(course);
        Unit unit1 = new Unit("Unit 1", "First unit", "Unit 1 content");
        Unit unit2 = new Unit("Unit 2", "Second unit", "Unit 2 content");
        Unit unit3 = new Unit("Unit 3", "Third unit", "Unit 3 content");
        Unit unit4 = new Unit("Unit 4", "Fourth unit", "Unit 4 content");
        List<Unit> units = new ArrayList<>();
        units.add(unit1);
        units.add(unit2);
        units.add(unit3);
        units.add(unit4);
        syllabus.setUnits(units);
        List<Syllabus> syllabusList = new ArrayList<>();
        syllabus.setCourse(course);
        syllabusList.add(syllabus);
        return syllabusList;
    }
}
