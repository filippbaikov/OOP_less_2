import Animals.*;
import Pharmacy.MedicineComponent;
import Pharmacy.implementation.*;
import VetClinic.VeterinaryClinic;

import javax.xml.namespace.QName;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//
//        List<Animal> vetClinicClients = new ArrayList<>();
//        vetClinicClients.add(new Fish(3, 1, LocalDate.now(), "fish", null));
//        vetClinicClients.add(new Lion(200.0f, 1.5f, LocalDate.now(), "lion", new Owner("ahmad")));
//        vetClinicClients.add(new Cat(5.0f, 15.0f, LocalDate.now(), "cat", new Owner("muhamad")));
//        vetClinicClients.add(new Dog(5.0f, 15.0f, LocalDate.now(), "dog", new Owner("sultan")));
//        vetClinicClients.add(new Bear(5.0f, 15.0f, LocalDate.now(), "bear", null));
//        vetClinicClients.add(new Duck(5.0f, 15.0f, LocalDate.now(), "duck", null));
//        vetClinicClients.add(new Eagle(5.0f, 15.0f, LocalDate.now(), "eagle", null));
//        vetClinicClients.add(new BlueWhale(100f, 30, LocalDate.now(), "BlueWhale", null));
//
//
//        VeterinaryClinic veterinaryClinic = new VeterinaryClinic();
        //veterinaryClinic.getFlyable(vetClinicClients);
        //  veterinaryClinic.getGoable(vetClinicClients);
        // veterinaryClinic.getSwimable(vetClinicClients);

//       Swimable fish=new Fish(3, 1, LocalDate.now(), "fish", null);
//        System.out.println(fish.swim());
        MedicineComponent asitron = new Asitromin("asitron", 15.2f, 70);
        MedicineComponent penicilin = new Penicilinium("penicilin", 2.3f, 80);
        MedicineComponent vetbicid = new Vetbisid("vetbicid", 7.1f, 20);

        Medicine2 med = new Medicine2();
        med.addComponent(asitron).addComponent(penicilin).addComponent(vetbicid);
//
//        for (MedicineComponent component:med){
//            System.out.println(component);
//
//        }
//        List<MedicineComponent> medList = new ArrayList<>();
//        medList.add(asitron);
//        medList.add(penicilin);
//        medList.add(vetbicid);
//        System.out.println(medList);
//        Collections.sort(medList, (comp1,comp2)->(int)(comp1.getWeight()-comp2.getWeight()));
//        System.out.println(medList);
        Medicine drug1 = new Medicine();
        drug1.addComponent(new Asitromin("asit", 1.1f, 14));
        drug1.addComponent(new Vetbisid("vet", 5.5f, 24));
        drug1.addComponent(new Penicilinium("pen", 6.2f, 60));

        Medicine drug2 = new Medicine();
        drug2.addComponent(new Asitromin("asitromitsin", 5.1f, 114));
        drug2.addComponent(new Vetbisid("vetirinar", 55.5f, 224));
        drug2.addComponent(new Penicilinium("penic", 67.2f, 600));

        Medicine drug3 = new Medicine();

        drug3.addComponent(new Vetbisid("v", 5.5f, 24));
        drug3.addComponent(new Penicilinium("penicilinium", 70.2f, 333));
        List<Medicine> med1 = new ArrayList<>();
        med1.add(drug1);
        med1.add(drug2);
        med1.add(drug3);

       // System.out.println(med1);

        for (Medicine medicine : med1) {
            System.out.println(medicine);


        }
    }
}

