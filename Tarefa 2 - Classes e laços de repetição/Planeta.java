public class Planeta {
    private String nome;
    private double massa;
    private double raio;
    private double distanciaDoSol;

    public Planeta(String nome, double massa, double raio, double distanciaDoSol) {
        this.nome = nome;
        this.massa = massa;
        this.raio = raio;
        this.distanciaDoSol = distanciaDoSol;
    }

    public void orbitar() {
        System.out.println("O planeta " + nome + " está orbitando o Sol.");
    }

    public void calcularGravidade() {
        double gravidade = (6.67430e-11 * massa) / (raio * raio);
        System.out.println("A gravidade em " + nome + " é " + gravidade + " m/s².");
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + ", Massa: " + massa + "kg, Raio: " + raio + "m, Distância do Sol: " + distanciaDoSol + "km");
    }
}