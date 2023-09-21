public class PlanFactory {
    //use getPlan method to get object of type shape
    public Plan getPlan(String planType){
        if(planType == null){
            return null; }
        if(planType.equalsIgnoreCase("Domestic")){
            return new DomesticPlan();
        } else if(planType.equalsIgnoreCase("Industrial")){
            return new IndustrialPlan();
        } else if(planType.equalsIgnoreCase("Commercial")){
            return new ComesrcialPlan(); }
        return null; }
}