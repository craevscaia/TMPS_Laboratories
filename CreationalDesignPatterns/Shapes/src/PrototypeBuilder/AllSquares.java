package PrototypeBuilder;

import java.util.ArrayList;
import java.util.List;

public class AllSquares {
    private List<IItem> items = new ArrayList<IItem>();

    public void addItem(IItem item){
        items.add(item);
    }

    public void showItems(){

        for (IItem item : items) {
            System.out.print("Item : " + item.name());
        }
    }
}
