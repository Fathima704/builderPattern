package withoutBuilder.test;

/**
 * Created by fathimah on 3/6/18.
 */
public class withoutBuilderPattern {


    public void filteredSearch1() {

//        withoutBuilder.pages.Search search= new withoutBuilder.pages.Search();
//        withoutBuilder.pages.Search searchResults = new withoutBuilder.pages.Search();
//
//        searchResults = search.searchByText("");

    }

    public void filteredSearch2() {

        String textToSearch = "Search";
        String[] brands = {"brand1", "brand 2"};
        String type = "Type";
        String size = "Size";
        float price = 1000;

        withoutBuilder.pages.Search search = new withoutBuilder.pages.Search();
        withoutBuilder.pages.Search searchResults = new withoutBuilder.pages.Search();

        searchResults = search.search(textToSearch, brands, type, size, price);
        assert (searchResults.isValidResult() == (true));

    }

}
