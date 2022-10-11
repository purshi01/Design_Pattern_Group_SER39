
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        WebsiteChangesNotifier notifier = WebsiteChangesNotifier.getInstance();
        if (notifier.searchForChanges().size() == 0) {
            System.out.println("No changes are found in the website");
        } else {
            System.out.println("changes are found in the website");
            Iterator var2 = notifier.searchForChanges().iterator();

            while(var2.hasNext()) {
                String change = (String)var2.next();
                System.out.println(change);
            }
        }

    }
}
