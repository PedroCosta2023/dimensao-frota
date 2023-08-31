package gestao;

public class Veiculo {

    private double pesoChassi;
    private double pesoBrutoTotal;
    private double pesoSemiReboque;
    private double pesoEquipamentos;
    private double pesoTotal;
    private double cargaUtil;
    
    public double getPesoTotal() {
        return pesoTotal;
    }

    public double getCargaUtil() {
        return cargaUtil;
    }

    public Veiculo() {
    }

    public Veiculo(double pesoChassi, double pesoBrutoTotal, double pesoSemiReboque, double pesoEquipamentos) {
        this.pesoChassi = pesoChassi;
        this.pesoBrutoTotal = pesoBrutoTotal;
        this.pesoSemiReboque = pesoSemiReboque;
        this.pesoEquipamentos = pesoEquipamentos;
    }

    public double getPesoChassi() {
        return pesoChassi;
    }

    public void setPesoChassi(double pesoChassi) {
        this.pesoChassi = pesoChassi;
    }

    public double getPesoBrutoTotal() {
        return pesoBrutoTotal;
    }

    public void setPesoBrutoTotal(double pesoBrutoTotal) {
        this.pesoBrutoTotal = pesoBrutoTotal;
    }

    public double getPesoSemiReboque() {
        return pesoSemiReboque;
    }

    public void setPesoSemiReboque(double pesoSemiReboque) {
        this.pesoSemiReboque = pesoSemiReboque;
    }

    public double getPesoEquipamentos() {
        return pesoEquipamentos;
    }

    public void setPesoEquipamentos(double pesoEquipamentos) {
        this.pesoEquipamentos = pesoEquipamentos;
    }
    
    public double calcularPesoTotal(){
        pesoTotal = pesoEquipamentos + pesoChassi + pesoSemiReboque;
        return pesoTotal;
    }

    public double calcularCargaUtil(){
        cargaUtil = pesoBrutoTotal - pesoTotal;
        return cargaUtil;
    }

}
