package gestao;

public class DadosOperacionais {
    public static final int MINUTOS_HORA = 60;
    public static final int DIAS_MES = 30;

    private double tempoDeCarga;
    private double tempoDeDescarga;
    private double distanciaIda;
    private double distanciaVolta;
    private int tempoJornadaUtil;
    private int turnosDiarios;
    private int diasUteis;
    private int diasManutencao;
    private double velocidadeIda;
    private double velocidadeVolta;

    private double tempoTotalViagem;
    private double tempoTrajeto;
    private double tempoCargaDescarga;

    private double tempoDiarioDeOperação;
    private double numeroDeViagensDia;
    private int diasDisponiveis;
    private double numeroViagensMensais;

    private String tipo;
    private double peso;
    private double viagensMensais;

    private double frotaNecessaria;

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
    public double getTempoTotalViagem() {
        return tempoTotalViagem;
    }

    public DadosOperacionais() {
    }

    public DadosOperacionais(
            double tempoDeCarga, double tempoDeDescarga, double distanciaIda,
            double distanciaVolta, int tempoJornadaUtil, int turnosDiarios,
            int diasUteis, int diasManutencao, double velocidadeIda, double velocidadeVolta)
    {
        this.tempoDeCarga = tempoDeCarga;
        this.tempoDeDescarga = tempoDeDescarga;
        this.distanciaIda = distanciaIda;
        this.distanciaVolta = distanciaVolta;
        this.tempoJornadaUtil = tempoJornadaUtil;
        this.turnosDiarios = turnosDiarios;
        this.diasUteis = diasUteis;
        this.diasManutencao = diasManutencao;
        this.velocidadeIda = velocidadeIda;
        this.velocidadeVolta = velocidadeVolta;
    }

    public void setTempoDeCarga(double tempoDeCarga) {
        this.tempoDeCarga = tempoDeCarga;
    }

    public void setTempoDeDescarga(double tempoDeDescarga) {
        this.tempoDeDescarga = tempoDeDescarga;
    }

    public void setDistanciaIda(double distanciaIda) {
        this.distanciaIda = distanciaIda;
    }

    public void setDistanciaVolta(double distanciaVolta) {
        this.distanciaVolta = distanciaVolta;
    }

    public void setTempoJornadaUtil(int tempoJornadaUtil) {
        this.tempoJornadaUtil = tempoJornadaUtil;
    }

    public void setTurnosDiarios(int turnosDiarios) {
        this.turnosDiarios = turnosDiarios;
    }

    public void setDiasUteis(int diasUteis) {
        this.diasUteis = diasUteis;
    }

    public void setDiasManutencao(int diasManutencao) {
        this.diasManutencao = diasManutencao;
    }

    public void setVelocidadeIda(double velocidadeIda) {
        this.velocidadeIda = velocidadeIda;
    }

    public void setVelocidadeVolta(double velocidadeVolta) {
        this.velocidadeVolta = velocidadeVolta;
    }

    public double calcularTempoTotalViagem(){
        tempoTotalViagem = calcularTempoTrajeto() + calcularTempoCargaDescarga();
        return tempoTotalViagem;
    }

    private double calcularTempoTrajeto(){
        tempoTrajeto = calcularTempoIda() + calcularTempoVolta();
        return tempoTrajeto;
    }

    private double calcularTempoIda(){
        return (distanciaIda/velocidadeIda) * MINUTOS_HORA;
    }

    private double calcularTempoVolta(){
        return (distanciaVolta/velocidadeVolta) * MINUTOS_HORA;
    }

    private double calcularTempoCargaDescarga(){
        tempoCargaDescarga = tempoDeCarga + tempoDeDescarga;
        return tempoCargaDescarga;
    }

    public double calcularTempoDeOperacaoDiario(){
        tempoDiarioDeOperação = (turnosDiarios * tempoJornadaUtil) * MINUTOS_HORA;
        return tempoDiarioDeOperação;
    }

    public double calcularViagensDia(){
        numeroDeViagensDia = calcularTempoDeOperacaoDiario() / calcularTempoTotalViagem();
        return numeroDeViagensDia;
    }

    public int calcularDiasDisponiveis(){
        diasDisponiveis = diasUteis - diasManutencao;
        return diasDisponiveis;
    }

    public double calcularQuantidadeViagensMensais(){
        numeroViagensMensais = calcularViagensDia() * calcularDiasDisponiveis();
        return numeroViagensMensais;
    }

    public double calcularViagensMensais(){
        viagensMensais = peso / DIAS_MES;
        return viagensMensais;
    }

    public double calcularFrota(){
        frotaNecessaria = calcularViagensMensais() / calcularQuantidadeViagensMensais();
        return frotaNecessaria + 1;
    }

}
