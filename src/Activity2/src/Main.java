import java.util.Scanner;

import static java.util.Scanner.*;

public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int equals = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter No. " + i + ":");
            int num = numero.nextInt();
            equals += num;
        }
        System.out.println("\nEquals to: " + equals);
        numero.close();
        }
    }
