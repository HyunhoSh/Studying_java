import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.print("정수(3개): ");
	        
	        Scanner sc = new Scanner(System.in);
	        int a,b,c;
	        a = sc.nextInt();
	        b = sc.nextInt();
	        c = sc.nextInt();
	        
	        if(a>b && b>c) {
	        	System.out.println("내림차순: "+a+" "+b+" "+c);
	        }
	        else if(a>b && c>b && c>a) {
	        	System.out.println("내림차순: "+c+" "+a+" "+b);
	        }
	        else if(a>b && c>b && a>c) {
	        	System.out.println("내림차순: "+a+" "+c+" "+b);
	        }
	        else if(c>b && b>a) {
	        	System.out.println("내림차순: "+c+" "+b+" "+a);
	        }
	        else if(b>a && a>c) {
	        	System.out.println("내림차순: "+b+" "+a+" "+c);
	        }
	        else if(b>a && c>a && b>a) {
	        	System.out.println("내림차순: "+b+" "+c+" "+a);
	        }
	}

}
