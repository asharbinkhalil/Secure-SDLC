public class Main {
    public static void main(String[] args) {
        BurgerCache.loadCache();
        Burger clonedBurger = (Burger) BurgerCache.getBurger("Cheese wala Burger");
        System.out.println("Burger : " + clonedBurger.getdescription());

        Burger clonedBurger2 = (Burger) BurgerCache.getBurger("Fish wala Burger");
        System.out.println("Burger : " + clonedBurger2.getdescription());

        }
}