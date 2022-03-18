package student_stanislav_p.lesson_15.interfaces;



import java.util.Currency;
import java.util.Set;

public interface CurrencyRetrieveService {

    boolean isSupported(PaymentNetwork paymentNetwork);

    Set<Currency> retrieveSupportedCurrencies();
}
