import models.PizzaMenu;
import models.PizzaMenuItem;

public class Main {
    public static void main(String[] args) {

        PizzaMenuItem item1 = new PizzaMenuItem(190,"Hawaii", "pinapple pizza");
        System.out.println(item1);
        PizzaMenu menu= new PizzaMenu();
        menu.AddItem(new PizzaMenuItem(190,"Hawaii", "pinapple pizza"));
        menu.AddItem(new PizzaMenuItem(190,"Polo", "chicken pizza"));
        menu.AddItem(new PizzaMenuItem(190,"Tuna", "tuna fish pizza"));
    }
}