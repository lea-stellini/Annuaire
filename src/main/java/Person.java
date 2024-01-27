public class Person {
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final String email;
    private final String address;

    public Person(String firstName, String lastName, String phoneNumber, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return String.format("""
                %s %s
                📱: %s
                📧: %s
                🏠: %S
                """,
                this.getFirstName(),
                this.getLastName(),
                this.getPhoneNumber(),
                this.getEmail(),
                this.getAddress());
    }
}
