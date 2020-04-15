package soltion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[]{1,2,3,4,5,6});
		List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );
		
		
		 Person p= persons.stream()
				.filter(person -> "jack1".equalsIgnoreCase(person.getName()))
				.findAny()
				.orElse(null);
				
				
//		List<Integer> newList=list.stream().filter(num->num%2==0).collect(Collectors.toList());
		 
		 
		List<Integer> newList1=list.stream()
				.filter(num->num+1)
				.collect(Collectors.toList());
		System.out.println(p);
	}

}
