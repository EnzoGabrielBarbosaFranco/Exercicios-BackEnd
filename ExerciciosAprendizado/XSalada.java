package ExerciciosAprendizado;

public class XSalada {
    String pao;
    String salada;
    String hamburguer;
    String queijo;
    boolean cebola;
    boolean tomate;

    void status() {
        System.out.println("Qual tipo de Pão:" + this.pao);
        System.out.println("Qual tipo de Salada:" + this.salada);
        System.out.println("Qual tipo de Hamburguer:" + this.hamburguer);
        System.out.println("Qual tipo de Queijo:" + this.queijo);
        System.out.println("Possui Cebola?" + this.cebola);
        System.out.println("Possui Tomate?" + this.tomate);
    }
}