package week1.day1;

public class FireFox { 
	float version=100.2f;
	String name="FireFox";
	boolean visible= true;
	int year=1998;
	char logo='m';
	public static void main(String[] args) {
		float version=100.2f;
		String name="FireFox";
		boolean visible= true;
		int year=1998;
		char logo='m';
  			System.out.println(version);
  			System.out.println(name);
  			System.out.println(visible);
  			System.out.println(year);
  			System.out.println(logo);
  			
  			FireFox status=new FireFox();
  			System.out.println(status.version);
  			System.out.println(status.name);
  			System.out.println(status.visible);
  			System.out.println(status.year);
  			System.out.println(status.logo);
  			
	}
}