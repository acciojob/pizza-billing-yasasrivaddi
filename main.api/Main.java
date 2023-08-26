public class Main {
    public static void main(String[] args) {
        Pizza vegPizza = new Pizza();
        vegPizza.addExtraCheese();
        vegPizza.addExtraToppings();
        vegPizza.addPaperBag();
        System.out.println("Base Price Of The Pizza: " + vegPizza.getTotalPrice());
        
        DeluxePizza deluxePizza = new DeluxePizza();
        deluxePizza.addExtraCheese();
        deluxePizza.addExtraToppings();
        System.out.println("Base Price Of The Pizza: " + deluxePizza.getTotalPrice());
    }
}
