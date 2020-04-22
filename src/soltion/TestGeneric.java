package soltion;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {

	public static void main(String[] args) {
		
		List<Integer> intList= new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		List<? extends Number > numlList = intList;
		System.out.println(numlList);
	}
}
