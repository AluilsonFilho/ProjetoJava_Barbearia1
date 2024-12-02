package Barbearia;

public class Pagamento {
    private double valorTotal;
    private double valorPago;

    public Pagamento(double valorTotal) {
        this.valorTotal = valorTotal;
        this.valorPago = valorTotal * 0.5; // 50% do valor total
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double getValorPago() {
        return valorPago;
    }
}