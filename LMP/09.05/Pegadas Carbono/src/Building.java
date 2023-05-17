public abstract class Building implements CarbonFootprint{
    private int numeroPessoas;
    private boolean usoEnergiaRenovavel;
    private int numeroDeLampadas;
    private boolean usaArCondicionado;

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    public boolean isUsoEnergiaRenovavel() {
        return usoEnergiaRenovavel;
    }

    public void setUsoEnergiaRenovavel(boolean usoEnergiaRenovavel) {
        this.usoEnergiaRenovavel = usoEnergiaRenovavel;
    }

    public int getNumeroDeLampadas() {
        return numeroDeLampadas;
    }

    public void setNumeroDeLampadas(int numeroDeLampadas) {
        this.numeroDeLampadas = numeroDeLampadas;
    }

    public boolean isUsaArCondicionado() {
        return usaArCondicionado;
    }

    public void setUsaArCondicionado(boolean usaArCondicionado) {
        this.usaArCondicionado = usaArCondicionado;
    }

    public Building(int numeroPessoas, boolean usoEnergiaRenovavel, int numeroDeLampadas, boolean usaArCondicionado) {
        this.numeroPessoas = numeroPessoas;
        this.usoEnergiaRenovavel = usoEnergiaRenovavel;
        this.numeroDeLampadas = numeroDeLampadas;
        this.usaArCondicionado = usaArCondicionado;
    }

    @Override
    public int getCarbonFootprint() {
        return 150;
    }
}
