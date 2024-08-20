public class Pilha {
    private int top;
    private int[] data;

    public Pilha() {
        data = new int[4];
        top = -1;
    }

    public boolean isVazia() {
        return top == -1;
    }

    public void push(int elemento) {
        if (top == data.length - 1) {
            redimensionar(2 * data.length);
        }
        data[++top] = elemento;
    }

    private void redimensionar(int novaCapacidade) {
        int[] novaPilha = new int[novaCapacidade];
        for (int i = 0; i <= top; i++) {
            novaPilha[i] = data[i];
        }
        data = novaPilha;
    }

    public int pop() {
        if (isVazia()) {
            System.out.println("Pilha vazia. Não há elementos para desempilhar.");
            return -1;
        }
        int elementoRemovido = data[top--];

    return elementoRemovido;
}}
