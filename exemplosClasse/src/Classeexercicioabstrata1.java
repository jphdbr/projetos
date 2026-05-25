abstract class animal{
    protected String som;
    public animal(String som){
        this.som = som;
    }
    public void emitirsom(){
        System.out.println("esse animal faz: " + som);
    }
    public abstract double produzirsom();
}
