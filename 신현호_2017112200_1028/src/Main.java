
class Example{
	boolean odd(int k){
	   if(k%2==1) {
		   return true;
	   }
	   else {
		   return false;
	   }
	}
	

	
	int min(int[] arr) {
		int len = arr.length;
		
		int min = arr[0];
		
		for(int i=0;i<len;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		return min;
	}
}

public class Main {
	
	public static char next(char ch) {
		int m = ch;
		 
		char u = (char)(m+1);
		return u;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Example ex = new Example();
		
		//1��
		int a = 5;
		System.out.print("1������= ");
		if(ex.odd(a)) {
			System.out.println("Ȧ��");
		}
		else {
			System.out.println("¦��");
		}
		
		//2��
		char c = 's';
		c = next(c);
		System.out.println("2������= "+c);
		
		//3��
		int[] data = {10,5,8,20,7,3,30,25,15};
		System.out.println("3������= "+ex.min(data));
	}

}
