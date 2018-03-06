package withoutBuilder.pages;

import java.lang.reflect.Array;

/**
 * Created by fathimah on 3/6/18.
 */
public class Search {
    public void Search() {

    }

    public void searchByText(String text) {
        System.out.println("Typing in search with " + text);
    }

    public void FilterByBrand(Array brands) {
        System.out.println("Filtering by" + brands);
    }

    public void FilterByType(String type) {
        System.out.println("Filtering by" + type);
    }

    public void FilterBySize(String size) {
        System.out.println("Filtering by" + size);
    }
    public void FilterByPrice(float price) {
        System.out.println("Filtering by" + price);
    }

    public Search search(String textToSearch, String[] brands, String type, String size, float price) {
        System.out.println("Filtering by" + textToSearch + price + brands + type + size + "and returning results");
        return this;
    }

    public boolean isValidResult() {
        return true;
    }


}
