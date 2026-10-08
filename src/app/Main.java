package app;

import modelo.*;
public class Main {
    public static void main(String[] args) {
        CentroLogistico c1 = new CentroLogistico();
        PaqueteEstandar p1 = new PaqueteEstandar("3164",1 ,"China",15);
        PaqueteEstandar p2 = new PaqueteEstandar("3165",1.5,"China",15);
        PaqueteFragil p3 = new PaqueteFragil("3166", 0.5, "Japon", "alta");
        PaqueteFragil p4 =new PaqueteFragil("3167", 3, "Australia", "baja");

        c1.registrarPaquete(p1);
        c1.registrarPaquete(p2);
        c1.registrarPaquete(p3);
        c1.registrarPaquete(p4);

        p2.actualizarDestino("Japon");
        p3.actualizarDestino("China",true);

        try{
            PaqueteEstandar p6 = new PaqueteEstandar("3168",-10,"Puerto Rico",5); 
        }catch (IllegalArgumentException e ){ 
            System.out.println("Error: "+ e.getMessage());
        }

        c1.mostrarReporteEnvios();
        System.out.println("Recaudacion total: "+ c1.calcularRecaudacionTotal());
    }
}
