package Ejercicio36_vehiculosEmergencia;

public class Main {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("AMB-101", "Hospital Central", 400, 2);
        CamionBomberos bomberos = new CamionBomberos("BOM-202", "Cuartel Norte", 8000, 30.5);
        PatrullaPolicial patrulla = new PatrullaPolicial("POL-303", "Comisaría 4", 3, true);

        ambulancia.despachar("accidente de tránsito en Av. San Martín");
        bomberos.despachar("incendio en depósito");
        patrulla.despachar("aviso de robo");
        ambulancia.despachar("paro cardíaco en la plaza");

        ambulancia.finalizarServicio();
        ambulancia.despachar("paro cardíaco en la plaza");
    }
}
