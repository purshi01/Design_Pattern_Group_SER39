
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WebsiteScraperNotifier {
    private static WebsiteScraperNotifier instance = new WebsiteScraperNotifier();
    private static List<Date> date;

    private WebsiteScraperNotifier() {
    }

    public static WebsiteScraperNotifier getInstance() {
        return instance;
    }

    public List<String> scrapeTheWebsite(Course course) {
        boolean changes_found = true;
        List<String> data = new ArrayList();
        if (changes_found) {
            data.add("Changes 1");
            data.add("Changes 2");
            data.add("Changes 3");
            data.add("Changes 4");
        }

        return data;
    }

    public List<String> searchForChanges() {
        boolean changes_found = true;
        List<String> changes = new ArrayList();
        if (changes_found) {
            changes.add("Changes 1");
            changes.add("Changes 2");
            changes.add("Changes 3");
            changes.add("Changes 4");
        }

        return changes;
    }

    public int numberOfTimesVisitedAWebsiteInAPeriod(Date from, Date to) {
        //Return the number of times that we have visited the website based in DATE List
        return 5;
    }

}
