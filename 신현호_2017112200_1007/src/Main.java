import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("[Practice3-6]\n");
        
        System.out.println(" [ menu ]");
        System.out.println(" 0 : exit");
        System.out.println(" 1 : input (array)");
        System.out.println(" 2 : show (array)");
        System.out.println(" 3 : menu");
        
        Scanner sc = new Scanner(System.in);
        int arr[] = null;
        int a=0; 
        while(true) {
        	System.out.print("> ");
            int sel = sc.nextInt();
            
            switch(sel) {
            case 0:
            	return;
            case 1:
            	arr = new int[10];
            	
            	System.out.print("정수(개수, 값)>");
            	a = sc.nextInt();
            	for(int i=0;i<a;i++) {
            		arr[i] = sc.nextInt();
            	}
            	System.out.println("입력 완료");
            	break;
            case 2:
            	for(int i=0;i<a;i++) {
            		System.out.print(arr[i]+" ");
            		
            	}
            	System.out.print("\n");
            	break;
            case 3:
            	System.out.println(" [ menu ]");
                System.out.println(" 0 : exit");
                System.out.println(" 1 : input (array)");
                System.out.println(" 2 : show (array)");
                System.out.println(" 3 : menu");
            }
        }
       
        
	}

}
