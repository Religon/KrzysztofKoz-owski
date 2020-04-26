package pl.sda.zajęcia13.zad2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Account shared = new Account(1000);

        Method[] methods = shared.getClass().getMethods();
        for(Method method:methods){///wypisanie metod klasy
            System.out.println(method.getName());
        }

        AccountHolder wife = new AccountHolder("Małgosia", shared);
        AccountHolder husband = new AccountHolder("Jas", shared);

        List<AccountHolder> holders = new ArrayList<>();
        holders.add(wife);
        holders.add(husband);
        for(AccountHolder holder: holders){
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    int withdraw = holder.withdraw(1000);
                    System.out.println(holder.getName() + " " + withdraw + " " + Thread.currentThread().getId());
                }
            });
            t.start();
        }
    }
}
