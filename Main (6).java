import java.util.Scanner;
  
class Main {
  public static void main(String[] args) {
    package if_else;
    
    float n1,n2,n3,n4,media;
    Scanner ler;
    
    ler = new Scanner(System.in);
    System.out.println("sua nota na primeira prova");
    n1 = ler.nextFloat();
    System.out.println("na segunda prova ");
    n2 = ler.nextFloat();
    System.out.println("na terceira prova");
    n3 = ler.nextFloat();
    System.out.println("na quarta prova");
    n4 = ler.nextFloat();
    media = (n1+n2+n3+n4)/4;
    System.out.println("sua media final é "+ media); 
    if(media >= 7 ){
     System.out.println("voce passou");
      }
      else if(media >= 5 && media < 7 {System.out.println("RECUPERAÇÃO");}
    }else{
        
        System.out.println("voce nao passou");
        }
}
    
}
  }