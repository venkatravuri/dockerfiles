import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {

	public static void main(String args[]){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("Hello world from the container, current date/time is: "+ sdf.format(new Date()));
		
	}
}
