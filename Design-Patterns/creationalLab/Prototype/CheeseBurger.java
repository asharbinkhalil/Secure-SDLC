public class CheeseBurger extends Burger {
    public CheeseBurger(){

        setname("Cheese Burger");
        setdescription("High quality cheese");
    }

    @Override
    public void create() {
        System.out.println("Inside CheeseBurger::create() method.");
    }
}