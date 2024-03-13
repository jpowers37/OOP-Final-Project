public class Director {
    private MealBuilder builder;

    public Director(MealBuilder builder){
        this.builder = builder;
    }

    public void build(){
        builder.buildBurger();
        builder.buildDrink();
        builder.buildSide();
        builder.buildToy();
    }

    public FastFoodOrder getOrder() {
        return builder.getResult();
    }
}
