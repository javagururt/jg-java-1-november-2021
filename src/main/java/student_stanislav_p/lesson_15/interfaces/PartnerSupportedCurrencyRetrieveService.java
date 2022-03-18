package student_stanislav_p.lesson_15.interfaces;



import java.util.Currency;
import java.util.List;
import java.util.Set;

class PartnerSupportedCurrencyRetrieveService implements CurrencyRetrieveService {

    private static final List<PaymentNetwork> supportedNetworks = List.of(PaymentNetwork.VISA, PaymentNetwork.AMERICAN_EXPRESS);

    @Override
    public boolean isSupported(PaymentNetwork paymentNetwork) {
        return supportedNetworks.contains(paymentNetwork);
    }

    @Override
    public Set<Currency> retrieveSupportedCurrencies() {
        Currency usd = Currency.getInstance("USD");
        Currency eur = Currency.getInstance("EUR");
        return Set.of(usd, eur);
    }
}
