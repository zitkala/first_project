package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PizzaMenu {
    private List<PizzaMenuItem> menu_items;
    private LocalDateTime last_update;

    public PizzaMenu(){
        menu_items = new ArrayList<>();
    }
    public void AddItem(PizzaMenuItem item_to_add){
        menu_items.add(item_to_add);
        last_update = LocalDateTime.now();
    }
    public void RemoveItem(PizzaMenuItem item_to_remove){
        menu_items.remove(item_to_remove);
        last_update = LocalDateTime.now();
    }
    public void RemoveItem(String name){
        PizzaMenuItem to_delete = null;
        for(PizzaMenuItem item: menu_items){
            if (item.getName().equals(name)){
                to_delete = item;
                break;
            }
        }
        if (to_delete != null){
            menu_items.remove(to_delete);
        }
        last_update = LocalDateTime.now();
    }
    public int GetMenuSize(){
        return menu_items.size();
    }

    @Override
    public boolean equals(Object obj) {
        return ((PizzaMenu)obj).GetMenuSize() == this.GetMenuSize();
    }
}
