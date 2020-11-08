public class Lampada {
  private boolean ligado;
  private String tipo;
  private String marca;
  private String iluminacao;

  public Lampada() {

    }

  public Lampada (boolean ligado, String tipo, String marca, String iluminacao){
    this.ligado = ligado;
    this.tipo = tipo;
    this.marca = marca;
    this.iluminacao = iluminacao;
  }

  public Lampada(boolean ligado) {
        this.ligado = ligado;
  }

  public boolean isLigado() {
        return ligado;
  }

  public void setLigado(boolean ligado) {
        this.ligado = ligado;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getIluminacao() {
    return iluminacao;
  }

  public void setIluminacao(String iluminacao) {
    this.iluminacao = iluminacao;
  }

  public void ligar() {
    System.out.println("ligando a lâmpada...");

    try {
            Thread.sleep(3000);
    } catch(InterruptedException eInterruptedException) {
            System.out.println("** RuntimeException from main");
    }

    this.setLigado(true);
      System.out.println("A lâmpada está ligada!");
    }

  public void desligar() {
    System.out.println("desligando a lâmpada...");

    try {
      Thread.sleep(3000);
    } catch(InterruptedException eInterruptedException) {
      System.out.println("** RuntimeException from main");
    }

    this.setLigado(false);
    System.out.println("A lâmpada está ligada!");
  }

  void piscar() {
    System.out.println("A lâmpada está piscando");
  }
}