import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectoryTest {
    private Directory testDirectory = new Directory();
    private final Person student = new Student("Tim", "Tim", "9090", "34 RUE", "test@gmail.com");
    private final Person former = new Former("Daisy", "Daisy", "6060", "34 RUE", "daisy@gmail.com");
    private final Person student1 = new Student("Tim", "Léa", "9090", "32 RUE", "test@gmail.com");

    @BeforeEach
    void setupTest(){
        testDirectory.getPersons().clear();
    }

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