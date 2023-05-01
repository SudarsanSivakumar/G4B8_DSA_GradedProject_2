package skyscraper;

import java.util.Scanner;

public class SkyscraperDriver{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no of floors in the building: ");
        int n = sc.nextInt();
        int[] sizes = new int[n];
        for(int i=0; i<n; i++) {
            System.out.println("Enter the floor size given on day "+(i+1)+":");
            sizes[i] = sc.nextInt();
        }
        sc.close();
        SkyscraperConstruction driver = new SkyscraperConstruction(n, sizes);
        driver.printConstructionOrder();
    }
}
