package student_eduards_puzirevskis.lesson_15.level_2_intern;


class FraudDetector {

     public boolean doesThisTraderIsSafe(Trader trader) {
         return !doesTraderHaveFraudName(trader) && !tradersCityIsNotAllowed(trader);
     }

     private boolean doesTraderHaveFraudName(Trader trader) {
         String traderName = trader.getFullName();
         return traderName.equals("Pokemon");
     }

     private boolean tradersCityIsNotAllowed(Trader trader) {
         String cityName = trader.getCity();
         return cityName.equals("Sidney");
     }

 }
