

public class PilaSobreArreglo implements Pila {
    private int[] pila;
    private int top;

    public PilaSobreArreglo(int capacity) {
        this.pila = new int[capacity];
        this.top = -1;
    }

    public void push(int elem) {
        this.top += 1;
        this.pila[top] = elem;
    }
        
    public int pop() {
        Integer res = this.pila[top];
        this.top -= 1;
        return res;
    }

    public int top() {
        return this.pila[top];
    }

    public boolean isEmpty() {
        boolean res = false;
        if (this.top == -1){
            res = true;
        }
        return res;
    }

    public boolean isFull() {
        boolean res = false;
        if ((this.top + 1) >= this.pila.length){
            res = true;
        }
        return res;
    }
}
