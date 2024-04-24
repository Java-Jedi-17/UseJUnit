import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.taxes.TaxDebit;

public class TaxDebitTests {

    @Test
    public void testDebit() {

        // arrange
        int debit = 10_000, credit = 7_500, expected = 600;
        var taxDebit = new TaxDebit();

        // act
        var actual = taxDebit.calcTaxFor(debit, credit);

        // assert
        Assertions.assertEquals(expected, actual);
    }
}
