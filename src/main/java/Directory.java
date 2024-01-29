import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Directory {
    private Set<Person> persons = new HashSet<>();

    public Set<Person> getPersons() {
        return persons;
    }

    public void addUniquePerson(Person newPerson) {
        persons.add(newPerson);
    }

    public Optional<Person> searchByName(String searchedName) {
        String searchedNameInLowerCase = searchedName.toLowerCase();
        return persons.stream().filter((person) ->
                searchedNameInLowerCase.contains(person.getFirstName()) ||
                        searchedNameInLowerCase.contains(person.getLastName())).findFirst();
    }

}
