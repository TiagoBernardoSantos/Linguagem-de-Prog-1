public class Salgadinho {
    private String nome;
    private String sabor;
     float peso;

    public Salgadinho(String nome, String sabor, float peso) {
        this.nome = nome;
        this.sabor = sabor;
        this.peso = peso;
    }

    public void escolherSabor(String novoSabor) {
        this.sabor = novoSabor;
    }

    public void compararPeso(Salgadinho outro) {
        if (this.peso == outro.peso) {
            System.out.println("Os salgadinhos têm o mesmo peso.");
        } else {
            System.out.println("Os salgadinhos têm pesos diferentes.");
        }
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + ", Sabor: " + sabor + ", Peso: " + peso + "g");
    }
}