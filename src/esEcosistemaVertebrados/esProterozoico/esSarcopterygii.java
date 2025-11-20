package esEcosistemaVertebrados.esProterozoico;

public abstract class esSarcopterygii extends esOsteichthyes{
    public esSarcopterygii() {
        super();
        try {
            esImprimirWaiting();
        } catch (InterruptedException e) {
        }
        System.out.println("------------ Sarcopterygii");
    }

}
