public class KidsMealBuilder implements MealBuilder {
    private FastFoodOrder order = new FastFoodOrder();


    public void buildBurger(){
        order.setBurger("Chicken Burger");
    }

    public void buildDrink(){
        order.setDrink("Apple Juice");
    }

    public void buildSide(){
        order.setSide("Chicken Nuggets");
    }

    public void buildToy(){
        order.setToy("Toy Bundle 1");
    }

    public FastFoodOrder getResult() {
        return this.order;
    }
}
