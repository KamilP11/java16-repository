package pl.mpas.advanced_programming.stream;

import java.math.BigDecimal;
import java.util.List;

public class Item {

    private String name;
    private BigDecimal price;
    private List<Ingredient> ingredientsList;

    public Item(String name, BigDecimal price, List<Ingredient> ingredientsList) {
        this.name = name;
        this.price = price;
        this.ingredientsList = ingredientsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<Ingredient> getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(List<Ingredient> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }


    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ingredientsList=" + ingredientsList +
                '}';
    }
}
