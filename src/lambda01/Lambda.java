package lambda01;

import java.util.Arrays;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		// trabalhar com expressão lambda
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		for(Integer num : numeros ) {
			System.out.println(num);
		}
		
		System.out.println("utilizando a expressão lambda");
		
		numeros.forEach( num -> System.out.println(num));

	}

}
