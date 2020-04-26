package pl.sda.zajęcia12.zad3b;

import java.time.LocalDate;
import java.time.LocalTime;

public class Worker implements Runnable{
    private String imie;
    private int time;
    private boolean active;
    private boolean working;
    private  int currentUpdateFrequency = 10;

    public Worker(String imie, int time){
        this.imie = imie;
        this.time = time;
        this.active = true;
    }

    public void release(){
        working = false;
        System.out.println(imie + "\tkonczy prace");
    }

    public void updateFreuqency(){
        if(currentUpdateFrequency > 2){
            currentUpdateFrequency -= 2;
        }
    }


    @Override
    public void run() {
        System.out.println(imie + "\tzaczal prace p\t" + LocalTime.now());
        while (working){
            try{
                Thread.sleep(currentUpdateFrequency * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(working){
                System.out.println(imie + "\tciagle pracuje\t" + LocalTime.now());
            }
        }
    }
}
