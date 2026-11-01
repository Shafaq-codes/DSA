// Battery Low (BATTERYLOW)
// CodeChef URL: https://www.codechef.com/problems/BATTERYLOW
// Language: Java

import java.util.Scanner;

class BatteryLow {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int x = sc.nextInt();
            
            if (x <= 15) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
