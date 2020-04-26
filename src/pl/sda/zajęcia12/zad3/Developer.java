package pl.sda.zajęcia12.zad3;

import java.time.LocalTime;


public class Developer implements Runnable {


    private String name;
    private int start;
    private boolean working = true;
    private int currentUpdateFrequency = 10;


    public Developer(String name, int start) {

        this.name = name;
        this.start = start;
    }


    public void release() {
        working = false;
        System.out.println(name + "\tkonczy prace");
    }


    public void updateFrequency() {
        if (currentUpdateFrequency > 2) {
            currentUpdateFrequency -= 2;
        }
    }

    public long getDelay() {
        return start;
    }


    @Override

    public void run() {
        System.out.println(name + "\tzaczal prace o\t" + LocalTime.now());
        while (working) {
            try {
                Thread.sleep(currentUpdateFrequency * 1000);
            } catch (InterruptedException e) {
            }
            //FIXME: moge juz nie pracowac (working==false) ale ciagle powiem ze pracuje... :(
            System.out.println(name + "\tciagle pracuje\t" + LocalTime.now());
        }
    }

}
