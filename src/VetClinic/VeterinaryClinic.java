package VetClinic;

import Animals.Animal;
import Animals.Flyable;
import Animals.Goable;
import Animals.Swimable;
import com.sun.jdi.InterfaceType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VeterinaryClinic {


    public static Map<Integer,String> cabinets;

public VeterinaryClinic(){
    cabinets.put(1,"therapist"); // терапия
    cabinets.put(2,"Treatment room"); // процедурный кабинет
    cabinets.put(3,"dental office"); //стоматолог
    cabinets.put(4, "Vaccination room"); // вакцинация
    cabinets.put(5, "Surgical office"); //хирургический кабинет
    cabinets.put(6,"Postoperative hospital"); // послеоперационная комната
}


    public void getFlyable(List<Animal> animals) {
        for (Animal clients : animals) {
            if (clients instanceof Flyable)
                System.out.println(clients);
        }
    }

    public void getGoable(List<Animal> vetClinicClients) {
        for (Animal clients : vetClinicClients) {
            if (clients instanceof Goable)
                System.out.println(clients);
        }
    }

    public void getSwimable(List<Animal> vetClinicClients) {
        for (Animal clients : vetClinicClients) {
            if (clients instanceof Swimable)
                System.out.println(clients);
        }
    }

    }

