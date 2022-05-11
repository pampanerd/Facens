import java.util.Scanner;
public class Main {
public static void main(String [] args){
  int numero;
  int i;
   Scanner recebe = new 
     Scanner(System.in);
  System.out.print("digite um numero que deseja ter a tabuada: ");
  numero = recebe.nextInt();

  for(i = 0; i< 11; i++){
    System.out.println(numero*i);
   }
 }
}
