package esEcosistemaVertebrados.esProterozoico;

public abstract class esTetrapoda extends esSarcopterygii{
    public esTetrapoda() {
        super();
        try {
            esImprimirWaiting();
        } catch (InterruptedException e) {
        }
        System.out.println("---------------- Tetrapoda");
    }

}
