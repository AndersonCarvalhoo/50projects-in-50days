public class ContaBancaria {
  private int numero;
  private String nomeDoTitular;
  private Double saldo = 0.0;

  public ContaBancaria(int numero, String nomeDoTitular) {
    this.numero = numero;
    this.nomeDoTitular = nomeDoTitular;
    this.saldo = 0.0;
  }

  public ContaBancaria(int numero, String nomeDoTitular, Double saldo) {
    this.numero = numero;
    this.nomeDoTitular = nomeDoTitular;
    this.depositar(saldo);
  }

  public int getNumero() {
    return numero;
  }

  public String getNomeDoTitular() {
    return nomeDoTitular;
  }

  public void setNomeDoTitular(String nomeDoTitular) {
    this.nomeDoTitular = nomeDoTitular;
  }

  public Double getSaldo() {
    return saldo;
  }

  public void depositar(Double saldo) {
    this.saldo += saldo;
  }

  public void sacar(Double saldo) {
    if (saldo <= (this.saldo + 5)) {
      this.saldo -= (saldo + 5);
    } else {
      System.out.println("Saldo insuficiente para sacar");
    }

  }

  public String toString() {
    return "Conta " + this.getNumero() + ", Titular: " + this.getNomeDoTitular() + ", Saldo: R$" + this.getSaldo();
  }

}
