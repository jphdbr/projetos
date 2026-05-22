sealed class Veiculo permits Carro, Moto{
    public void mover(){
        System.out.println("O veículo está em movimento.");
    }
}
final class Carro extends Veiculo{
    public void abrirportamalas(){
        System.out.println("portamalas aberto.");
    }
}
final class Moto extends Veiculo{
    public void empinar(){
        System.out.println("A moto empinou com segurança no exemplo didático");
    }
}
public class Classsealed {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.mover();
        c.abrirportamalas();
        Moto m = new Moto();
        m.mover();
        m.empinar();
    }
}