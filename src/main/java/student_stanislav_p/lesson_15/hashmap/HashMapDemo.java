package student_stanislav_p.lesson_15.hashmap;

import teacher.lesson_15.hashmap.PaymentNetwork;

import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class HashMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Ruslan", 30);
        Integer age = hashMap.get("Ruslan");
        hashMap.remove("Ruslan");
        hashMap.put("Ruslans", age);

        Map<List<PaymentNetwork>, List<Currency>> paymentNetworkToCurrency = new HashMap<>();

        paymentNetworkToCurrency.put(List.of(PaymentNetwork.VISA), List.of(Currency.getInstance("EUR")));
        System.out.println(paymentNetworkToCurrency);
        List<Currency> supportedCurrency = paymentNetworkToCurrency.get(List.of(PaymentNetwork.VISA));
        System.out.println(supportedCurrency);
        paymentNetworkToCurrency.put(List.of(PaymentNetwork.VISA, PaymentNetwork.MASTERCARD), List.of(
                Currency.getInstance("EUR"),
                Currency.getInstance("USD")));

        List<Currency> supportedByMDESandVISA = paymentNetworkToCurrency.get(List.of(
                PaymentNetwork.VISA,
                PaymentNetwork.MASTERCARD));
        System.out.println(supportedByMDESandVISA);

    }
}
