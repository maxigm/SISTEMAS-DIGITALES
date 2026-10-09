package aed;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class SistemaPedidos {
    /*Completar con los atributos privados*/
    ArrayList<Handle<Pedido>> pedidosPorID;
    ListaEnlazada<Pedido> pedidosPorLlegada;


    public SistemaPedidos(){
        pedidosPorID = new ArrayList<Handle<Pedido>>();
        pedidosPorLlegada = new ListaEnlazada<Pedido>();
    }

    public void agregarPedido(Pedido pedido){
        this.pedidosPorLlegada.agregarAtras(pedido);
        //this.pedidosPorID.agregarOrdenado(pedido);
    }

    private void agregarOrdenado(Handle<Pedido> p){
        int i = 0;
        while (this.pedidosPorID.contains(p) == false){
            //if (p.valor()  this.pedidosPorID.get(i).valor()){}
        }
    }

    public Pedido proximoPedidoPorId(){
        Pedido res = new Pedido(0, 0, 0);
        int indiceBorrar = 0;
        for (int i = 0; i < this.pedidosPorID.size() - 1;i += 1){
            if (i == 0){
                res = this.pedidosPorID.get(i).valor();
            }
            else {
                if (i == 0){
                    res = this.pedidosPorID.get(i).valor();
                    indiceBorrar = i;
                }
            }
        }
        this.pedidosPorID.remove(indiceBorrar);
        return res;
    }

    public Pedido proximoPedidoPorLlegada(){
        Pedido pedido = this.pedidosPorLlegada.obtener(0) ;
        this.pedidosPorLlegada.eliminar(0);
        for (int i = 0;i < this.pedidosPorID.size();i += 1){
            if (this.pedidosPorID.get(i).valor() == pedido){
                this.pedidosPorID.remove(i);
            }
        }
        return pedido;
    }

    public Pedido pedidoMenorId(){
        return this.pedidosPorID.get(0).valor();
    }

    public String obtenerPedidosEnOrdenDeLlegada(){
        String res = "[";
        for (int i = 0; i < this.pedidosPorLlegada.longitud(); i += 1){
            Pedido p = this.pedidosPorLlegada.obtener(i);
            if (i == 0){
                res = res + p.toString();
            }
            else {
                res = res + ", " + p.toString();
            }
        }
        res = res + "]";
        return res;
    }

    public String obtenerPedidosOrdenadosPorId(){
        String res = "[";
        for (int i = 0; i < this.pedidosPorID.size(); i += 1){
            Pedido p = this.pedidosPorID.get(i).valor();
            if (i == 0){
                res = res + p.toString();
            }
            else {
                res = res + ", " + p.toString();
            }
        }
        res = res + "]";
        return res;
    }
}
