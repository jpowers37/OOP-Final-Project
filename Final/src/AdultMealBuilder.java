public class AdultMealBuilder implements MealBuilder {
    private FastFoodOrder order = new FastFoodOrder();


    public void buildBurger(){
        order.setBurger("Double CheeseBurger");
    }

    public void buildDrink(){
        order.setDrink("Coke XLarge");
    }

    public void buildSide(){
        order.setSide("Onion Rings");
    }

    public void buildToy(){
        order.setToy("No Toy");
    }

    public FastFoodOrder getResult() {
        return this.order;
    }
}
