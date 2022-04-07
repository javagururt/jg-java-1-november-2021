package student_eduards_puzirevskis.lesson_14.level_3_4_junior;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TransactionAnalysisService {

    public List<Transaction> findTransactionsByYear(List<Transaction> transactionList, int year) {
        return transactionList.stream()
                .filter(transaction -> transaction.getYear() == year)
                .toList();
    }

    public List<Transaction> sortTransactionsByValueIncrease(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .toList();
    }

    public List<Transaction> sortTransactionsByValueDecrease(List<Transaction> transactions) {
        return  transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .toList();
    }

    public List<Transaction> sortTransactionsByYearAndValueIncrease(List<Transaction> transactionList, int year) {
        return transactionList.stream()
                .filter(transaction -> transaction.getYear() == year)
                .sorted(Comparator.comparing(Transaction::getValue))
                .toList();
    }

    public List<Integer> findTransactionYear(List<Transaction> transactionList) {
        return transactionList.stream()
                .map(Transaction::getYear)
                .toList();
    }

    public Set<Integer> findTransactionUniqueYear(List<Transaction> transactionList) {
        return transactionList.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toSet());
    }

    public Set<Trader> findUniqueTraders(List<Transaction> transactionList) {
        return transactionList.stream()
                .map(Transaction::getTrader)
                .collect(Collectors.toSet());
    }

    public Set<String> findUniqueTradersCities(List<Transaction> transactionList) {
        return transactionList.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .collect(Collectors.toSet());
    }

    public Set<String> findTradersByCity(List<Transaction> transactionList,String city) {
        return transactionList.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals(city))
                .map(transaction -> transaction.getTrader().getName())
                .collect(Collectors.toSet());
    }

}
