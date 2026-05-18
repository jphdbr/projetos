class Computador{
    private String marca;
    public Computador(String marca){
        this.marca = marca;
    }
    class Processador{
        private String modelo;
        public Processador(String modelo){
            this.modelo = modelo;
        }
        public void mostrardados(){
            System.out.println("Marca do computador: " + marca);
            System.out.println("Modelo do processador: " + modelo);
        }
    }
}
public class Classeinterna {
    public static void main(String[] args){
        Computador pc = new Computador("Dell");
        Computador.Processador proc = pc.new Processador("Intel i5");
        proc.mostrardados();
    }
}