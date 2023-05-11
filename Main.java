import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o tamanho da primeira fila: ");
    int tam1 = entrada.nextInt();
    System.out.println("Digite o tamanho da segunda fila: ");
    int tam2 = entrada.nextInt();
    
    Fila fila1 = new Fila(tam1);
    Fila fila2 = new Fila(tam2);

    int valor = 0;
    for(int i = 0; i < tam1; i++){
      valor = entrada.nextInt();
      fila1.enfileira(valor);
    }
    for(int i = 0; i < tam2; i++){
      valor = entrada.nextInt();
      fila2.enfileira(valor);
    }
    int tam3 = tam1 + tam2;
    Fila fila3 = new Fila(tam3);
    for(int i = 0; i < tam2; i++ ){
      fila3.enfileira(fila1.getPrimeiro());
      fila3.enfileira(fila2.getPrimeiro());
      fila1.desenfileirar();
      fila2.desenfileirar();
    }
    
  }
}
