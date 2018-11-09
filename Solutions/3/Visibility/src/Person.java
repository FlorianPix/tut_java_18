
public class Person {
	private String name, secrets;
	
	Person(String name, String secrets){
		this.name = name;
		this.secrets = secrets;
	}
	
	public String getName () {
		return name;
	}

	private String getSecrets () {
		return secrets;
	}
	
	public static void main(String[] args) {
		Person exampleStudent = new Person("Peter", "schnarcht, liebt Einhörner,..."  );
		
		exampleStudent . getName () ; // Works !
		exampleStudent . getSecrets () ; // Works !
	}
}

