package pl.mpas.advanced_programming.stream;

import java.util.List;

public class Order {

    List<Item> myItems;

    public Order(List<Item> myItems) {
        this.myItems = myItems;
    }

    public List<Item> getMyItems(){
        return myItems;
    }


}
