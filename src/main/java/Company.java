import ru.netology.taxes.TaxDebit;
import ru.netology.taxes.TaxSystem;
import ru.netology.deal.Deal;

public class Company {
    private final String title;
    private int debit = 0;
    private int credit = 0;
    protected TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else {
            credit += Math.abs(amount);
        }
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.printf("Компания %s уплатила %d рублей налогов.\n",
                title, tax);
        debit = 0;
        credit = 0;
    }

    public int applyDeals(Deal[] deals) {
        for (Deal deal : deals) {
            if (deal.getDebitChange() != 0) {
                shiftMoney(deal.getDebitChange());
            }
            if (deal.getCreditChange() > 0) {
                shiftMoney(-deal.getCreditChange());
            }
        }
        int sum = (int) (debit * TaxDebit.getPercentTaxDebit());
        payTaxes();
        return sum;
    }
}
