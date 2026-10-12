package Ejercicio36_vehiculosEmergencia;

public class PatrullaPolicial extends VehiculoEmergencia {
    private int efectivos;
    private boolean blindaje;

    public PatrullaPolicial(String patente, String estacionBase, int efectivos, boolean blindaje) {
        super(patente, estacionBase);
        this.efectivos = efectivos;
        this.blindaje = blindaje;
    }

    @Override
    public void activarAlerta() {
        System.out.println("  PATRULLA " + getPatente() + ": luces azules y rojas, " + efectivos + " efectivos" + (blindaje ? ", unidad blindada." : "."));
    }
}
