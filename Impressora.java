public class Impressora {
  private boolean ligado;
  private String tipo;
  private String marca;
  private String cor;

  public Impressora() {

  }

  public Impressora (boolean ligado, String tipo, String marca, String cor){
    this.ligado = ligado;
    this.tipo = tipo;
    this.marca = marca;
    this.cor = cor;
  }

  public Impressora(boolean ligado) {
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

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public void ligar() {
    System.out.println("iniciando a impressora...");

    try {
            Thread.sleep(3000);
    } catch(InterruptedException eInterruptedException) {
            System.out.println("** RuntimeException from main");
    }

    this.setLigado(true);
      System.out.println("impressora ligada!");
    }

  public void desligar() {
    System.out.println("desligando a impressora...");

    try {
      Thread.sleep(3000);
    } catch(InterruptedException eInterruptedException) {
      System.out.println("** RuntimeException from main");
    }

    this.setLigado(false);
    System.out.println("impressora desligada com sucesso ");
  }

  public void imprimir() {
    System.out.println("imprimindo...");
  }
  
  public void scanear() {
    System.out.println("scaneando...");
  }
}