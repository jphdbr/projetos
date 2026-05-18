final class UtilitarioMatematica {
    public int somar(int a, int b){
        return a + b;
    }
}
public class Classefinal {
    public static void  main(String[] args){
        UtilitarioMatematica u = new UtilitarioMatematica();
        System.out.println("Soma: " + u.somar(10, 5));
    }
}
