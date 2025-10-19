public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvalizacoes;
    private int totalDeAvaliacao;
    int duracaoEmMinutos;

    int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaDasAvalizacoes += nota;
        totalDeAvaliacao++;
    }

    double pegaMedia() {
        return somaDasAvalizacoes / totalDeAvaliacao;
    }
}
