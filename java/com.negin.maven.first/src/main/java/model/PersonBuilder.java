package model;

public class PersonBuilder {
    private int id;
    private PERSON_TYPE person_type;
    private String firstName;
    private String lastName;
    private Contact contact;
    private int objectId;
    private Address objectAdd;


    public PersonBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setContact(Contact contact) {
        this.contact = contact;
        return this;
    }

    public PersonBuilder setObjectId(int objectId) {
        this.objectId = objectId;
        return this;
    }

    public PersonBuilder setObjectAdd(Address objectAdd) {
        this.objectAdd = objectAdd;
        return this;
    }

    public PersonBuilder setPerson_type(PERSON_TYPE person_type) {
        this.person_type = person_type;
        return this;
    }

    public Person getPerson() {
        return new Person(id, person_type, firstName, lastName, contact, objectId, objectAdd);
    }
}
