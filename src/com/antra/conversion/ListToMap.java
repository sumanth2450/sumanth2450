package com.antra.conversion;

/**
 * @author Sivakanth
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {

		Object[] obArr1 = { 1, "One" };
		Object[] obArr2 = { 2, "Two" };
		Object[] obArr3 = { 3, "Three" };
		Object[] obArr4 = { 4, "Four" };
		Object[] obArr5 = { 5, "Five" };
		Object[] obArr6 = { 6, "Six" };

		List<Object[]> list = new ArrayList<>();

		list.add(obArr1);
		list.add(obArr2);
		list.add(obArr3);
		list.add(obArr4);
		list.add(obArr5);
		list.add(obArr6);

//		for(int i=0;i<list.stream().count();i++) {
//			
//			System.out.println(list.get(i)[0]+","+list.get(i)[1]);
//		}

		for (Object[] obj : list) {

			System.out.println(obj[0] + "," + obj[1]);
		}

		Map<Integer, String> map = list.stream().collect(Collectors.toMap(ob -> (Integer) ob[0], ob -> (String) ob[1]));

		System.out.println(map);
	}
}