import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.taxes.TaxDebitMinusCredit;

public class TaxDebitMinusCreditTests {

    @Test
    public void testDebitMinusCredit() {

        // arrange
        int debit = 50_000, credit = 27_500, expected = 3_375;
        var taxDebitMinusCredit = new TaxDebitMinusCredit();

        // act
        var actual = taxDebitMinusCredit.calcTaxFor(debit, credit);

        // assert
        Assertions.assertEquals(expected, actual);
    }
}
