package esEcosistemaVertebrados.esProterozoico;

public abstract class esGnathostomata{
    public esGnathostomata() {
        try {
            esImprimirWaiting();
        } catch (InterruptedException e) {
        }
        System.out.println("---- Gnathostomata");
    }
    //Refactorizacion
    protected void esImprimirWaiting() throws InterruptedException{
        for(int i = 0; i <= 100; i++) {
            if ((i%4) == 0) {
                System.out.printf("\r%s %d%%", "0oo", i);
            }else if ((i%2) == 1) {
                System.out.printf("\r%s %d%%", "o0o", i);
            }else {
                System.out.printf("\r%s %d%%", "oo0", i);
            }
            System.out.flush();
            Thread.sleep(80);
        }
    }

}
