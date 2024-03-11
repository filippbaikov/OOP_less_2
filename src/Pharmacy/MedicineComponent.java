package Pharmacy;

public abstract class MedicineComponent implements Comparable<MedicineComponent> {
    private String name;
    private float weight;
    private int componentPower;

    public MedicineComponent(String name, float weight, int componentPower) {
        this.name = name;
        this.weight = weight;
        this.componentPower = componentPower;
    }

    public int getComponentPower() {
        return componentPower;
    }

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MedicineComponent{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", componentPower=" + componentPower +
                '}';
    }

    @Override
    public int compareTo(MedicineComponent o) {
        return Integer.compare(this.componentPower, o.componentPower);
//        if (this.componentPower < o.componentPower)
//            return 1;
//        else if (this.componentPower > o.componentPower)
//            return -1;
//        else
//            return 0;

        //второй вариант
     //   return componentPower-o.componentPower;
    }
}
