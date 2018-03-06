package withBuilder.test;

import withBuilder.pages.Search;

/**
 * Created by fathimah on 3/6/18.
 */
public class withBuilderPattern {

    public void filteredSearch() {
        String textToSearch = "Search";
        String[] brands = {"brand1", "brand 2"};
        String type = "Type";
        String size = "Size";
        float price = 1000;

        Search search = new Search();
        Search searchResults = new Search();

        searchResults = search.searchByText(textToSearch)
                .FilterByBrand(brands)
                .FilterByType(type)
                .FilterByPrice(price);

        assert (searchResults.isValidResult() == true);

    }

}
