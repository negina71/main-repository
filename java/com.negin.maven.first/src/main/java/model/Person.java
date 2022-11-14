package model;

public class Person {
    private int id;
    private PERSON_TYPE person_type;
    private String firstName;
    private String lastName;
    private Contact contact;
    private int objectId;
    private Address objectAdd;

    public Person(int id, PERSON_TYPE person_type, String firstName, String lastName, Contact contact, int objectId, Address objectAdd) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.person_type=person_type;
        this.id = id;
        this.contact = contact;
        this.objectId= objectId;
        this.objectAdd=objectAdd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PERSON_TYPE getPerson_type() {
        return person_type;
    }

    public void setPerson_type(PERSON_TYPE person_type) {
        this.person_type = person_type;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public Address getObjectAdd() {
        return objectAdd;
    }

    public void setObjectAdd(Address objectAdd) {
        this.objectAdd = objectAdd;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", person_type=" + person_type +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contact=" + contact +
                ", objectId=" + objectId +
                ", objectAdd=" + objectAdd +
                '}';
    }
}

