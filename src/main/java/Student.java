public class Student extends Person{
    public Student(String firstName, String lastName, String phoneNumber, String email, String address) {
        super(firstName, lastName, phoneNumber, email, address);
    }

    @Override
    public String toString() {
        return "Élève " + super.toString();
    }
}
