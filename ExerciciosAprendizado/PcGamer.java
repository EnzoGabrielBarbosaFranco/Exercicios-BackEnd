package ExerciciosAprendizado;

public class PcGamer {
    String gabinete;
    String fonte;
    String processador;
    String placaMae;
    String placaDeVideo;
    int memoriaRam;
    String ssd;
    boolean cooler;

    void status() {
        System.out.println("Um Gabinete:" + this.gabinete);
        System.out.println("Uma Fonte:" + this.fonte);
        System.out.println("Um Processador:" + this.processador);
        System.out.println("Uma Placa Mãe:" + this.placaMae);
        System.out.println("Uma Placa de Vídeo:" + this.placaDeVideo);
        System.out.println("Possui quantas Memórias Ram?" + this.memoriaRam);
        System.out.println("Um SSD:" + this.ssd);
        System.out.println("Possui Cooler?" + this.cooler);
    }
}
