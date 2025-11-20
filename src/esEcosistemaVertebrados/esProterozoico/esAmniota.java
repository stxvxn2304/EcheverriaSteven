package esEcosistemaVertebrados.esProterozoico;

public abstract class esAmniota extends esTetrapoda{
    public esAmniota() {
        super();
        try {
            esImprimirWaiting();
        } catch (InterruptedException e) {
        }
        System.out.println("-------------------- Amniota");
    }
}
