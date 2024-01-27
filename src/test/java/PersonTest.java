import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private final Person student = new Student("Tim", "Tim", "9090", "34 RUE", "test@gmail.com");
    private final Person former = new Former("Tim", "Tim", "9090", "34 RUE", "test@gmail.com");

    @Test
    void shouldFormatMessageForStudent() {
        String expected = String.format("""
                
                Élève %s %s
                📱: %s
                📧: %s
                🏠: %s""",
                student.getFirstName(),
                student.getLastName(),
                student.getPhoneNumber(),
                student.getEmail(),
                student.getAddress()
                );
        assertEquals(expected.trim(), student.toString().trim());

    }

    @Test
    void shouldFormatMessageForFormer() {
        String expected = String.format("""
                
                Formateur %s %s
                📱: %s
                📧: %s
                🏠: %s""",
                former.getFirstName(),
                former.getLastName(),
                former.getPhoneNumber(),
                former.getEmail(),
                former.getAddress()
        );
        assertEquals(expected.trim(), former.toString().trim());
    }
}