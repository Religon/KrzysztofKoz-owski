package pl.sda.zajęcia13.zad2;

public class Account {
    private int balance;

    public Account(int value) {
        balance = value;
    }

    public int withdraw(int toWithdraw) {
        synchronized (this) {
            System.out.println("jestem w środku " + Thread.currentThread().getId());

            if (balance >= toWithdraw) {
                try {
                    Thread.sleep(10 * 1000);
                } catch (InterruptedException e) {
                }

                balance -= toWithdraw;
                return toWithdraw;
            } else {
                return 0;
            }
        }
    }

    public void deposit(){
        synchronized (this){

        }
    }
}

