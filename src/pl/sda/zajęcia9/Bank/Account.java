package pl.sda.zajęcia9.Bank;

public class Account {
    ///pola
    private String account_number;
    protected int balance;  ////stan konta
    private Client client;

    ///metody
    public void deposit(int cash) {
        if (cash > 0){
            balance += cash;
        }
    }

    public int withdraw(int cash){
        if(cash > 0){
            System.out.println("Nie można!");
            return 0;
        }
        if(cash <= balance){
            balance -= cash;
        }
        else {
            return 0;
        }
        return cash;
    }

    public int check_balans(){
        return balance;
    }

    public boolean transfer(Account target, int amount, String number){
        balance -= amount;
        target.balance += amount;
        return true;
    }

    @Override
    public String toString() {
        String x = super.toString();
        return "Stan Konta:" + account_number + ": " + balance;
    }

    ////konstruktor

    public Account(String account_number, int balans, Client client){
        this.account_number = account_number;
        this.balance = balans;
        this.client = client;
        super.toString();
    }


    ///settery i gettery

    public void setAccount_number(String account_number){
        this.account_number = account_number;
    }

    public String getAccount_number(){
        return account_number;
    }

    public  void setBalans(int balans){
        this.balance = balans;
    }


}
