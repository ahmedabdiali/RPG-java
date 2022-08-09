import Model.Hero;
import Model.UserHero;

public class App {
    /*
    * here i print out toString() that i have in Stats class that displays base level, and level up based on which hero you use
    * */
    public static void main(String[] args) {
        UserHero userHero = new UserHero(Hero.Mage);
        System.out.println(userHero.getStats());
        userHero.getStats().levelUp(userHero.getLevelUp());
        System.out.println(userHero.getStats().toString());
    }
}
