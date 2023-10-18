public class Main {
    public static void main(String[] args) {
        PlanFactory PlanFactory = new PlanFactory();

//get an object of Circle and call its draw method.
        Plan plan1 = PlanFactory.getPlan("Commercial");
        System.out.println(plan1.calculateBill(81.1));

//get an object of Rectangle and call its draw method.
        Plan plan2 = PlanFactory.getPlan("Industrial");
        System.out.println(plan1.calculateBill(91.1));

//get an object of Square and call its draw method.
        Plan plan3 = PlanFactory.getPlan("Domestic");
        System.out.println(plan1.calculateBill(31.1));

    }
}