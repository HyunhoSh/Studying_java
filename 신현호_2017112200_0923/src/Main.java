import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.print("����(3��): ");
	        
	        Scanner sc = new Scanner(System.in);
	        int a,b,c;
	        a = sc.nextInt();
	        b = sc.nextInt();
	        c = sc.nextInt();
	        
	        if(a>b && b>c) {
	        	System.out.println("��������: "+a+" "+b+" "+c);
	        }
	        else if(a>b && c>b && c>a) {
	        	System.out.println("��������: "+c+" "+a+" "+b);
	        }
	        else if(a>b && c>b && a>c) {
	        	System.out.println("��������: "+a+" "+c+" "+b);
	        }
	        else if(c>b && b>a) {
	        	System.out.println("��������: "+c+" "+b+" "+a);
	        }
	        else if(b>a && a>c) {
	        	System.out.println("��������: "+b+" "+a+" "+c);
	        }
	        else if(b>a && c>a && b>a) {
	        	System.out.println("��������: "+b+" "+c+" "+a);
	        }
	}

}
