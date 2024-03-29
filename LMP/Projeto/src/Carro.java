public class Carro {

    static int ultimoId = -1;
    private int id;
    private String desc;
    private double preco;
    private String marca;
    private String modelo;

    public Carro(String desc, double preco, String marca, String modelo) {
        if(preco < 0){
            throw new valorNegativoException();
        }else{
            this.id = ++ultimoId;
            this.desc = desc;
            this.preco = preco;
            this.marca = marca;
            this.modelo = modelo;
        }

    }

    public void exibir() {
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Descrição: " + desc);
        System.out.println("Preço: " + preco);
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(int ultimoId) {
        Carro.ultimoId = ultimoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
