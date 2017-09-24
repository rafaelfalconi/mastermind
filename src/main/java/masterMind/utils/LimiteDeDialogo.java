package masterMind.utils;



public class LimiteDeDialogo {
    private String titulo;

    private ClosedInterval limite;

    private LimiteDeDialogoVista limitsView;

    public LimiteDeDialogo(String titulo, int min, int max) {
        assert titulo != null;
        this.limite = new ClosedInterval(min, max);
        limitsView = new LimiteDeDialogoVista("El valor debe estar entre ", limite);
        this.titulo = titulo + " " + limitsView + ": ";
    }

    public LimiteDeDialogo(String title, int max){
        this(title, 1, max);
    }

    public int read() {
        IO io = new IO();
        int value;
        boolean ok;
        do {
            value = io.readInt(titulo);
            ok = limite.includes(value);
            if (!ok) {
                limitsView.writeln();
            }
        } while (!ok);
        return value;
    }
}
