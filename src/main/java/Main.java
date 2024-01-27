import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Directory annuaire = new Directory();

       Person student = new Student("Daisy", "daisy", "9090", "test@gmail.com", "35 rue");
       Person former = new Former("Tim", "tim", "8080", "test@gmail.com", "34rue");
       Person former2 = new Former("Léa", "léa", "6060", "lea@gmail.com", "56 rue");

       annuaire.addUniquePerson(student);
       annuaire.addUniquePerson(former);
       annuaire.addUniquePerson(former2);

       System.out.println(annuaire.getPersons());
    }
}
