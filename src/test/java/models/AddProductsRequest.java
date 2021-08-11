package models;

public class AddProductsRequest {

    private String name;
    private String type;
    private Integer price;
    private Integer shipping;
    private String upc;
    private String description;
    private String manufacturer;
    private String model;
    private String url;
    private String image;


    public String getName() {
        return name;
    }

    public AddProductsRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public AddProductsRequest setType(String type) {
        this.type = type;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public AddProductsRequest setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public Integer getShipping() {
        return shipping;
    }

    public AddProductsRequest setShipping(Integer shipping) {
        this.shipping = shipping;
        return this;
    }

    public String getUpc() {
        return upc;
    }

    public AddProductsRequest setUpc(String upc) {
        this.upc = upc;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AddProductsRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public AddProductsRequest setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public String getModel() {
        return model;
    }

    public AddProductsRequest setModel(String model) {
        this.model = model;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public AddProductsRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getImage() {
        return image;
    }

    public AddProductsRequest setImage(String image) {
        this.image = image;
        return this;
    }


}
