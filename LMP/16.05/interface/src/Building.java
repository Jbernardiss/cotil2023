public class Building implements CarbonFootprint{

    private int numPessoa, numLampada;
    private boolean energiaRenovavel, ventoCondenado;

    public Building(int numPessoa, int numLampada, boolean energiaRenovavel, boolean ventoCondenado) {
        this.numPessoa = numPessoa;
        this.numLampada = numLampada;
        this.energiaRenovavel = energiaRenovavel;
        this.ventoCondenado = ventoCondenado;
    }


    //getter and setter

    public int getNumPessoa() {
        return numPessoa;
    }

    public void setNumPessoa(int numPessoa) {
        this.numPessoa = numPessoa;
    }

    public int getNumLampada() {
        return numLampada;
    }

    public void setNumLampada(int numLampada) {
        this.numLampada = numLampada;
    }

    public boolean isEnergiaRenovavel() {
        return energiaRenovavel;
    }

    public void setEnergiaRenovavel(boolean energiaRenovavel) {
        this.energiaRenovavel = energiaRenovavel;
    }

    public boolean isVentoCondenado() {
        return ventoCondenado;
    }

    public void setVentoCondenado(boolean ventoCondenado) {
        this.ventoCondenado = ventoCondenado;
    }

    @Override
    public int getCarbonFootprint() {
        return 300;
    }
}
