package esEcosistemaVertebrados.esFanerozoico.esMammals;

import esEcosistemaVertebrados.esProterozoico.esAmniota;

public class esMonotreme extends esAmniota {
    private String esNombre;

    public esMonotreme(String esNombre) {
        super();
        setEsNombre(esNombre);
        try {
            esImprimirWaiting();
        } catch (InterruptedException e) {
        }
        System.out.println("------------------------ Monotreme");
    }

    public String saludar() {
        return (getEsNombre() + " saludando a todos");
    }

    public String saludar(String esNombre) {
        return (getEsNombre() + " saludando a " + esNombre);
    }

    public String getEsNombre() {
        return esNombre;
    }

    public void setEsNombre(String esNombre) {
        this.esNombre = esNombre;
    }

}
