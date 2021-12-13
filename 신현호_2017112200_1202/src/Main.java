import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("ArrList<E>클래스 설계");
        ArrList<Integer> arr = new ArrList<Integer>();
        arr.add(5);
        arr.add(4);
        arr.add(-1);
        
        System.out.println("ArrList요소수:"+arr.size());
        for(int i=0;i<arr.size();i++) {
        	System.out.println(arr.get(i));
        }
        System.out.println();
        
        arr.add(2,100);
        arr.show();
        
        arr.remove(1);
        arr.show();
	}

}
