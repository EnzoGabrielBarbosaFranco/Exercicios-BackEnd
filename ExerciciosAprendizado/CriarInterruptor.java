package ExerciciosAprendizado;

public class CriarInterruptor {
    public static void main(String[] args) {
        Interruptor elemento = new Interruptor();
        elemento.espelho = " Branco";
        elemento.fio = " Normais";
        elemento.tomada = " Padrão Brasileiro";
        elemento.corTomada = " Branco";
        elemento.ligar();
        elemento.estado(); 
        elemento.status();
    }
}
