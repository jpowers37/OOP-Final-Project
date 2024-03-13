public class HappyMealBuilder implements MealBuilder {
    private FastFoodOrder order = new FastFoodOrder();


    public void buildBurger(){
        order.setBurger("HamBurger");
    }

    public void buildDrink(){
        order.setDrink("Coke Zero");
    }

    public void buildSide(){
        order.setSide("French Fries");
    }

    public void buildToy(){
        order.setToy("Toy Bundle 2");
    }

    public FastFoodOrder getResult() {
        return this.order;
    }
}
