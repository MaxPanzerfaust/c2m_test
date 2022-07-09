import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println(fibonacciSeq(sc.nextInt()));
    }

    public static Integer fibonacciSeq(Integer n){
       if (n<1)
           throw new IllegalArgumentException("Введенный номер элемента меньше 1");
        switch(n){
           case 1:
           { return 0;}
           case 2:
           { return 1;}
           default:
           {
               int prevprev=0;
               int prev =1;
               int current=0;
               for (Integer i=3;i<n+1;i++){
                   current=prevprev+prev;
                   prevprev=prev;
                   prev=current;
                   System.out.println(current);
               }
               return current;
           }
       }

    }
}
