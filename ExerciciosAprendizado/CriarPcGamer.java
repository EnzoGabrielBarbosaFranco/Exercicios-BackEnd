package ExerciciosAprendizado;

public class CriarPcGamer {
    public static void main(String[] args) {
        PcGamer pc1 = new PcGamer();
        pc1.gabinete = " Montech";
        pc1.fonte = " Corsair";
        pc1.processador = " AMD";
        pc1.placaMae = " Aorus";
        pc1.placaDeVideo = " Nvidia";
        pc1.memoriaRam = 2;
        pc1.ssd = " XPG";
        pc1.cooler = true;
        pc1.status();
    }
}