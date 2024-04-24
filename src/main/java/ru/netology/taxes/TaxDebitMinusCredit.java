package ru.netology.taxes;

public class TaxDebitMinusCredit extends TaxSystem {
    private static int taxDMC;
    private final double PERCENT_TAX_DEBIT_MINUS_CREDIT = 0.15;

    public static int getTaxDMC() {
        return taxDMC;
    }

    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = (int) ((debit - credit) * PERCENT_TAX_DEBIT_MINUS_CREDIT);
        if (tax > 0)
            return taxDMC = tax;
        else return taxDMC = 0;
    }
}
