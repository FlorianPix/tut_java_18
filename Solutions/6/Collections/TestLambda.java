import java.util.HashMap;
import java.util.Map;

public class TestLambda {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();
		for(int i = 0; i < 10; i++) {
			map.put(i, "hallo");
		}
		
		map.forEach ((k , v) -> {
				System . out . println (" Key : " + k + ", value : " + v);
			}
		);
	}
}
