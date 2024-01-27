public class Former extends Person{
    public Former(String firstName, String lastName, String phoneNumber, String email, String address) {
        super(firstName, lastName, phoneNumber, email, address);
    }

    @Override
    public String toString() {
        return "Formateur " + super.toString();
    }
}
