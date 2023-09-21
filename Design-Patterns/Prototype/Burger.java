public abstract class Burger implements Cloneable {
    private String name;
    protected String description;
    abstract void create();
    public String getdescription(){
        return description;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public void setdescription(String desc) {
        this.description = desc;
    }
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}