package ExerciciosAprendizado;

public class Interruptor {
    String espelho;
    boolean botao;
    String fio;
    String tomada;
    String corTomada;

    void status() {
        System.out.println("Qual a cor do espelho?" + this.espelho);
        System.out.println("Qual o modelo da tomada?" + this.tomada);
        System.out.println("Qual a cor da tomada?" + this.corTomada);
        System.out.println("Está ligado?" + this.botao);
    }

    void estado() {
        if (this.botao == true) {
            System.out.println("Acendeu!");
        } else {
            System.out.println("Não acendeu!");
        }
    }

    void ligar() {
        this.botao = true;
    }

    void desligar() {
        this.botao = false;
    }
}
