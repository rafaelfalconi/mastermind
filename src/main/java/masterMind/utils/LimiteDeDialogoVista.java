package masterMind.utils;



class LimiteDeDialogoVista {
    private String titulo;

    private ClosedInterval closedInterval;

    private IO io;

    public LimiteDeDialogoVista(String titulo, ClosedInterval closedInterval){
        assert titulo != null;
        assert closedInterval != null;
        this.titulo = titulo;
        this.closedInterval = closedInterval;
        io = new IO();
    }

    public void writeln() {
        io.writeln(titulo + " " + this.toString());
    }

    @Override
    public String toString() {
        return "[" + closedInterval.getMin() + ", " + closedInterval.getMax() + "]";
    }
}
