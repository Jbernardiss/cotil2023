public class Comissionado extends Empregado{
    private double totalVenda;
    private double totalComissao;

    public double vencimento(){
        return (getTotalComissao() / 100) * getTotalVenda();
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getTotalComissao() {
        return totalComissao;
    }

    public void setTotalComissao(double totalComissao) {
        this.totalComissao = totalComissao;
    }
}
