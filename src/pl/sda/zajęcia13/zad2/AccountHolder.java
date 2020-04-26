package pl.sda.zajęcia13.zad2;

public class AccountHolder {
    private  String name;
    private Account account;


    public AccountHolder(String name, Account account){
        this.account = account;
        this.name = name;
    }

    public int withdraw(int value){
        return account.withdraw(value);
    }

    public String getName() {
        return name;
    }
}
