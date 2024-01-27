import net.datafaker.Faker;

import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Directory directory = new Directory();

        Faker faker = new Faker(new Locale("fr"));

        List<String> firstNames = faker.collection(() -> faker.name().firstName()).len(10).generate();
        List<String> lastNames = faker.collection(() -> faker.name().lastName()).len(10).generate();
        List<String> phoneNumber = faker.collection(() -> faker.phoneNumber().phoneNumber()).len(10).generate();
        List<String> address = faker.collection(() -> faker.address().streetAddress()).len(10).generate();
        List<String> email = faker.collection(() -> faker.internet().emailAddress()).len(10).generate();

        Person Person1 = new Student(firstNames.get(0), lastNames.get(0), phoneNumber.get(0), address.get(0), email.get(0));
        Person Person2 = new Former(firstNames.get(1), lastNames.get(1), phoneNumber.get(1), address.get(1), email.get(1));
        Person Person3 = new Former(firstNames.get(2), lastNames.get(2), phoneNumber.get(2), address.get(2), email.get(2));
        Person Person4 = new Student(firstNames.get(3), lastNames.get(3), phoneNumber.get(3), address.get(3), email.get(3));
        Person Person5 = new Former(firstNames.get(4), lastNames.get(4), phoneNumber.get(4), address.get(4), email.get(4));
        Person Person6 = new Former(firstNames.get(5), lastNames.get(5), phoneNumber.get(5), address.get(5), email.get(5));
        Person Person7 = new Student(firstNames.get(6), lastNames.get(6), phoneNumber.get(6), address.get(6), email.get(6));
        Person Person8 = new Former(firstNames.get(7), lastNames.get(7), phoneNumber.get(7), address.get(7), email.get(7));
        Person Person9 = new Former(firstNames.get(8), lastNames.get(8), phoneNumber.get(8), address.get(8), email.get(8));
        Person Person10 = new Former(firstNames.get(9), lastNames.get(9), phoneNumber.get(9), address.get(9), email.get(9));

        directory.addUniquePerson(Person1);
        directory.addUniquePerson(Person2);
        directory.addUniquePerson(Person3);
        directory.addUniquePerson(Person4);
        directory.addUniquePerson(Person5);
        directory.addUniquePerson(Person6);
        directory.addUniquePerson(Person7);
        directory.addUniquePerson(Person8);
        directory.addUniquePerson(Person9);
        directory.addUniquePerson(Person10);

        System.out.println(directory.getPersons());
    }
}
