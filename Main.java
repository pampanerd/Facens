import java.util.Scanner;

class main{
  public static void main(String[] args) {
  int n1 = 13;
  int n2 = 15;
  int opcao;

  Scanner temp;

   temp = new Scanner(System.in);

     System.out.println("digite 1 pra somar");
     System.out.println("digite 2 pra multiplicar");
     System.out.println("digite 3 pra menos");
     System.out.println("digite 4 pra dividir");

    opcao = temp.nextInt();

switch (opcao){

case 1:
    System.out.println(n1+n2);
      break;
  case 2:
    System.out.println(n1*n2);
    break;
  case 3:
    System.out.println(n1-n2);
    break;
  case 4:
    System.out.println(n1/n2);
    break;
}
}
}