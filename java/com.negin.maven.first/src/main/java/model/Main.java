package model;

public class Main {
    public static void main(String[] args) {
        Address add = new Address("österreich", "rinn", "6074", "kirchgasse", "17");
        Address addBuyer = new Address("schweiz", "bon", "8884", "bonerstrasse", "17");
        Address addMakler = new Address("österreich", "innsbruck", "6020", "mariateresianstrasse", "10");
        Contact ownerCon = new Contact("negin.ashrafi71@gmail.com", "06764310448", add);
        Contact buyerCon = new Contact("farhad.arian@gmail.com", "0676654321", addBuyer);
        Contact maklerCon = new ContactBuilder().setEmail("sara.javani@gamil.com").setTel("112233445566").getContact();
        Contact wohnungCon = new ContactBuilder().setAddress(add).getContact();

        Person owner1 = new PersonBuilder().setId(1000).setPerson_type(PERSON_TYPE.Owner).setFirstName("negin").setLastName("ashrafi").setContact(ownerCon).setObjectAdd(add).setObjectId(9999).getPerson();
        Person buyer = new PersonBuilder().setId(2000).setPerson_type(PERSON_TYPE.Buyer).setFirstName("farhad").setLastName("arian").setContact(buyerCon).setObjectAdd(add).setObjectId(9999).getPerson();
        Person makler = new PersonBuilder().setId(3000).setPerson_type(PERSON_TYPE.Makler).setFirstName("sara").setLastName("javani").setContact(maklerCon).setObjectId(9999).getPerson();
        Product wohnung1 = new ProductBuilder().setId(9999).setType(PRODUCT_TYPE.Apartment).setPerson(owner1).setArea(100).setPrice(20000).setContact(wohnungCon).getProduct();
        System.out.println("the owner ist :" + owner1);
        System.out.println("the byuer info :" + buyer);
        System.out.println("the maklere info :" + makler);
        System.out.println("the Wohnung  info :" + wohnung1);
    }
}
