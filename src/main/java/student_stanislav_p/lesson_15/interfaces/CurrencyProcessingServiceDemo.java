package student_stanislav_p.lesson_15.interfaces;



import java.util.List;
import java.util.Scanner;

class CurrencyProcessingServiceDemo {

    public static void main(String[] args) {
        List<CurrencyRetrieveService> service = List.of(
                new MySystemSupportedCurrencyRetrieveService(),
                new PartnerSupportedCurrencyRetrieveService(),
                new JavaCurrenciesRetrieveService()
        );

        CurrencyProcessingService processingService = new CurrencyProcessingService(service);

        Scanner scanner = new Scanner(System.in);
        String network = scanner.nextLine();
        PaymentNetwork paymentNetwork = PaymentNetwork.valueOf(network);
        processingService.printSupportedCurrencies(paymentNetwork);
    }
}
