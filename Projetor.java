public class Projetor {
  private boolean ligado;
  private String tipo;
  private String marca;

  public Projetor() {

  }

  public Projetor (boolean ligado, String tipo, String marca){
    this.ligado = ligado;
    this.tipo = tipo;
    this.marca = marca;
  }

  public Projetor(boolean ligado) {
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

  public void ligar() {
    System.out.println("iniciando o projetor...");

    try {
            Thread.sleep(3000);
    } catch(InterruptedException eInterruptedException) {
            System.out.println("** RuntimeException from main");
    }

    this.setLigado(true);
      System.out.println("projetor ligado!");
    }

  public void desligar() {
    System.out.println("desligando o projetor...");

    try {
      Thread.sleep(3000);
    } catch(InterruptedException eInterruptedException) {
      System.out.println("** RuntimeException from main");
    }

    this.setLigado(false);
    System.out.println("projetor desligado com sucesso ");
  }

  public void projetar() {
    System.out.println("projetando...");
  }
}