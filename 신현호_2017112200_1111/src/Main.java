import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		King[] king = new King[30];
        int size = 0;
        
        System.out.println("[ menu ]");
		System.out.println("0. exit");
		System.out.println("1. input (King Info.)");
		System.out.println("2. show (King List)");
		System.out.println("3. menu");
		

		while(true) {
			String name = "";
			int sequence = 0;
			
			System.out.print("> ");
            int sel = sc.nextInt();
            
            switch(sel) {
            case 0:
            	return;
            case 1:
            	System.out.print("¿ÕÀÇ ÀÌ¸§> ");
            	name = sc.next();
            	System.out.print("¿ÕÀÇ ¼ø¼­> ");
            	sequence = sc.nextInt();
            	
            	king[size++] = new King(name, sequence);
            	break;
            case 2:
            	for(int i=0;i<size;i++) {
            		king[i].show();
            	}
            	
            	break;
            case 3:
            	break;
            }
		}
	}

}
