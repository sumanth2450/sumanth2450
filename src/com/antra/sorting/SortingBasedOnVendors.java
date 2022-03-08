package com.antra.sorting;

/**
 * @author Sivakanth
 */
import java.util.ArrayList;
import java.util.List;

public class SortingBasedOnVendors {

	public static void main(String[] args) {

		List<ProductModel> list = new ArrayList<>();

		ProductModel p1 = new ProductModel(110, 200.0, "Samsung");
		ProductModel p2 = new ProductModel(111, 100.0, "Samsung");
		ProductModel p3 = new ProductModel(112, 300.0, "Sony");
		ProductModel p4 = new ProductModel(113, 1500.0, "Realme");
		ProductModel p5 = new ProductModel(114, 50.0, "Iquoo");
		ProductModel p6 = new ProductModel(115, 1200.0, "Apple");
		ProductModel p7 = new ProductModel(116, 20.0, "Samsung");
		ProductModel p8 = new ProductModel(117, 1100.0, "Sony");
		ProductModel p9 = new ProductModel(118, 30.0, "Sony");
		ProductModel p10 = new ProductModel(119, 150.0, "Samsung");
		ProductModel p11 = new ProductModel(120, 500.0, "Iquoo");
		ProductModel p12 = new ProductModel(121, 1700.0, "Samsung");

		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);
		list.add(p8);
		list.add(p9);
		list.add(p10);
		list.add(p11);
		list.add(p12);

//		System.out.println(list);

		list.stream().filter(t -> t.getVendor().equals("Samsung"))
				.sorted((pr1, pr2) -> pr1.getpCost().compareTo(pr2.getpCost())).forEach(System.out::println);

		System.out.println("=============================================================");

		list.stream().filter(t -> t.getVendor().equals("Samsung"))
				.sorted((pr1, pr2) -> Integer.compare(pr1.getpCost().intValue(), pr2.getpCost().intValue()))
				.forEach(System.out::println);
	}
}