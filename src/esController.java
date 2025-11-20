import esEcosistemaVertebrados.esMutacion.esMonotremeEcheverria;
import esEcosistemaVertebrados.esFanerozoico.esMammals.esMonotreme;
import esEcosistemaVertebrados.esMutacion.esTanqueMutacion;

public class esController {
    public void esVerificarMutacion(esMonotremeEcheverria animal){
        if(animal == null){
            System.out.println("Mutacion fallida.");
        } else {
            System.out.println("Mutuacion finalizada con exito.");
        }
    }

    public void esIniciarPruebaSistema(){
        esMonotreme esMonotremito = new esMonotreme("Monotremito");
        System.out.println(esMonotremito.saludar());
        System.out.println(esMonotremito.saludar("Steven"));
        esTanqueMutacion esTanque = new esTanqueMutacion();
        esMonotremeEcheverria esMonotremitoMutado = esTanque.esMutar(esMonotremito);
        esVerificarMutacion(esMonotremitoMutado);
    }

}
