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

	/**
 	* @param position is the current position of the King
 	* @return the number of moves the King can make
 	*/
	public static int determineMoves(String position){
		char[] a = position.toCharArray();
		if (a[0] == 'a' || a [0] == 'h'){
			if(a[1] == '1' || a [1] == '8'){
				return 3;
			} else if (a[1] < '1' || a[1] > '8'){
				return 0;
			} else{
				return 5;
			}
		} else if (a[0] > 'h' || a[0] < 'a'){
			return 0;
		} else if (a[1] == '1' || a [1] == '8'){
			return 5;
		} else if (a[1] < '1' || a[1] > '8'){
			return 0;
		} else {
			return 8;
		}
	}
}
