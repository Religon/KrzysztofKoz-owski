package pl.sda.zajęcia12.zad3b;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WorkSymulation {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Krzysztof", 5));
        workers.add(new Worker("Bartosz", 6));
        workers.add(new Worker("Agnieszka", 7));
        workers.add(new Worker("Kinga", 8));


        for(Worker worker: workers){
            new Thread(worker).start();
        }

        while (!workers.isEmpty()){
            try {
                Thread.sleep(30*1000);
                realseRandomWorker(workers);
            } catch (InterruptedException e) {
                System.err.println("interrupted");
            }
        }

    }

    private static void realseRandomWorker(List<Worker>workers){
        Worker work = randomWorker(workers);
        work.release();
        workers.remove(work);
        for (Worker worker: workers){
            worker.updateFreuqency();
        }
    }

    private static Worker randomWorker(List<Worker>workers){
        Random r = new Random();
        int toRelease = r.nextInt(workers.size());
        return workers.get(toRelease);
    }
}
