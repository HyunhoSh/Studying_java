import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("입력예: ");
        Scanner sc = new Scanner(System.in);
        
        int a;
        a = sc.nextInt();
        
        System.out.print("출력예: ");
        
        for(char i=32;i<=a;i++) {
        	
        	if(i%16==0 && i!=32) {
        		System.out.println("");
        	}
        	System.out.print(i+ " ");
        	
        }
	}

}