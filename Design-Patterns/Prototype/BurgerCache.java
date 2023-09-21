import java.util.Hashtable;
public class BurgerCache {
    private static Hashtable<String, Burger> BurgerMap = new Hashtable<String, Burger>();
    public static Burger getBurger(String name) {
        Burger cachedBurger = BurgerMap.get(name);
        return (Burger) cachedBurger.clone();

    }
    // for each Burger run database query and create shape
// shapeMap.put(shapeKey, shape);
// for example, we are adding three shapes
    public static void loadCache() {
        CheeseBurger cb = new CheeseBurger();
        cb.setname("Cheese wala Burger");
        BurgerMap.put(cb.getname(),cb);

        FishBurger fb = new FishBurger();
        fb.setname("Fish wala Burger");
        BurgerMap.put(fb.getname(),fb);
    }
}