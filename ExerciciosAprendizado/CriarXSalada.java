package ExerciciosAprendizado;

public class CriarXSalada {
    public static void main(String[] args) {
        XSalada lanche = new XSalada();
        lanche.pao = " Pão de hambúrguer";
        lanche.salada = " Americana";
        lanche.hamburguer = " Angu";
        lanche.queijo = " Cheddar";
        lanche.cebola = true;
        lanche.tomate = false;
        lanche.status();
    }
}