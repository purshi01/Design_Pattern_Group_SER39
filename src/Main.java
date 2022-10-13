
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Syllabus syllabus = new Syllabus();
        Course course = new Course("Software foundation ", 0001, "Software engineering", new Date(), new Date(), syllabus);
        WebsiteScraperNotifier scraper = WebsiteScraperNotifier.getInstance();

        //========================= Singleton design pattern start=====================
//==========================  =============  =============  =============  =============  =============  =============
        //scape the data for a perticular course

        System.out.println("========================= Singleton design pattern start=====================");
        System.out.println("Data Scrapping started.......");
        List<String> data = scraper.scrapeTheWebsite(course);
        //Store the scrping data to the database/

        System.out.println("Data has been scraped from the website and stored in database");

        System.out.println("Scrapping is done .......");

//==========================  =============  =============  =============  =============  =============  =============
        // After scraping the data for the course search for any update
        System.out.println("Looking for changes in website ");
        if (scraper.searchForChanges().size() == 0) {
            System.out.println("No changes are found in the website");
        } else {
            System.out.println("changes are found in the website");
            Iterator var2 = scraper.searchForChanges().iterator();

            while (var2.hasNext()) {
                String change = (String) var2.next();
                System.out.println(change);
            }
        }
        System.out.println("Data has been scraped from the website and stored in database");
        System.out.println("Number of times visited the website " + scraper.numberOfTimesVisitedAWebsiteInAPeriod(new Date(), new Date()));
        System.out.println("========================= Singleton design pattern end=====================");
//==========================  =============  =============  =============  =============  =============  =============

//==========================  =============  =============  =============  =============  =============  =============

        List<Course> courseList = new ArrayList<>();
        courseList.add(course);
        // ====================Full Time ===============
        Professor professor1 = new Professor("Professor 1", syllabus, courseList, "Full time");
        FulltimeLecturer fulltimeLecturer = new FulltimeLecturer(syllabus, professor1);
        fulltimeLecturer.getPreviousSyllabus(new Date(),new Date(),syllabus,course);
        fulltimeLecturer.generateSyllabus(syllabus,course);
        System.out.println("Full time professor able to generate a syllabus");

        // ====================Part Time ===============

        Professor professor2 = new Professor("Professor 2", syllabus, courseList, "part time");
        AdjunctLecturer adjunctLecturer = new AdjunctLecturer(syllabus, professor2);
        adjunctLecturer.getTemplate();
        adjunctLecturer.generateSyllabus(syllabus,course);
        System.out.println("part time professor able to generate a syllabus");


//==========================  =============  =============  =============  =============  =============  =============


//==========================  =============  =============  =============  =============  =============  =============
        System.out.println("=======================================================");


        SyllabusGeneration syllabusGeneration = new SyllabusGeneration();

        List<Syllabus> syllabusList = syllabusGeneration.generateSyllabus(syllabus,course);

        System.out.println("Syllabus for the Given Course");

        for (Syllabus syllabus1 : syllabusList){
            System.out.println("Course name : " +syllabus1.getCourse().getCourse_name());
            System.out.println("Syllabus Unit");
            for (Unit unit : syllabus1.getUnits()){
                System.out.println("Name : "+ unit.getName());
                System.out.println("Descriprion : "+unit.getDescription());
                System.out.println("Content :"+unit.getContent());
            }

        }

        System.out.println("====================================================");

//==========================  =============  =============  =============  =============  =============  =============



    }
}
