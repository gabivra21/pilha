import java.util.Stack;

public class Pilha extends Stack {
    private int top =-1;
    private int [] data;

    public Pilha(int capacidade){
        int capa = capacidade;
    }

    public void push (int data){
        top = top + 1;
    }

    public int pop(int data){
        top = top - 1;
        return top;
    }
}
