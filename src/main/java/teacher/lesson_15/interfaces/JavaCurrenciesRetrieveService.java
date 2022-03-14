package teacher.lesson_15.interfaces;

import java.util.Currency;
import java.util.List;
import java.util.Set;

class JavaCurrenciesRetrieveService implements CurrencyRetrieveService {

    private static final List<PaymentNetwork> supportedNetworks = List.of(PaymentNetwork.UNION_PAY, PaymentNetwork.MASTERCARD);

    @Override
    public boolean isSupported(PaymentNetwork paymentNetwork) {
        return supportedNetworks.contains(paymentNetwork);
    }

    @Override
    public Set<Currency> retrieveSupportedCurrencies() {
        return Currency.getAvailableCurrencies();
    }
}
