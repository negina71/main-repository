package model;

public class ContactBuilder {

    private String email;
    private String tel;
    private Address address;

    public ContactBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public ContactBuilder setTel(String tel) {
        this.tel = tel;
        return this;
    }

    public ContactBuilder setAddress(Address address) {
        this.address = address;
        return this;
    }


    public Contact getContact() {
        return new Contact(email, tel, address);
    }
}
