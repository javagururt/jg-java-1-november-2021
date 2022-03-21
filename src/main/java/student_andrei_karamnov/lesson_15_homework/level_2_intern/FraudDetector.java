package student_andrei_karamnov.lesson_15_homework.level_2_intern;

class FraudDetector {

    public boolean isValidatedTrader(Trader trader) {
        return !fraudTraderName(trader) && !tradersCity(trader);
    }

    private boolean fraudTraderName (Trader trader) {
        String traderName = trader.getFullName();
        return traderName.equals("Pokemon");
    }

    private boolean tradersCity(Trader trader) {
        String cityName = trader.getCity();
        return cityName.equals("Sidney");
    }


}
