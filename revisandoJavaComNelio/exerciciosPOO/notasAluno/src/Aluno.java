public class Aluno {
  public String nome;
  public Double nota1;
  public Double nota2;
  public Double nota3;

  public void calcularMedia() {
    Double media = nota1 + nota2 + nota3;

    mostrarMensagemMedia(media);

  }

  private void mostrarMensagemMedia(Double media) {
    if (media < 60.0) {
      Double quantoFaltou = 60.0 - media;
      System.out.println("FINAL GRADE " + media);
      System.out.println("FAILED");
      System.out.println("MISSING " + quantoFaltou + " POINTS");
    } else {
      System.out.println("FINAL GRADE " + media);
      System.out.println("PASS");
    }
  }
}
