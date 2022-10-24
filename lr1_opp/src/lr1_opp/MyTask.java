package lr1_opp;

import java.util.ArrayList;
import java.util.Scanner;

public class MyTask {

	public static void DoTask(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Vvedite kol-vo chisel > ");
        int N = sc.nextInt();
        
        double a;
        ArrayList<Double> aa = new ArrayList();
        
        for(int i = 0; i < N; i++) {
            System.out.print("Vvedite chislo "+ String.valueOf(i+1) +" > ");
            a = sc.nextDouble();
            aa.add(a);
        }
        
        double b = 0;
        System.out.println("Resultiruyshaya posledovatelnost:");
        for (int i = 0; i < N; i++) {
            b += (1-aa.get(i))/(i+aa.get(i)*aa.get(i));
            System.out.println(b);
        }
        
        sc.close();
    }
}