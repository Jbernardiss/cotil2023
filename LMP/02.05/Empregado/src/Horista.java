public class Horista extends Empregado{
    private double precoHora;
    private double horasTrabalhadas;

    public double vencimento(){
        return getPrecoHora() * getHorasTrabalhadas();
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
