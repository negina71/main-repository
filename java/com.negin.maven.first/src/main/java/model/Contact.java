package model;

public class Contact {
    private String email;
    private String tel;
    private Address address;

    public Contact(String email, String tel, Address address){
        this.email=email;
        this.tel=tel;
        this.address =address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", address=" + address +
                '}';
    }
}
