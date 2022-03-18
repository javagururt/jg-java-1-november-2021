package student_stanislav_p.lesson_15.interfaces;



import java.util.Currency;
import java.util.Set;

class MySystemSupportedCurrencyRetrieveService implements CurrencyRetrieveService {
    @Override
    public boolean isSupported(PaymentNetwork paymentNetwork) {
        return paymentNetwork == PaymentNetwork.MASTERCARD;
    }

    @Override
    public Set<Currency> retrieveSupportedCurrencies() {
        Currency currency = Currency.getInstance("USD");
        return Set.of(currency);
    }
}
