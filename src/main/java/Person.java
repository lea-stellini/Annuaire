import java.util.Objects;

public abstract class Person {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
