package pl.sda.zajęcia9.Bank;

public class Credit_account extends Account {

    public Credit_account(String account_number, int balans, Client client) {
        super(account_number, balans, client);
    }

    @Override
    public int withdraw(int cash) {
        super.balance -= cash;
        return cash;
    }
}
