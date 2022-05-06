import model.Coach;
import model.Person;
import model.Player;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Arthur Kirby");
        person.setAge(25) ;
        person.sayName();
        person.sayAge();

        Player player = new Player("Vitaliy Mykolaenko", 24,7);
        player.sayName();
        player.sayAge();

        Coach coach = new Coach("Grigory Petrenko", 76, "Kyiv");
        coach.sayName();







    }
}
