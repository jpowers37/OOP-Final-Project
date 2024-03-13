public interface MealBuilder {
    void buildBurger();
    void buildDrink();
    void buildSide();
    void buildToy();

    FastFoodOrder getResult();
}
