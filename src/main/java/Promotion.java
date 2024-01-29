import java.util.Set;
import java.util.stream.Collectors;

public class Promotion {

    private final int id;
    private final String name;

    private final Set<Person> formers;
    private final Set<Person> students;

    public Promotion(int id, String name, Set<Person> formers, Set<Person> students) {
        this.id = id;
        this.name = name;
        this.formers = formers;
        this.students = students;
    }

    public Set<Person> getFormers() {
        return formers;
    }

    public Set<Person> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return String.format("""
                        Promotion %s N°%s

                        👷 Formateurs:

                        %3$s

                        🧑‍💻 Élèves:

                        %4$s
                        """,
                this.name,
                this.id,
                this.getFormers().stream().map(Object::toString).collect(Collectors.joining("\n")),
                this.getStudents().stream().map(Object::toString).collect(Collectors.joining("\n"))
        );
    }
}
