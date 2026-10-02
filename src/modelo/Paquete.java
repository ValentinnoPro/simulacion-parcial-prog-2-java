package modelo;
import modelo.Enviable;

public abstract class Paquete implements Enviable {
    private String codigoTrack;
    private double pesoKg;
    private String destino;

    public Paquete(String codigoTrack,double pesoKg,String destino){
        if(codigoTrack == null || codigoTrack.isEmpty()){
            
            throw new IllegalArgumentException("Ingrese codigo correcto.");
            
        }
        
        this.codigoTrack = codigoTrack;

        if (pesoKg <=0) {
            throw new IllegalArgumentException("Ingrese un peso válido.");
        }
        this.pesoKg = pesoKg;

        if(destino == null || destino.isEmpty()){
            
            throw new IllegalArgumentException("Ingrese un destino correcto.");
            
        }
        this.destino = destino;

    }   

    public String getCodigoTrack(){
        return codigoTrack;
    }
    public void setCodigoTrack(String codigoTrack){
        if (codigoTrack == null || codigoTrack.isEmpty()) {
            throw new IllegalArgumentException("Ingrese un codigo correcto.");
        }
        this.codigoTrack = codigoTrack;
    }

    public double getPesoKg() {
        return pesoKg;
    }
    public void setPesoKg(double pesoKg){
        if (pesoKg <=0) {
            throw new IllegalArgumentException("Ingrese un peso válido.");
        }
        this.pesoKg = pesoKg;
    }

    public String getDestino(){
        return destino;
    }
    public void setDestino(String destino){
          if(destino == null || destino.isEmpty()){
            
            throw new IllegalArgumentException("Ingrese un destino correcto.");
            
        }
        this.destino = destino;
    }
    

    public void actualizarDestino(String nuevoDestino){
        setDestino(nuevoDestino);
    }

    public void actualizarDestino(String nuevoDestino, boolean express){
        if (express) {
            setDestino(nuevoDestino + " [PRIORITARIO]");
        }else{
            setDestino(nuevoDestino);
        }
        
    }
    public abstract String obtenerDetalle();
}
