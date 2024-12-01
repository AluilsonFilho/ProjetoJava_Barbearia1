package Barbearia;

import java.util.ArrayList;
import java.util.List;

public class SistemaAgendamento implements IAgendamento {
    private List<Agendamento> agendamentos = new ArrayList<>();
    private List<Barbeiro> barbeiros = new ArrayList<>();

    public SistemaAgendamento() {

        barbeiros.add(new Barbeiro("Alyson Macedo", "98765-4321"));
        barbeiros.add(new Barbeiro("Pedro Henrique", "12345-6789"));
    }

    @Override
    public void agendar(Agendamento agendamento) {
        agendamentos.add(agendamento);
        System.out.println("Agendamento realizado com sucesso! Valor a ser pago: " + agendamento.getPagamento().getValorPago());
    }

    @Override
    public List<Agendamento> listarAgendamentos() {
        return agendamentos;
    }

    public List<Barbeiro> getBarbeiros() {
        return barbeiros;
    }
}