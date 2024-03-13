public class Client {
    public static void main(String[] args) {
        MealBuilder kidsMealBuilder = new KidsMealBuilder();
        Director kidsMealDirector = new Director(kidsMealBuilder);
        kidsMealDirector.build();
        FastFoodOrder kidsMeal = kidsMealDirector.getOrder();
        System.out.println("KidsMeal: " + kidsMeal.getBurger() + ", " + kidsMeal.getDrink() + ", " + kidsMeal.getSide() + ", " + kidsMeal.getToy());

        MealBuilder AdultMealBuilder = new AdultMealBuilder();
        Director AdultMealDirector = new Director(AdultMealBuilder);
        AdultMealDirector.build();
        FastFoodOrder AdultMeal = AdultMealDirector.getOrder();
        System.out.println("AdultMeal: " + AdultMeal.getBurger() + ", " + AdultMeal.getDrink() + ", " + AdultMeal.getSide() + ", " + AdultMeal.getToy());

        MealBuilder HappyMealBuilder = new HappyMealBuilder();
        Director HappyMealDirector = new Director(HappyMealBuilder);
        HappyMealDirector.build();
        FastFoodOrder HappyMeal = HappyMealDirector.getOrder();
        System.out.println("HappyMeal: " + HappyMeal.getBurger() + ", " + HappyMeal.getDrink() + ", " + HappyMeal.getSide() + ", " + HappyMeal.getToy());

    }
}
