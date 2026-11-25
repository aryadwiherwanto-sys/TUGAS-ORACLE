import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Budi", "Santoso", "Wijaya", new Date());
        System.out.println("Nama: " + person.getName());
    }
}
