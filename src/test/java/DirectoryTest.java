import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class DirectoryTest {
    private final Directory testDirectory = new Directory();
    private final Person student = new Student("Tim", "Tim", "9090", "34 RUE", "test@gmail.com");
    private final Person former = new Former("Daisy", "Daisy", "6060", "34 RUE", "daisy@gmail.com");
    private final Person student1 = new Student("Tim", "Léa", "9090", "32 RUE", "test@gmail.com");

    @BeforeEach
    void setupTest(){
        testDirectory.getPersons().clear();
    }

    @Nested
    class addUniquePerson{
        @Test
        void shouldAddPersonInList() {
            testDirectory.addUniquePerson(student);
            assertTrue(testDirectory.getPersons().contains(student));
        }

        @Test
        void shouldAddPersonInListIfEmailNotAlreadyExits() {
            testDirectory.addUniquePerson(student);
            testDirectory.addUniquePerson(former);
            assertEquals(2, testDirectory.getPersons().size());
        }

        @Test
        void shouldNotAddPersonInListIfEmailAlreadyExits() {
            testDirectory.addUniquePerson(student);
            testDirectory.addUniquePerson(student1);
            assertEquals(1, testDirectory.getPersons().size());

        }
    }

    @Nested
    class searchByName{

        @Test
        void shouldReturnPersonByFirstNameIfExists(){
            testDirectory.addUniquePerson(student);
            Optional<Person> personFound = testDirectory.searchByName("Tim");
            assertEquals(student, personFound.get() );
        }

        @Test
        void shouldReturnPersonByLastNameIfExists(){
            testDirectory.addUniquePerson(former);
            Optional<Person> personFound = testDirectory.searchByName("Daisy");
            assertEquals(former, personFound.get());
        }

        @Test
        void shouldReturnPersonByFirstNameAndLastNameIfExists(){
            testDirectory.addUniquePerson(student1);
            Optional<Person> personFound = testDirectory.searchByName("Tim Léa");
            assertEquals(student1, personFound.get());
        }

        @Test
        void shouldReturnPersonByFirstNameAndLastNameWithoutCaseSensitiveIfExists(){
            testDirectory.addUniquePerson(student);
            Optional<Person> personFound = testDirectory.searchByName("tIm tiM");
            assertEquals(student, personFound.get());
        }

        @Test
        void shouldReturnNullIfPersonNotFound(){
            testDirectory.addUniquePerson(former);
            Optional<Person> personFound = testDirectory.searchByName("Tim");
            assertTrue(personFound.isEmpty());
        }


    }
}