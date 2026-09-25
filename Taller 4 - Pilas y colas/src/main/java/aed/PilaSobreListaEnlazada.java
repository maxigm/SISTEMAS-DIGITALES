

public class PilaSobreListaEnlazada implements Pila {
    private Nodo top;

    private class Nodo {
        Nodo siguiente;
        int valor;
        public Nodo(int valor){
            this.valor = valor;
        }
    }
    

    public PilaSobreListaEnlazada() {
        this.top = null;
    }

    public void push(int elem) {
        Nodo nuevoTop = new Nodo (elem);
        nuevoTop.siguiente = this.top;
        this.top = nuevoTop;
    } 

    public int pop() {
        int res = this.top.valor;
        this.top = this.top.siguiente;

        return res;
    }

    public int top() {
        return this.top.valor;
    }

    public boolean isEmpty() {
        return (this.top == null);
    }

    public boolean isFull() {
        return (this.top != null && this.top.siguiente == null);
    }
}
