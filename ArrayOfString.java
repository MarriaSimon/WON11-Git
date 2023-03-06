import java.util.*;

public class ArrayOfString{
	public static void main(String[] args){
		phraseOfString();

	}
	public static void phraseOfString(){
		String str = "This is a String. Strings arren't easy. Let's split it.";
		 String tokens[] = str.split("[.]", 0);
		 	for(String token : tokens){
		 		System.out.println(token);
		 } 	
	}
}