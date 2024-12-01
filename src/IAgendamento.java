package Barbearia;

import java.util.List;

public interface IAgendamento {
    void agendar(Agendamento agendamento);
    List<Agendamento> listarAgendamentos();
}