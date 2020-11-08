class Main {
  public static void main(String[] args) {
    Impressora impresoraA = new Impressora(true, "Jato de tinta", "HP", "Branca");

    Impressora impresoraB = new Impressora();
    impresoraB.setLigado(true);
    impresoraB.setTipo("Laser");
    impresoraB.setMarca("Epson");
    impresoraB.setCor("Preta");

    Impressora impresoraC = new Impressora();
    impresoraC.setLigado(false);
    impresoraC.setTipo("Plotter");
    impresoraC.setMarca("Brother");
    impresoraC.setCor("Cinza");

    Lampada lampadaA = new Lampada(true, "Incandescente", "Osram","fria");

    Lampada lampadaB = new Lampada();
    lampadaB.setLigado(false);
    lampadaB.setTipo("Fluorescente");
    lampadaB.setMarca("Sil Lux");
    lampadaB.setIluminacao("neutra");

    Lampada lampadaC = new Lampada();
    lampadaB.setLigado(true);
    lampadaC.setTipo("LED");
    lampadaC.setMarca("Philips");
    lampadaC.setIluminacao("quente");

    Projetor projetorA = new Projetor(true, "LCD", "ViewSonic");

    Projetor projetorB = new Projetor();
    projetorB.setLigado(true);
    projetorB.setTipo("DLP");
    projetorB.setMarca("BenQ");

    Projetor projetorC = new Projetor();
    projetorC.setLigado(false);
    projetorC.setTipo("LCOS");
    projetorC.setMarca("LG");

    System.out.println("Impressora A está ligada? " + impresoraA.isLigado());
    System.out.println("Tipo: " + impresoraA.getTipo());
    System.out.println("Marca: " + impresoraA.getMarca());
    System.out.println("Cor: " + impresoraA.getCor());
    impresoraA.imprimir();

    System.out.println("Impressora B está ligada? " + impresoraB.isLigado());
    System.out.println("Tipo: " + impresoraB.getTipo());
    System.out.println("Marca: " + impresoraB.getMarca());
    System.out.println("Cor: " + impresoraB.getCor());
    impresoraB.scanear();

    System.out.println("Impressora C está ligada? " + impresoraC.isLigado());
    System.out.println("Tipo: " + impresoraC.getTipo());
    System.out.println("Marca: " + impresoraC.getMarca());
    System.out.println("Cor: " + impresoraC.getCor());
    impresoraC.desligar();

    System.out.println("A lâmpada A está ligada? " + lampadaA.isLigado());
    System.out.println("Tipo: " + lampadaA.getTipo());
    System.out.println("Marca: " + lampadaA.getMarca());
    System.out.println("Iluminação: " + lampadaA.getIluminacao());
    lampadaA.desligar();

    System.out.println("A lâmpada B está ligada? " + lampadaB.isLigado());
    System.out.println("Tipo: " + lampadaB.getTipo());
    System.out.println("Marca: " + lampadaB.getMarca());
    System.out.println("Iluminação: " + lampadaB.getIluminacao());
    lampadaB.piscar();

    System.out.println("A lâmpada C está ligada? " + lampadaC.isLigado());
    System.out.println("Tipo: " + lampadaC.getTipo());
    System.out.println("Marca: " + lampadaC.getMarca());
    System.out.println("Iluminação: " + lampadaC.getIluminacao());
    lampadaC.ligar();

    System.out.println("O projetor A está ligado? " + projetorA.isLigado());
    System.out.println("Tipo: " + projetorA.getTipo());
    System.out.println("Marca: " + projetorA.getMarca());
    projetorA.ligar();

    System.out.println("O projetor B está ligado? " + projetorB.isLigado());
    System.out.println("Tipo: " + projetorB.getTipo());
    System.out.println("Marca: " + projetorB.getMarca());
    projetorB.projetar();

    System.out.println("O projetor B está ligado? " + projetorC.isLigado());
    System.out.println("Tipo: " + projetorC.getTipo());
    System.out.println("Marca: " + projetorC.getMarca());
    projetorC.desligar();

  }
}