package withBuilder.pages;

/**
 * Created by fathimah on 3/6/18.
 */
public class Search {
    public void Search() {

    }

    public Search searchByText(String text) {
        System.out.println("Typing in search with " + text);
        return this;
    }

    public Search FilterByBrand(String[] brands) {
        System.out.println("Filtering by" + brands);
        return this;
    }

    public Search FilterByType(String type) {
        System.out.println("Filtering by" + type);
        return this;
    }

    public Search FilterBySize(String size) {
        System.out.println("Filtering by" + size);
        return this;
    }

    public Search FilterByPrice(float price) {
        System.out.println("Filtering by" + price);
        return this;
    }

    public boolean isValidResult() {
        return true;
    }
}
