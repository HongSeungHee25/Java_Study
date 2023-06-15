package TeamExam;

import java.util.Random;
import java.util.Scanner;


public class StratDelivery {
	 public static final String Red = "\u001B[31m";
	 public static final String Reset = "\u001B[0m";
	 
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Random random = new Random();

	        int delivTotal=0;
	        int collecTotal=0;
	        
	        System.out.print("트럭에 한번에 실을 수 있는 상자의 수를 입력하세요: ");
	        int capacity = sc.nextInt();

	        System.out.print("배달할 집의 수를 입력하세요: ");
	        int house = sc.nextInt();
	        System.out.println();

	        House[] houses = new House[house];

	        for (int i = 0; i < house; i++) {
	            // 임의의 값을 생성하여 배달 및 회수할 상자 수 입력
	            int deliveryCount = random.nextInt(10) + 1;
	            int pickupCount = random.nextInt(5) + 1;

	            houses[i] = new House(deliveryCount, pickupCount);
	            delivTotal += deliveryCount;
	            collecTotal += pickupCount;
	        }
	        System.out.print("오늘 "+Red+"배송"+Reset+"할 총 택배수는 " + delivTotal + "개 이고,");
	        System.out.println(Red+"회수"+Reset+"할 택배수는 "+collecTotal+"개 입니다.");
	        
	        for (int i = 0; i < house; i++) {
	        	System.out.println((i + 1) + "번째 집에 배송할 택배수는 " + houses[i].getDeliveryCount() + "개,"
	        			+ " 회수할 택배수는 " + houses[i].getPickupCount()  + "개 입니다.");
			}
	        

	        DeliveryService truck = new Truck(capacity);
	        int[] deliveries = new int[house];
	        int[] pickups = new int[house];

	        for (int i = 0; i < house; i++) {
	            deliveries[i] = houses[i].getDeliveryCount();
	            pickups[i] = houses[i].getPickupCount();
	        }

	        int minDistance = truck.MinimumMove(deliveries, pickups);

	        System.out.println("▶ 배달 가능한 "+Red+"최소 이동거리"+Reset+"는 " + minDistance+" 입니다.");

	        sc.close();
	    }
}