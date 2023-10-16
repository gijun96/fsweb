package a1016.Object2;

public class Archer {
    String name;
    String power;

    public Archer(String name, String power) {
        this.name = name;
        this.power = power;
    }
    public boolean equals(Object obj){
        Archer temp = (Archer) obj;
        return name.equals(temp.name) && power.equals(temp.power);
    }
}
