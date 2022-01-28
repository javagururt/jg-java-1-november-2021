package student_eduards_puzirevskis.lesson_4_if_statement.level_6_middle;

 class Stock {

     public static void main(String[] args) {
         Stock baranki = new Stock("Baranki", 15);
         baranki.getPriceInformation();
         baranki.updatePrice(20);
         baranki.updatePrice(11);
         baranki.updatePrice(36);
         baranki.updatePrice(22);
         baranki.getPriceInformation();
     }

     public String name;
     public int currentPrice;
     public int minPrice;
     public int maxPrice;

     Stock(String name, int currentPrice) {
         this.name = name;
         this.currentPrice = currentPrice;
         this.minPrice = currentPrice;
         this.maxPrice = currentPrice;
     }

     public void updatePrice(int newPrice) {
         currentPrice = newPrice;
         if (newPrice < minPrice) {
             minPrice = newPrice;
         } else if (newPrice > maxPrice) {
             maxPrice = newPrice;
         }
     }

     public void getPriceInformation() {
         System.out.println("Company = " + name + "  Current price = " + currentPrice + " Min price = " + minPrice + " Max price = " + maxPrice);
     }
}
