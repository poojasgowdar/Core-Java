package org;

public class Mobile {
	Mobile(int cost) {
		System.out.println("Mobile cost: " + cost);
	}

	Mobile(String name) {
		System.out.println("Mobile name: " + name);
	}

	Mobile(String name, int cost) {
		System.out.println("Mobile name:" + name + " Mobile cost: " + cost);
	}

	Mobile(int cost, String name) {
		System.out.println("Mobile cost:" + cost + " Mobile name: " + name);
	}

	public static void main(String[] args) {
		new Mobile("Samsung");
		new Mobile(50000);
		new Mobile("Vivo", 60000);
		new Mobile(40000, "Oppo");

	}

}
