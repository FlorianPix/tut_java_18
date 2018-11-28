import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class FibonacciArray{
	Integer[] fibArray = new Integer[1];
	
	public int fib (int i){
		if(i<=0) // fuer negative Zahl auch 0!
			return 0;
		else if(i<=2)
			return 1;
		else
			return fib(i-2)+fib(i-1); 
	}
	
	public boolean check(Integer i) {
		int j = 0, fib = 0;
		while(fib < i) {
			fib = fib(j);
			if(fib == i) {
				return true;
			}
			j++;
		}
		return false;
	}
	
	public boolean add(Integer i) {
		try {
			if (!check(i)) {
				throw new NoFibonacciException();
			}
		} catch (NoFibonacciException e) {
			e.info();
			return false;
		}

		Integer[] result = Arrays.copyOf(fibArray, fibArray.length +1);
		result[fibArray.length] = i;
		System.out.println(Arrays.toString(result));
		fibArray = result;
		return true;
	}
}
