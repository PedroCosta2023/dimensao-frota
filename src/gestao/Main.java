package gestao;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        Veiculo caminhao = new Veiculo();
        caminhao.setPesoChassi(8.000);
        caminhao.setPesoEquipamentos(1.000);
        caminhao.setPesoSemiReboque(8.000);
        caminhao.setPesoBrutoTotal(47.000);

        DadosOperacionais viagem = new DadosOperacionais();
        viagem.setDistanciaIda(590);
        viagem.setVelocidadeIda(55);
        viagem.setDistanciaVolta(630);
        viagem.setVelocidadeVolta(65);
        viagem.setTempoDeCarga(80);
        viagem.setTempoDeDescarga(0);

        viagem.setTurnosDiarios(1);
        viagem.setTempoJornadaUtil(9);
        viagem.setDiasUteis(25);
        viagem.setDiasManutencao(3);
        viagem.setPeso(5300);
        System.out.printf("Numero de viagens por dia: %.4f%n",viagem.calcularViagensDia());
        System.out.printf("Numero de dias disponíveis por mês: %d%n",viagem.calcularDiasDisponiveis());
        System.out.printf("Viagens mensais: %f%n",viagem.calcularViagensMensais());
        System.out.printf("Frota necessaria: %.0f%n",viagem.calcularFrota());


    }
}