public class Veiculo{
    private int numRodas;
    private int numPortas;

    public Veiculo(int numPortas, int numRodas){
        this.numPortas = numPortas;
        this.numRodas = numRodas;
    }
    public int getNumRodas() {
        return this.numRodas;
    }

    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }

    public int getNumPortas() {
        return this.numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
}