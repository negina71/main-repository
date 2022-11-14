package model;

public class Product {
    private int id;
    private PRODUCT_TYPE OBJECTType;
    private Contact contact;
    private Person person;
    private float price;
    private float area;

    public Product(int id, PRODUCT_TYPE OBJECTType, Contact contact, Person person, float price, float area) {
        this.id = id;
        this.OBJECTType = OBJECTType;
        this.contact = contact;
        this.person = person;
        this.price = price;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PRODUCT_TYPE getType() {
        return OBJECTType;
    }

    public void setType(PRODUCT_TYPE OBJECTType) {
        this.OBJECTType = OBJECTType;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", type='" + OBJECTType + '\'' +
                ", contact=" + contact +
                ", person=" + person +
                ", price=" + price +
                ", area=" + area +
                '}';
    }
}
