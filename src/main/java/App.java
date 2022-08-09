import Model.Hero;
import Model.UserHero;

public class App {
    public static void main(String[] args) {
        UserHero userHero = new UserHero(Hero.Mage);
        System.out.println(userHero.getStats());
        userHero.getStats().levelUp(userHero.getLevelUp());
        System.out.println(userHero.getStats().toString());
    }
}
