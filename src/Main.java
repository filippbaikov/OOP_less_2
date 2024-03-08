import Animals.*;
import VetClinic.VeterinaryClinic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> vetClinicClients = new ArrayList<>();
        vetClinicClients.add(new Fish(3, 1, LocalDate.now(), "fish", null));
        vetClinicClients.add(new Lion(200.0f, 1.5f, LocalDate.now(), "lion", new Owner("ahmad")));
        vetClinicClients.add(new Cat(5.0f, 15.0f, LocalDate.now(), "cat", new Owner("muhamad")));
        vetClinicClients.add(new Dog(5.0f, 15.0f, LocalDate.now(), "dog", new Owner("sultan")));
        vetClinicClients.add(new Bear(5.0f, 15.0f, LocalDate.now(), "bear", null));
        vetClinicClients.add(new Duck(5.0f, 15.0f, LocalDate.now(), "duck", null));
        vetClinicClients.add(new Eagle(5.0f, 15.0f, LocalDate.now(), "eagle", null));
        vetClinicClients.add(new BlueWhale(100f, 30, LocalDate.now(), "BlueWhale", null));


        VeterinaryClinic veterinaryClinic = new VeterinaryClinic();
        //veterinaryClinic.getFlyable(vetClinicClients);
        //  veterinaryClinic.getGoable(vetClinicClients);
        // veterinaryClinic.getSwimable(vetClinicClients);

       Swimable fish=new Fish(3, 1, LocalDate.now(), "fish", null);
        System.out.println(fish.swim());


        }
    }

