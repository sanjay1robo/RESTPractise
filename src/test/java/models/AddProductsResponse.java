package models;

public class AddProductsResponse {

    private String id;
    private String name;
    private String type;
    private String price;
    private String shipping;
    private String upc;
    private String description;
    private String manufacturer;
    private String model;
    private String url;
    private String image;
    private String updatedAt;
    private String createdAt;

    public String getId() {
        return id;
    }

    public AddProductsResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AddProductsResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public AddProductsResponse setType(String type) {
        this.type = type;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public AddProductsResponse setPrice(String price) {
        this.price = price;
        return this;
    }

    public String getShipping() {
        return shipping;
    }

    public AddProductsResponse setShipping(String shipping) {
        this.shipping = shipping;
        return this;
    }

    public String getUpc() {
        return upc;
    }

    public AddProductsResponse setUpc(String upc) {
        this.upc = upc;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AddProductsResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public AddProductsResponse setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public String getModel() {
        return model;
    }

    public AddProductsResponse setModel(String model) {
        this.model = model;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public AddProductsResponse setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getImage() {
        return image;
    }

    public AddProductsResponse setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public AddProductsResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public AddProductsResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }


}
