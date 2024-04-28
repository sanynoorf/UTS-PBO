public class Person extends Contact {
    private String address;

    public Person(String name, String phoneNumber, String address) {
        super(name, phoneNumber);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
    return "Name: " + getName() + ", Phone Number: " + getPhoneNumber() + ", Address: " + address;
    }
}
