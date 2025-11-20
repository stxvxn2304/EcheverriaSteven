package esEcosistemaVertebrados.esMutacion;
import esEcosistemaVertebrados.esFanerozoico.esMammals.esMonotreme;

public class esMonotremeEcheverria extends esMonotreme {
    public esMonotremeEcheverria(String esNombre) {
        super(esNombre);
        try {
            esImprimirWaiting();
        } catch (InterruptedException e) {
        }
        System.out.println("---------------------------- Monotreme Echeverria");
    }

}
