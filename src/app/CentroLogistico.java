package app;
import java.util.ArrayList;
import modelo.Enviable;
import modelo.Paquete;

public class CentroLogistico {
    private ArrayList<Enviable> inventario;

    public CentroLogistico(){
        inventario = new ArrayList<>();
    }
    public void registrarPaquete(Enviable e){
        inventario.add(e);
    }
    public void mostrarReporteEnvios(){
        for(Enviable enviable: inventario){
            if(enviable instanceof Paquete e){
                System.out.println(e.obtenerDetalle());
            }
            System.out.println(enviable.calcularCostoEnvio());
             
        }
    }

    public double calcularRecaudacionTotal(){
        double total= 0;
        for(Enviable enviable:inventario){
            total += enviable.calcularCostoEnvio();
        }
        return total;
    }
}
