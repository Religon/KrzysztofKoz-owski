package pl.sda.zajęcia9.Bank;

public class Bank {
    public static void main(String[] args) {
        Personal_Client c1 = new Personal_Client("Jan", "Kowalski");
        Bisness_Client c2 = new Bisness_Client("Idea");
        if(c2 instanceof Bisness_Client){
            System.out.print("bisness ");
            System.out.println(((Bisness_Client)c2).getNip());
        }

        Credit_account a1 = new Credit_account("1234",500, c1);
        Checking_account a2 = new Checking_account("3214",100, c1);
        Credit_account a3 = new Credit_account("9876",200, c2);

        System.out.println("Stan konta a1:" + a1.check_balans());
        System.out.println("Stan konta a2:" + a2.check_balans());
        System.out.println("Stan konta a3:" + a3.check_balans());

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(c1);
    }
}
