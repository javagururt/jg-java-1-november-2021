package student_stanislav_p.lesson_15.interfaces;



import java.util.List;

class CurrencyProcessingService {

    private final List<CurrencyRetrieveService> currencyRetrieveServices;

    public CurrencyProcessingService(List<CurrencyRetrieveService> currencyRetrieveServices) {
        this.currencyRetrieveServices = currencyRetrieveServices;
    }

    void printSupportedCurrencies(PaymentNetwork paymentNetwork) {
        currencyRetrieveServices.stream()
                .filter(service -> service.isSupported(paymentNetwork))
                .flatMap(service -> service.retrieveSupportedCurrencies().stream())
                .distinct()
                .forEach(currency -> System.out.println("Supported currency: " + currency));
    }
}
