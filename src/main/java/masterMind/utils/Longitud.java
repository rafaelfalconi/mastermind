package masterMind.utils;

public class Longitud {
    private int maximo;
    
    public Longitud(int max) {
        this.maximo=max;
        
    }
    public boolean incluye(String valor) {
        return maximo==valor.length();
    }
    
    int getMaximo() {
        return maximo;
    }
}
