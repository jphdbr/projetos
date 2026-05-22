class Relatorio{
    public void gerar(){
        class Cabecalho {
            private String titulo;
            public Cabecalho(String titulo) {
                this.titulo = titulo;
            }
            public void mostrar(){
                System.out.println("===" + titulo + "===");
            }
        }
        Cabecalho cab = new Cabecalho("Relatório de vendas ");
        cab.mostrar();
        System.out.println("Conteúdo do relatorio...");
    }
}

public class Classlocal {
    public static void main(String[] args) {
        Relatorio r = new Relatorio();
        r.gerar();
    }
}
