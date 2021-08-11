package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class documents {

    Integer products;
    Integer stores;
    Integer categories;

    public Integer getProducts() {
        return products;
    }

    public documents setProducts(Integer products) {
        this.products = products;
        return this;
    }

    public Integer getStores() {
        return stores;
    }

    public documents setStores(Integer stores) {
        this.stores = stores;
        return this;
    }

    public Integer getCategories() {
        return categories;
    }

    public documents setCategories(Integer categories) {
        this.categories = categories;
        return this;
    }
}
