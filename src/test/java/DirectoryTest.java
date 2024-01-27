import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectoryTest {
    private Directory testDirectory = new Directory();
    private final Person student = new Student("Tim", "Tim", "9090", "34 RUE", "test@gmail.com");
    private final Person former = new Former("Tim", "Tim", "9090", "34 RUE", "test@gmail.com");
    private final Person former2 = new Former("Daisy", "Daisy", "6060", "34 RUE", "daisy@gmail.com");

    @BeforeEach
    void setupTest(){
        testDirectory.getPersons().clear();
    }

    @Test
    void shouldAddPersonInList() {
        testDirectory.addUniquePerson(student);
        assertEquals(1, testDirectory.getPersons().size());
    }

    @Test
    void shouldAddPersonInListIfEmailNotAlreadyExits() {
        testDirectory.addUniquePerson(student);
        testDirectory.addUniquePerson(former2);
        assertEquals(2, testDirectory.getPersons().size());
    }

    @Test
    void shouldNotAddPersonInListIfEmailAlreadyExits() {
        testDirectory.addUniquePerson(student);
        testDirectory.addUniquePerson(former);
        assertEquals(1, testDirectory.getPersons().size());

    }
}