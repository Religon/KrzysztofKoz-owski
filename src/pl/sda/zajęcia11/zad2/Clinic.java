package pl.sda.zajęcia11.zad2;

import pl.sda.zajęcia9.Bank.Client;

import java.util.ArrayDeque;
import java.util.Queue;

public class Clinic {

    private Queue<Patient> queue = new ArrayDeque<>(); // LinkedList / bufor przesuwny zaimplementowany na podstawie tablicy

    public static void main(String[] args) {
        Clinic clinic = new Clinic();
        clinic.register("zbyszek");
        clinic.register("jarek");
        clinic.handle();
        clinic.register("julek");

    }

    private void register(String name){
        queue.add(new Patient(name));
    }

    private  Patient handle(){
        Patient toServe = queue.poll();
        System.out.println("Obsługuje: " +toServe);
        return toServe;
    }

}
