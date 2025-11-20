package esEcosistemaVertebrados.esProterozoico;

public abstract class esOsteichthyes extends esGnathostomata{
    public esOsteichthyes() {
        super();
        try {
            esImprimirWaiting();
        } catch (InterruptedException e) {
        }
        System.out.println("-------- Osteichthyes");
    }

}
