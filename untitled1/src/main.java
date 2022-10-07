import java.io.BufferedReader;
import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input text");
        String str = in.nextLine();
        str = str.replaceAll("[^A-Za-z1-9]+", "");
        str = str.toLowerCase();
        System.out.println(str);
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println(reverse);
        if (str.equals(reverse)){
            System.out.println("Polindrom");
        }
        else{
            System.out.print("It is not polindrom");
        }
       // int N = in.nextInt();
      // int array[] = new int[N];
      //  System.out.println("Insert array elements");
      //  for (int i = 0; i < N; i++){
       //     array[i] = in.nextInt();
      //      System.out.println(array[i] + " ");
      //  }
      //  System.out.println("Only non-multiple two");
      //  for (int i = 0; i < N; i ++) {
      //  if (array[i] % 2 == 1){
       //     System.out.print(array[i] + " ");
       // }
    //}
}
}
