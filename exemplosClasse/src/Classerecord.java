record Aluno(String nome, int idade) {
    public Aluno {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade nâo pode ser negativa.");
        }
    }
}
public class Classerecord {
    public static void main(String[] args) {
        Aluno a = new Aluno("Marina", 18);
        System.out.println("Nome: " + a.nome());
        System.out.println("Idade: " + a.idade());
        System.out.println(a);
    }
}
