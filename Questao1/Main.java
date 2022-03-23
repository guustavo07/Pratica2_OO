class Main {
  public static void main(String[] args) {
    estoque novoProduto = new estoque("Borracha", 19, 3);
    System.out.println("O estoque inicial é: " + novoProduto.getQtdAtual());
    novoProduto.darBaixa(6);
    System.out.println("O estoque atualizado é: " + novoProduto.getQtdAtual());
    System.out.println(novoProduto.Mostra());
    System.out.println("Precisa repor: " + novoProduto.precisaRepor());
  }
}