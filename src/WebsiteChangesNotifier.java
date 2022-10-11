
import java.util.ArrayList;
import java.util.List;

public class WebsiteChangesNotifier {
    private static WebsiteChangesNotifier instance = new WebsiteChangesNotifier();

    private WebsiteChangesNotifier() {
    }

    public static WebsiteChangesNotifier getInstance() {
        return instance;
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
}
