package gestao;

public class TotalCargaMensal {
    public static final int DIAS_MES = 30;
    private String tipo;
    private double peso;
    private double viagensMensais;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calcularViagensMensais(){
        viagensMensais = peso/DIAS_MES;
        return viagensMensais;
    }
}
