package pl.sda.zajęcia13;

import java.util.LinkedList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FuncionalProgrammingExample {
    public static void main(String[] args) {
        functional();
        //nonFunctional();
    }

    private static void functional(){
        /*List<Integer> ints*/
        OptionalInt sum = IntStream.rangeClosed(0,100).
                filter(n->n< 6).///1 2 3 4 5
                map(n->n*2).// 2 4 6 8 10
                reduce((n1,n2)->n1 + n2);//sum
                //boxed().
                //collect(Collectors.toList());

        //System.out.println(ints);
        System.out.println(sum.getAsInt());
    }

    private static void nonFunctional(){
        List<Integer> ints = new LinkedList<>();
        for(int i = 0; i < 100; i++){
            ints.add(i);
        }

        for(int i = 0; i < ints.size(); i++){
            if(ints.get(i) % 2 == 0){
                ints.remove(i);
                i--;
            }
        }
    }
}
