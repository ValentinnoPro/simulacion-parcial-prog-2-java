package modelo;



public class PaqueteFragil extends Paquete{
    private String nivelProteccion;

    public PaqueteFragil(String codigoTrack,double pesoKg,String destino,String nivelProteccion){
        super(codigoTrack,pesoKg,destino);
        setNivelProteccion(String nivelProteccion);
    }

    //Getter
    public String getNivelProteccion(){
        return nivelProteccion;
    }

    //Setter
    public void setNivelProteccion(String nivelProteccion){
        if(nivelProteccion == null || 
        nivelProteccion.equalsIgnoreCase("alta")||nivelProteccion.equalsIgnoreCase("media")||nivelProteccion.equalsIgnoreCase("baja")){
            this.nivelProteccion = nivelProteccion;
        }else{
            throw new IllegalArgumentException("Ingrese un nivel proteccion correcto.");
        }
    }
    //Implementacion de metodos:
    @Override 
    public double calcularCostoEnvio(){
        double base = 1000 *getPesoKg();
        if (getNivelProteccion() == "alta") {
            return  base *1.30;
        }else if (getNivelProteccion()=="media") {
            return base * 1.15;
        }else{
            return base;
        }
    }

    @Override 
    public boolean esAptoParaEnvioAereo(){
        return false;
    }

    @Override 
    public String obtenerDetalle(){
        return "Codigo: "+getCodigoTrack()+ ". Destino: "+getDestino()+". Peso: "+getPesoKg()+"Nivel Proteccion: "+ getNivelProteccion();
    }
}
