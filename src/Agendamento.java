package Barbearia;

public class Agendamento {
    private String clienteNome;
    private String clienteTelefone;
    private Barbeiro barbeiro;
    private Servico servico;
    private String dataHora;
    private Pagamento pagamento;

    public Agendamento(String clienteNome, String clienteTelefone, Barbeiro barbeiro, Servico servico, String dataHora) {
        this.clienteNome = clienteNome;
        this.clienteTelefone = clienteTelefone;
        this.barbeiro = barbeiro;
        this.servico = servico;
        this.dataHora = dataHora;
        this.pagamento = new Pagamento(servico.getPreco());
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    @Override
    public String toString() {
        return "Cliente: " + clienteNome + ", Telefone: " + clienteTelefone +
                ", Barbeiro: " + barbeiro.getNome() + ", Serviço: " + servico.getTipo() +
                ", Data e Hora: " + dataHora + ", Valor Pago: " + pagamento.getValorPago();
    }
}