public class DivasPop {
    private String nome;
    private int anoNascimento;
    private int numeroDeAlbuns;

    public DivasPop(String nome, int anoNascimento, int numeroDeAlbuns) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.numeroDeAlbuns = numeroDeAlbuns;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + ", Ano de Nascimento: " + anoNascimento + ", Número de Álbuns: " + numeroDeAlbuns);
    }

    public void atualizarNumeroDeAlbuns(int novosAlbuns) {
        this.numeroDeAlbuns += novosAlbuns;
        System.out.println("Número de álbuns atualizado para: " + numeroDeAlbuns);
    }

    public void calcularIdade(int anoAtual) {
        int idade = anoAtual - anoNascimento;
        System.out.println("A idade de " + nome + " é " + idade + " anos.");
    }
}