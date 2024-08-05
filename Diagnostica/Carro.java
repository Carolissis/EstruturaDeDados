public class Carro extends Veiculo{
    private String placa;
    private int ano;
    private boolean lavado;

    public Carro(String placa, int ano, int numPortas, int numRodas) {
        super(numPortas, numRodas);
        this.placa = placa;
        this.ano = ano;
        this.lavado = false;
    }
    public Carro(String placa, int ano) {
        super(0,0);
        this.placa = placa;
        this.ano = ano;
        this.lavado = false;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setLavado() {
        this.lavado = true;
    }

    public boolean isLavado() {
        return this.lavado;
    }
}
