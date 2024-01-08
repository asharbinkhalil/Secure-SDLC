public class FishBurger extends Burger {
    public FishBurger(){

        setname("Fish Burger");
        setdescription("High quality Fish");
    }

    @Override
    public void create() {
        System.out.println("Inside FishBurger::create() method.");
    }
}