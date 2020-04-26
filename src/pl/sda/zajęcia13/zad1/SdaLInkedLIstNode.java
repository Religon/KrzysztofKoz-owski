package pl.sda.zajęcia13.zad1;

public class SdaLInkedLIstNode<T> {
    private T data;
    private SdaLInkedLIstNode<T> next;

    public  void setData(T toAdd){
        this.data = toAdd;
    }

    public void setNext(SdaLInkedLIstNode<T> next){
        this.next = next;
    }

    public SdaLInkedLIstNode<T> getNext(){
        return next;
    }

    public T getData(){
        return data;
    }
}
