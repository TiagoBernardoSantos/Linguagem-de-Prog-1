public class Cachorros {
    // Atributos
    private String nome;
    private String raca;
    private int idade;

    // Construtor
    public Cachorros(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para comparar raças
    public String compararRaca(Cachorros outro) {
        if (this.raca.equalsIgnoreCase(outro.getRaca())) {
            return "O " + this.nome + " é da mesma raça que " + outro.getNome() + ".";
        } else {
            return "O " + this.nome + " não é da mesma raça que " + outro.getNome() + ".";
        }
    }

    // Método para latir
    public void latir() {
        System.out.println(nome + " está latindo: Au Au!");
    }

    // Método para comer
    public void comer() {
        System.out.println(nome + " está comendo.");
    }

}