import java.util.Scanner;

public class Main {
public static void main(String [] args){

  int i;
  int f1=0;
  int f2=1;
  int next;

  for (i = 1; i < 101;i++){
  next = f1 + f2;
  f1 = f2;
  f2 = next;

 System.out.println(f1);
    }
  }
}

  

