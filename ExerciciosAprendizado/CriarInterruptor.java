package ExerciciosAprendizado;

public class CriarInterruptor {
    public static void main(String[] args) {
        Interruptor elemento = new Interruptor("Branco", "Normais", "Padrao Brasileiro", "Branco");
        elemento.ligar();
        elemento.estado(); 
        elemento.status();
    }
}
