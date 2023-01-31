package com.ssafy.ws.step1;

public class CarTest {
	public static void main(String[] args) {
		
		// car.dat 파일생성
//		Car car1 = new Car("KMHXX00XXXX000000", "쏘나타", "Red", 12000);
//		Car car2 = new Car("KNHXX00XXXX000000", "K5", "White", 35000);
//		Car car3 = new Car("KNHXX00XXXX000001", "K3", "Black", 3000);
//		ElectricCar ecar1 = new ElectricCar("KMHXX00XXXX0000123", "아이오닉", "Gray", 5000, 100);
//
//		ICarManager cm = CarMangerImpl.getInstance();
//
//		cm.add(car1);
//		cm.add(car2);
//		cm.add(car3);
//		cm.add(ecar1);
//
//		cm.saveData();
		
		ICarManager cm = CarMangerImpl.getInstance();
		
		System.out.println("-------------getList-------------");
		Car[] carList = cm.getList();
		for (Car c : carList)
			System.out.println(c);

	}
}
