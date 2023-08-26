public class Pizza {
    protected boolean extraCheese;
    protected boolean extraToppings;
    protected boolean paperBag;
    protected int basePrice;

    public Pizza() {
        extraCheese = false;
        extraToppings = false;
        paperBag = false;
    }

    public void addExtraCheese() {
        if (!extraCheese) {
            extraCheese = true;
            basePrice += 80;
        }
    }

    public void addExtraToppings() {
        if (!extraToppings) {
            extraToppings = true;
            basePrice += 70;
        }
    }

    public void addPaperBag() {
        if (!paperBag) {
            paperBag = true;
            basePrice += 20;
        }
    }

    public int getTotalPrice() {
        return basePrice;
    }
}
