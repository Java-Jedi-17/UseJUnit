package ru.netology.taxes;

public class TaxDebit extends TaxSystem {
    private static int taxD;
    private static double PERCENT_TAX_DEBIT = 0.06;

    public static double getPercentTaxDebit() {
        return PERCENT_TAX_DEBIT;
    }

    public static int getTaxD() {
        return taxD;
    }

    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = (int) (debit * PERCENT_TAX_DEBIT);
        return taxD = tax;
    }
}
