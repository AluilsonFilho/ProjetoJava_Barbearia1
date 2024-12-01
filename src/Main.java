package Barbearia;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaAgendamento sistema = new SistemaAgendamento();

        while (true) {
            System.out.println("=== Sistema de Agendamento de Barbearia ===");
            System.out.println("1. Agendar um horário");
            System.out.println("2. Listar agendamentos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                System.out.print("Nome do cliente: ");
                String clienteNome = scanner.nextLine();
                System.out.print("Telefone do cliente: ");
                String clienteTelefone = scanner.nextLine();

                System.out.println("Escolha um barbeiro:");
                List<Barbeiro> barbeiros = sistema.getBarbeiros();
                for (int i = 0; i < barbeiros.size(); i++) {
                    System.out.println((i + 1) + ". " + barbeiros.get(i).getNome());
                }
                int barbeiroEscolhido = scanner.nextInt() - 1;
                scanner.nextLine();

                System.out.println("Escolha um serviço:");
                System.out.println("1. Corte");
                System.out.println("2. Barba");
                System.out.println("3. transformação completa");
                int servicoEscolhido = scanner.nextInt();
                TipoServico tipoServico = TipoServico.values()[servicoEscolhido - 1];
                scanner.nextLine();

                System.out.print("Data e hora (ex: 10-10-2023 15:00): ");
                String dataHora = scanner.nextLine();

                Agendamento agendamento = new Agendamento(clienteNome, clienteTelefone, barbeiros.get(barbeiroEscolhido), new Servico(tipoServico), dataHora);
                sistema.agendar(agendamento);
            } else if (opcao == 2) {
                List<Agendamento> agendamentos = sistema.listarAgendamentos();
                if (agendamentos.isEmpty()) {
                    System.out.println("Nenhum agendamento encontrado.");
                } else {
                    for (Agendamento agendamento : agendamentos) {
                        System.out.println(agendamento);
                    }
                }
            } else if (opcao == 3) {
                System.out.println("Saindo do sistema...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
