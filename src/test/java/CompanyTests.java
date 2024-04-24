import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.deal.Deal;
import ru.netology.deal.Expenditure;
import ru.netology.deal.Sale;
import ru.netology.taxes.TaxDebit;

public class CompanyTests {

    @Test
    public void testCompany() {

        // arrange
        Deal[] deals = {
                new Expenditure("Ноутбук", 10_000),
                new Sale("Ноутбук", 13_500),
        };
        int expected = 810;
        Company company = new Company("IT Project", new TaxDebit());

        // act
        var actual = company.applyDeals(deals);

        // assert
        Assertions.assertEquals(expected, actual);
    }
}
