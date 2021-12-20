package student_eduards_puzirevskis.lesson_3_oop_first_look.level_7_senior.Task_29;

class Coffee {
    public String kindOfCoffee;
    public int countOfCups;
    public boolean doesItGiveEnergy;

    public String getKindOfCoffee() {
        System.out.println("What kind a coffee do you like?");
        System.out.println("For example, Latte, black coffee, with milk");
        return kindOfCoffee;
    }

    public void setKindOfCoffee(String kindOfCoffee) {
        this.kindOfCoffee = kindOfCoffee;
    }

    public int getCountOfCups() {
        System.out.println("How much coffee cups do you drink per day?");
        return countOfCups;
    }

    public void setCountOfCups(int countOfCups) {
        this.countOfCups = countOfCups;
    }

    public boolean isDoesItGiveEnergy() {
        System.out.println("Does it give you energy?");
        System.out.println("1- Yes");
        System.out.println("0- No");
        return doesItGiveEnergy;
    }

    public void setDoesItGiveEnergy(boolean doesItGiveEnergy) {
        this.doesItGiveEnergy = doesItGiveEnergy;
    }
    public void soWhatDoWeHave() {
        System.out.println("So, as I understood...");
        System.out.println("You like " + this.kindOfCoffee + " kind of coffee.");
        System.out.println("Basically, you drink " + this.countOfCups + " cup(s) a day.");
        if (this.doesItGiveEnergy == true) {
            System.out.println("And it gives you a lot of energy");
        } else {
            System.out.println("But, unfortunately, it doesn't give you energy");
        }
    }
}
