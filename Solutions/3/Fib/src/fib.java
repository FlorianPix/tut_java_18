
public class fib {
	public static void main(String[] args) {
		for(int j = 0; j <= 15; j++) {
			System.out.println(fib(j));
		}
	}
	
	static int fib (int i){
		if(i<=0) // fuer negative Zahl auch 0!
			return 0;
		else if(i<=2)
			return 1;
		else
			return fib(i-2)+fib(i-1); 
	}
}
