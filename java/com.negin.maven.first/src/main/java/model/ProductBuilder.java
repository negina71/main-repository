package model;

public class ProductBuilder {
    private int id;
    private PRODUCT_TYPE productType;
    private Contact contact;
    private Person person;
    private float price;
    private float area;

    public ProductBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public ProductBuilder setType(PRODUCT_TYPE productType) {
        this.productType = productType;
        return this;
    }

    public ProductBuilder setContact(Contact contact) {
        this.contact = contact;
        return this;
    }

    public ProductBuilder setPerson(Person person) {
        this.person = person;
        return this;
    }

    public ProductBuilder setPrice(float price) {
        this.price = price;
        return this;
    }

    public ProductBuilder setArea(float area) {
        this.area = area;
        return this;
    }

    public Product getProduct() {
        return new Product(id, productType, contact, person, price, area);
    }
}
