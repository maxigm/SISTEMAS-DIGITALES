

public class ColaSobreListaEnlazada implements Cola {
    private Nodo top;
    private Nodo bottom;

    private class Nodo {
        Nodo anterior,siguiente;
        int valor;
        public Nodo(int valor){
            this.valor = valor;
        }
    }

    public ColaSobreListaEnlazada() {
        this.top = null;
        this.bottom = null;
    }

    public void enqueue(int elem) {
        Nodo nuevoBottom = new Nodo(elem);
        if (this.top == null){
            this.bottom = nuevoBottom;
            this.top = this.bottom;
        }
        else {
            this.bottom.siguiente = nuevoBottom;
            this.bottom = this.bottom.siguiente;
        }
    }

    public int dequeue() {
        int res = this.top.valor;
        this.top = this.top.siguiente;
        return res;
    }

    public int front() {
        return this.top.valor;
    }

    public int rear() {
        return this.bottom.valor;
    }

    public boolean isEmpty() {
        return (this.top == null);
    }

    public boolean isFull() {
        return false;
}
}
