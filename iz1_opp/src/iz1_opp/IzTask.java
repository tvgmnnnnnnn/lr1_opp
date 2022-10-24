package iz1_opp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IzTask {

	public static void DoTask(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Vvedite kol-vo chisel > ");
        int N = sc.nextInt();
        
        double A;
        ArrayList<Double> aa = new ArrayList();
        
        for(int i = 0; i < N; i++) {
            System.out.print("Vvedite chislo "+ String.valueOf(i+1) +" > ");
            A = sc.nextDouble();
            aa.add(A);
        }
        
        Collections.sort(aa);
        
        double Sum = 0;
        for(int i = 0; i < 2; i++) {
        	Sum = Sum + aa.get(i);
        }
        
        System.out.println("Summa ravna > "+ Sum);
        
        sc.close();
    }
}
