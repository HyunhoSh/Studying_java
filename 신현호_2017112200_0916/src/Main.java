import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("�Է�(3�ڸ�): ");
        
        int k;
        Scanner sc = new Scanner(System.in);
        
        k = sc.nextInt();
        
        int a,b,c;
        
        a = k/100;
        b = (k%100)/10;
        c = (k%10);
        
        int res=0;
        
        res = a+b+c;
        System.out.println("�ڸ��� �հ�: "+res);
        
	}

}
