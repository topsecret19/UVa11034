import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	int tests = sc.nextInt();
	for(int i=0; i<tests; i++){
		int L = sc.nextInt() * 100;
		int m = sc.nextInt();
		
		Queue<Integer> left = new LinkedList<Integer>();
		Queue<Integer>right = new LinkedList<Integer>();
		for(int j=0; j<m; j++) {
			int x = sc.nextInt();
			if(sc.next().equals("left")) {
				left.add(x);
			}else {
				right.add(x);
			}
		}
		int ans = 0;
		while(!left.isEmpty() || !right.isEmpty())
		{
			ans++;
			int length = L;
			while(!left.isEmpty() && left.peek() <= length) {
				length -= left.remove();
			}
			length = L;
			if(!left.isEmpty() || !right.isEmpty()) {
				++ans;
			}
			while(!right.isEmpty() && right.peek() <= length) {
				length -= right.remove();
			}
		}
		System.out.println(ans);
}
}
}