
package exemplocoposição;

import java.util.ArrayList;

public class Pedido {
    private int idIPedido;
    private String data;
    private double valorDesconto;
    private ArrayList<Item> itensPedido;

    public Pedido() {
    }

    public Pedido(int idIPedido, String data, double valorDesconto, ArrayList<Item> itensPedido) {
        this.idIPedido = idIPedido;
        this.data = data;
        this.valorDesconto = valorDesconto;
        this.itensPedido = itensPedido;
    }

    public int getIdIPedido() {
        return idIPedido;
    }

    public String getData() {
        return data;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public ArrayList<Item> getItensPedido() {
        return itensPedido;
    }

    public void setIdIPedido(int idIPedido) {
        this.idIPedido = idIPedido;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public void setItensPedido(ArrayList<Item> itensPedido) {
        this.itensPedido = itensPedido;
    }

    @Override
    public String toString() {
        String resultItens = "";
        for (int i =0; i< itensPedido.size(); i++){
            resultItens = resultItens + itensPedido.get(i).toString()+"\n";
        }
        
        return "Pedido{" + "idIPedido=" + idIPedido + "," + ", data=" + data + ", valorDesconto=" +""+ valorDesconto + ", itensPedido=\n" +""+ resultItens + '}';
    }
    

}
  
