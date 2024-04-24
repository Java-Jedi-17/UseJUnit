import ru.netology.deal.Deal;
import ru.netology.deal.Expenditure;
import ru.netology.deal.Sale;
import ru.netology.taxes.TaxDebit;
import ru.netology.taxes.TaxDebitMinusCredit;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("IT Project", new TaxDebit());
        company.shiftMoney(10_000);
        company.shiftMoney(-7_800);
        company.payTaxes();

        company.setTaxSystem(new TaxDebitMinusCredit());
        company.shiftMoney(10_000);
        company.shiftMoney(-7_800);
        company.payTaxes();


        company.applyDeals(new Deal[]{
                new Expenditure("Ноутбук", 10_000),
                new Sale("Ноутбук", 13_500),});

        company.setTaxSystem(new TaxDebit());

        company.applyDeals(new Deal[]{
                new Expenditure("Ноутбук", 10_000),
                new Sale("Ноутбук", 13_500),});
    }
}