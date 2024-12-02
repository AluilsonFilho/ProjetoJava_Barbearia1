package Barbearia;

public class Servico {
    private TipoServico tipo;

    public Servico(TipoServico tipo) {
        this.tipo = tipo;
    }

    public TipoServico getTipo() {
        return tipo;
    }

    public double getPreco() {
        switch (tipo) {
            case CORTE:
                return 50.0;
            case BARBA:
                return 30.0;
            case TRANSFORMAÇÃO_COMPLETA:
                return 70.0;
            default:
                return 0.0;
        }
    }
}