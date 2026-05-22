import java.sql.SQLOutput;

enum StatusPedido{
    PENDENTE,
    PROCESSANDO,
    ENVIADO,
    ENTREGUE
}
public class Classenum {
    public static void main(String[] args) {
        StatusPedido status = StatusPedido.PROCESSANDO;
        System.out.println("Status atual: " + status);
    }
}
