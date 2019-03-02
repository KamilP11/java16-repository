package pl.mpas.advanced_programming.stream;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        // 2 x order
        // 3 to 4 items
        // 2 or more ingredients
        //TODO: refactor to builder
        List<Item> saturdayItems = Arrays.asList(
                new Item("kino", BigDecimal.valueOf(35.00),
                        Arrays.asList(new Ingredient("paper"))),
                new Item("chlebek", BigDecimal.valueOf(15.00),
                        Arrays.asList(new Ingredient("sugar"), new Ingredient("H2O"))

                ));

        Order saturdayShopping = new Order(saturdayItems);

        List<Item> sundayItems = Arrays.asList(
                new Item("Cola", BigDecimal.valueOf(30.00),
                        Arrays.asList(new Ingredient("e52"), new Ingredient("uran")))
        );


        Order sundayShopping = new Order(sundayItems);

        getIngredientsNames(Arrays.asList(sundayShopping, saturdayShopping));

    }
    public static List<String> getIngredientsNames (List<Order> orders){

        return orders.stream()
                .flatMap(order -> order.getMyItems().stream())
                .flatMap(item -> item.getIngredientsList().stream())
                //.map(ingredient -> ingredient.getName())
                .map(Ingredient::getName)
                .distinct()
                .collect(Collectors.toList());
    }

    public static BigDecimal sumMyItems (List<Order> orders){

        return orders.stream()
                .flatMap(order -> order.getMyItems()stream())
                .map(item ->item.getPrice())
                .reduce(BigDecimal.ZERO, (bigDecimal, bigDecimal2) -> bigDecimal.add(bigDecimal2)));
    }
}
