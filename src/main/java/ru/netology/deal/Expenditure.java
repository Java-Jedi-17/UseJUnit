package ru.netology.deal;

public class Expenditure extends Deal {
    public Expenditure(String title, int price) {
        super(String.format("Покупка %s на %d руб.", title, price),
                price, 0);
    }
}
