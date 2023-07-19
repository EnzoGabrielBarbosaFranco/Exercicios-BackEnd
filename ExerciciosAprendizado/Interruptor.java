package ExerciciosAprendizado;

public class Interruptor {
   public String espelho;
   private boolean botao;
   public String fio;
   public String tomada;
   public String corTomada;
   
    public Interruptor(String espelho, String fio, String tomada, String corTomada) {
    this.espelho = espelho;
    this.fio = fio;
    this.tomada = tomada;
    this.corTomada = corTomada;
}

    /////////////////////////////////
    public String getEspelho(){
       return this.espelho;
    }

    public void setEspelho(String e){
       this.espelho = e;
    }
    ///////////////////////////////
    public boolean getBotao(){
       return this.botao;
    }

    public void setBotao(boolean b){
       this.botao = b;
    }
    ///////////////////////////////
    public String getFio(){
       return this.fio;
    }

    public void setFio(String f){
       this.fio = f;
    }
    /////////////////////
    public String getTomada(){
       return this.tomada;
    }

    public void setTomada(String t){
       this.tomada = t;
    }
    //////////////////////////////
    public String getCorTomada(){
       return this.corTomada;
    }

    public void setCorTomada(String ct){
       this.corTomada = ct;
    }
    //////////////////////////////

    void status() {
        System.out.println("Qual a cor do espelho?" + this.getEspelho());
        System.out.println("Qual o modelo da tomada?" + this.getTomada());
        System.out.println("Qual a cor da tomada?" + this.getCorTomada());
        System.out.println("Está ligado?" + this.getBotao());
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
