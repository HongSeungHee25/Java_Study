package map;

import java.util.Scanner;

public class MapMain {

	public static void main(String[] args) {
		
		Subway[] map = new Subway[10];
		Scanner sc = new Scanner(System.in);
		
		map[0] = new Line(1, "수원역");
		map[1] = new Line(2, "사당역");
		map[2] = new Line(3, "강남역");
		
		
		System.out.print("지하철 노선을 입력해주세요 >> ");
		
	}

}
