package TeamExam1;

import java.util.Scanner;

public class StratDelivery {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배달할 집의 수를 입력하세요: ");
        int n = sc.nextInt();
        System.out.println();
        
        House[] houses = new House[n];
        
        for (int i = 0; i < n; i++) {
        	System.out.println("["+(i+1)+"번째 집의]");
            System.out.print("배달할 상자 수 : ");
            int deliveryCount = sc.nextInt();

            System.out.print("회수할 상자 수 : ");
            int pickupCount = sc.nextInt();

            houses[i] = new House(deliveryCount, pickupCount);
            System.out.println("━".repeat(15)+(i+1)+"번째 집 입력 완료");
        }

        System.out.print("트럭의 용량을 입력하세요: ");
        int capacity = sc.nextInt();

        DeliveryService truck = new Truck(capacity);
        int[] deliveries = new int[n];
        int[] pickups = new int[n];

        for (int i = 0; i < n; i++) {
            deliveries[i] = houses[i].getDeliveryCount();
            pickups[i] = houses[i].getPickupCount();
        }

        int minDistance = truck.MinimumMove(deliveries, pickups);

        System.out.println("최소 이동 거리: " + minDistance);

        sc.close();
    }
}