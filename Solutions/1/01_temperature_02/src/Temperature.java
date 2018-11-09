public class Temperature {
	public String convert(int celsius) {
		return celsius + "°C sind " + (celsius * 9 / 5 + 32) + "°F.";
	}
}