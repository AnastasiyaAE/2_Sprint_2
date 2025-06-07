package service;

import model.Apple;
import model.Meat;
import model.Food;
import service.ShoppingCart;

import static model.constants.Colour.COLOUR_GREEN;
import static model.constants.Colour.COLOUR_RED;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food redApple = new Apple(10, 50.0, COLOUR_RED);
        Food greenApple = new Apple(8, 60.0, COLOUR_GREEN);

        Food[] foods = {meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(foods);
        print(String.format("Сумма товаров без скидки: %s", shoppingCart.getTotalWithoutDiscount()));
        print(String.format("Сумма товаров со скидкой: %s", shoppingCart.getTotalWithDiscount()));
        print(String.format("Сумма вегетарианских товаров без скидки: %s",
                shoppingCart.getTotalVegetariansWithoutDiscount()));
    }

    private static void print(String string) {
        System.out.println(string);
    }
}