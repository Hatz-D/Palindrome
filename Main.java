// Diogo Lourenzon Hatz - 32247389

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Palindromo palindromo = new Palindromo();
    String texto = "";

    while(texto.equals("/sair") != true){
      
      System.out.printf("Digite a frase a ser verificada: ");
      texto = scanner.nextLine();
      if(texto.equals("/sair")){
        System.out.println("Até a próxima! :)");
        break;
      }
      palindromo.setTexto(texto);
      boolean aux = palindromo.verificar(texto);
      System.out.println("Palíndromo: " + aux);
      
    }
    
  }
}