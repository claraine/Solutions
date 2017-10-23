/**
 * 
 *
 */
import java.util.Scanner;
import java.lang.*;

public class Solutions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public static void AntonAndDanik() {
		Scanner kbd = new Scanner(System.in);
        int n = Integer.parseInt(kbd.next());
        String s = kbd.next();
        n = s.length();
        int a = 0, d = 0;
        
        for (int x = 0; x < n; x++){
        	if (s.charAt(x) == 'A'){
        		a++;
        	}
        	else if (s.charAt(x) == 'D'){
        		d++;
        	}
        }
        
        if (a > d){
        	System.out.println("Anton");
        }	
        else if (d > a){
        	System.out.println("Danik");
        }
        else{
        	System.out.println("Friendship");
        }
	}
}
