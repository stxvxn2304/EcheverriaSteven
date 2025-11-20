package esEcosistemaVertebrados.esMutacion;
import esEcosistemaVertebrados.esFanerozoico.esMammals.esMonotreme;

public class esTanqueMutacion implements esIIA {
    public esMonotremeEcheverria esMutar(esMonotreme animal) {
        int esNumRandom = (int)(Math.random() * 1000) + 1; //Numero aleatorio entre 1 y 1000
        if ((esNumRandom > 100) && (esNumRandom < 1000)) {
            for(int i = 0; i <= esNumRandom; i++) {
                try {
                    System.out.printf("\rMutacion en proceso: %d de %d (mSv)", i, esNumRandom);
                    System.out.flush();
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }
            }
            System.out.print("\n");
            esMonotremeEcheverria esMonotremeMutado = new esMonotremeEcheverria(animal.getEsNombre()+" Mutado");
            return esMonotremeMutado;
        } else {
            return null;
        }
    }

}
