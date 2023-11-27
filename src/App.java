import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner  tb = new Scanner(System.in);

        //a
        System.out.println("exercise A"); 

        int tal=0;
        while(tal<6){
            System.out.println(tal);
            tal++;
        }

        System.out.println(""); //mellanrum

        //b
        System.out.println("exercise B"); 

        int num=2;
        while(num<6){
            System.out.println(num);
            num++;
        }

        System.out.println(""); //mellanrum

        //c
        System.out.println("exercise C"); 

        for(int x=0; x<6; x++){
            System.out.println(x);
        }
        
        System.out.println(""); //mellanrum

        //d
        System.out.println("exercise D"); 

        int x2=2;
        do{
            System.out.println(x2);
            x2++;
        }while(x2<6);

        System.out.println(""); //mellanrum

        //e
        System.out.println("exercise E"); 

        int x3=5;
        while(x3>-1){
            System.out.println(x3);
            x3--;
        }

        System.out.println(""); //mellanrum

        //f
        System.out.println("exercise F"); 

        for(int x5=5; x5>-1; x5--){
            System.out.println(x5);
        }

        System.out.println(""); //mellanrum

        //g
        System.out.println("exercise G"); 

        System.out.println("Write 5 numbers");
        int[] a = new int[5];
        
        for(int t=0; t<a.length; t++){
            a[t] = tb.nextInt();
        }

        for(int t=0; t<a.length; t++){
        System.out.print(a[t]);     
        }
        System.out.println(""); 
        //h
        System.out.println("exercise H"); 
        
        System.out.println("Write 5 numbers");
        int[] a2 = new int[5];
        
        for(int t2=0; t2<a2.length; t2--){
            a2[t2] = tb.nextInt();
        System.out.println("Your numbers are");
        System.out.println(a2[t2]);     
        }
    }
}
