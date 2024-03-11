package Pharmacy.implementation;

import Pharmacy.MedicineComponent;


import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Medicine implements Iterator<MedicineComponent>, Comparable<Medicine> {
    private List<MedicineComponent> components;
    private int index;

    public Medicine() {
        this.components = new ArrayList<>();
        this.index = 0;

    }

    public Medicine addComponent(MedicineComponent component) {
        components.add(component);
        return this;
    }

    @Override
    public boolean hasNext() {
        //  return components.iterator().hasNext();
        return index < components.size();
    }

    @Override
    public MedicineComponent next() {
        //  return components.iterator().next();
        return components.get(index++);
    }

    @Override
    public String toString() {
        return components.toString();
    }


    @Override
    public int compareTo(Medicine o) {
        float a=components.stream().map(MedicineComponent::getWeight).reduce(0f, Float::sum);
        float b=o.components.stream().map(MedicineComponent::getWeight).reduce(0f,Float::sum);
        int weightComp=Float.compare(a,b);
        if(weightComp!=0)
            return weightComp;



        return Integer.compare(this.components.size(), o.components.size());
    }


}
