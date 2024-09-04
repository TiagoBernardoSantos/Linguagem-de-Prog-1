public class ReservaHotel {
    private String nomeDoHospede;
    private int numeroDoQuarto;
    private String dataDeCheckin;

    public ReservaHotel(String nomeDoHospede, int numeroDoQuarto, String dataDeCheckin) {
        this.nomeDoHospede = nomeDoHospede;
        this.numeroDoQuarto = numeroDoQuarto;
        this.dataDeCheckin = dataDeCheckin;
    }

    public void mostrarReserva() {
        System.out.println("Hóspede: " + nomeDoHospede + ", Quarto: " + numeroDoQuarto + ", Data de Check-in: " + dataDeCheckin);
    }

    public void atualizarDataDeCheckin(String novaData) {
        this.dataDeCheckin = novaData;
        System.out.println("Data de check-in atualizada para: " + novaData);
    }

    public void trocarQuarto(int novoNumeroDoQuarto) {
        this.numeroDoQuarto = novoNumeroDoQuarto;
        System.out.println("Quarto atualizado para: " + novoNumeroDoQuarto);
    }
}