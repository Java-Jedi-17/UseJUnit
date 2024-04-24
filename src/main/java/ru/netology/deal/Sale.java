package ru.netology.deal;

public class Sale extends Deal {
    public Sale(String title, int price) {
        super(String.format("Продажа %s на %d руб.", title, price),
                0, price);
    }
}
