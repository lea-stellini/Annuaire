import java.util.ArrayList;
import java.util.HashSet;

public class Directory {
    private HashSet<Person> persons = new HashSet<>();

    public HashSet<Person> getPersons() {
        return new HashSet<>(persons);
    }

    public void addUniquePerson(Person newPerson){
        boolean isUnique = true;
        for(Person person : persons){
            if(newPerson.getEmail().equals(person.getEmail())){
                isUnique = false;
                break;
            }
        }

        if(isUnique){
            persons.add(newPerson);
        }
    }


}
