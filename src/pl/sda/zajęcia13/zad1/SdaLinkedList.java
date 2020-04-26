package pl.sda.zajęcia13.zad1;

public class SdaLinkedList<T> {

    private SdaLInkedLIstNode<T> first;

    public T getLast(){
        if(first == null){//albo lista jest pusta
            return null;
        }else {//albo nie
            SdaLInkedLIstNode<T> current = first;
            while (current.getNext() != null){
                current = current.getNext();
            }
            return current.getData();
        }
    }

    //add as first object
    public void add(T toAdd){
        //albo lista jest pusta
        if(first == null){
            first = new SdaLInkedLIstNode<T>();
            first.setData(toAdd);
        }
        else {//albo już jest pierwszy element
            SdaLInkedLIstNode<T> newFirst = new SdaLInkedLIstNode<T>();
            newFirst.setData(toAdd);
            newFirst.setNext(first);
            first = newFirst;
        }

    }
}
