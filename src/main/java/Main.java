public class Main {
    public static void main(String[] args){
       Person student = new Student("Daisy", "daisy", "9090", "test@gmail.com", "35 rue");
       Person former = new Former("Tim", "tim", "8080", "tim@gmail.com", "34rue");

        System.out.println(student);
        System.out.println(former);
    }
}
