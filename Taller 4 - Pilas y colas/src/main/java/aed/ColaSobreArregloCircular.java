

public class ColaSobreArregloCircular implements Cola {

    private int[] cola;
    private int top;
    private int bottom;

    public ColaSobreArregloCircular(int i) {
        this.cola = new int [i];
        this.top = -1;
        this.bottom = -1;
    }

    // Inserta en el final (tail)
    public void enqueue(int elem) {
        this.bottom += 1;
        this.cola[this.bottom] = elem;
    }

    // Obtiene el elemento del frente (head)
    public int dequeue() {
        this.top += 1;
        int res = this.cola[this.top];
        return res;
    }

    // Obtiene el elemento del frente (head)
    public int front() {
        return this.cola[this.top];
    }

    // Obtiene el elemento del final (tail)
    public int rear() {
        return this.cola[this.bottom + 1];
    }

    public boolean isEmpty() {
        return (this.top == this.bottom);
    }

    public boolean isFull() {
        return (this.top == -1 & this.bottom == (this.cola.length-1));
    }
}
