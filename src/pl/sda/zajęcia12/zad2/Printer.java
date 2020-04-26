package pl.sda.zajęcia12.zad2;

public class Printer implements Runnable {

    private boolean isActive;
    private int time;
    private String text;
    private  int counter = 0;

    public Printer(String text, int time){
        this.text = text;
        this.time = time;
        this.isActive = true;
    }
    
    @Override
    public void run() {
        while (true) {
            System.out.println(text + " " + counter);
            counter++;
            try {
                Thread.sleep(time);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void deactivate() {
    }
}
