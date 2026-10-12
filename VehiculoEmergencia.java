package Ejercicio36_vehiculosEmergencia;

public class VehiculoEmergencia {
    private String patente;
    private String estacionBase;
    private boolean enServicio;

    public VehiculoEmergencia(String patente, String estacionBase) {
        this.patente = patente;
        this.estacionBase = estacionBase;
        this.enServicio = false;
    }

    public void activarAlerta() {
        System.out.println(patente + ": activando balizas de emergencia.");
    }

    public boolean despachar(String emergencia) {
        if (enServicio) {
            System.out.println(patente + " ya está en servicio, no puede atender: " + emergencia);
            return false;
        }
        enServicio = true;
        System.out.println(patente + " sale de " + estacionBase + " hacia: " + emergencia);
        activarAlerta();
        return true;
    }

    public void finalizarServicio() {
        enServicio = false;
    }

    public String getPatente() {
        return patente;
    }
}
