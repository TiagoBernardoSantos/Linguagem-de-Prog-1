public class Cafeteria {
    private String nome;
    private int capacidade;
    private String[] tiposDeCafe;

    public Cafeteria(String nome, int capacidade, String[] tiposDeCafe) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.tiposDeCafe = tiposDeCafe;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + ", Capacidade: " + capacidade + " pessoas, Tipos de Café: ");
        for (String cafe : tiposDeCafe) {
            System.out.println("- " + cafe);
        }
    }

    public void adicionarTipoDeCafe(String novoCafe) {
        String[] novosTipos = new String[tiposDeCafe.length + 1];
        System.arraycopy(tiposDeCafe, 0, novosTipos, 0, tiposDeCafe.length);
        novosTipos[tiposDeCafe.length] = novoCafe;
        tiposDeCafe = novosTipos;
        System.out.println("Novo tipo de café adicionado: " + novoCafe);
    }

    public void removerTipoDeCafe(String cafeParaRemover) {
        String[] novosTipos = new String[tiposDeCafe.length - 1];
        int index = 0;
        for (String cafe : tiposDeCafe) {
            if (!cafe.equals(cafeParaRemover)) {
                novosTipos[index++] = cafe;
            }
        }
        tiposDeCafe = novosTipos;
        System.out.println("Tipo de café removido: " + cafeParaRemover);
    }
}