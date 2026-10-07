package modelo;
public class PaqueteEstandar extends Paquete {
    private int diasEstimados;// atributo propio de la clase en acceso privado.

    //Contructor para la clase y heredamos los atributos de la clase Paquete.
    public PaqueteEstandar(String codigoTrack,double pesoKg,String destino, int diasEstimados){
        super(codigoTrack,pesoKg,destino);

        //Uso set para asi validar el ingreso del usuario cuando instancie.
        setDiasEstimados(diasEstimados);

    }

    //Uso los metodos de  la interface Enviable que son oblligatorios y uso Override como practica para que java entienda que estoy trayendo de otro lugar y en caso de no funcionar, poder detectar el error.
    @Override 
    public double calcularCostoEnvio(){
        return 1000 *getPesoKg(); 
    }

    //Metodo de la interface
    @Override 
    public boolean esAptoParaEnvioAereo(){
        return getPesoKg() <=15;
    }

    //Este metodo viene de la clase abstracta Paquete. Aca defino su comportamiento.
    @Override
    public String obtenerDetalle(){
        return "El codigo del producto es: "+getCodigoTrack() + ". Destino: "+getDestino()+". Peso: "+getPesoKg()+". Días estimados: "+getDiasEstimados();
    }

    //Getter para acceder al atributo privado.
    public int getDiasEstimados(){
        return diasEstimados;
    }

    //Setter para poder modificar el atributo privado.
    public void setDiasEstimados(int diasEstimados){
        if(diasEstimados <0){
            throw new IllegalArgumentException("No puede ingresar un numero negativo.");
        }
        this.diasEstimados=diasEstimados;
    }
}
