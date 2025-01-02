package classTest.Searchable;

import java.util.ArrayList;
import java.util.List;

public class SearchableDemo {
    public static void main(String[] args) {

        List<Searchable> searchableItems = new ArrayList<>();

        searchableItems.add(new Document("This is a sample document about Java programming."));
        searchableItems.add(new WebPage( "This web page discusses programming techniques."));


        String keyword = "Programming";
        System.out.println("Searching for keyword: " + keyword);

        for (Searchable item : searchableItems) {
            if (item.search(keyword)) {
                System.out.println("Keyword found in: " + item.getClass().getSimpleName());
            } else {
                System.out.println("Keyword not found in: " + item.getClass().getSimpleName());
            }
        }
    }
}
