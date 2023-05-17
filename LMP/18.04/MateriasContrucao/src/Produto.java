public class Produto {
    private String descricao;
    private int codigo;
    private double preco;
    private String unidade;
    private int qnt, tipo;



    public Produto(String descricao, int codigo, double preco, String unidade, int qnt, int tipo) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.preco = preco;
        this.unidade = unidade;
        this.qnt = qnt;
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
