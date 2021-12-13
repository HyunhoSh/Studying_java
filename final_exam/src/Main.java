class Practice{
	private int res = 0;
	
	Practice(){}
	
	int compute(int a, int b, char c) {
		int res = 0;
		
		if(c == '+'){
			res = a+b;	
		}
		else if(c=='-') {
			res = a-b;
		}
		
		return res;
	}
	
	void div3(int k) {
		System.out.println(k%3);
	}
	
	void del_note(String str) {
	    int h = str.length();
	    
	    int std=0;
	    
	    for(int i=0;i<h;i++) {
	    	if(str.charAt(i)=='/') {
	    		std = i;
	    		break;
	    	}
	    	
	    }
	    for(int j=0;j<std;j++) {
	    	System.out.print(str.charAt(j));
	    }
	    
	    System.out.println();
	}
	
	void del_nonchar(String st) {
        int h = st.length();
	    
	    int std=0;
	    
	    for(int i=0;i<h;i++) {
	    	if(st.charAt(i)>='a' && st.charAt(i)<='z') {
	    		System.out.print(st.charAt(i));
	    	}
	    	else {
	    		System.out.print("");
	    	}
	    }
	    System.out.println();
	}
}

class Goods{
	private String barcode;
	private int pos;
	
	Goods(String barcode, int pos){
		this.barcode = barcode;
		this.pos = pos;
	}
	
	String get_barcode() {
		return barcode;
	}
	int get_pos() {
		return pos;
	}
	void set_barcode(String barcode) {
		this.barcode = barcode;
	}
	void set_pos(int pos) {
		this.pos = pos;
	}
	
	void move() {
		int n = (int)(Math.random()*50+1);
		
		pos = n;
		
	}
	
}

class ScanCode{
	private int distance;

	ScanCode(int distance){
		this.distance = distance;
	}
	
	int getDistance() {
		return distance;
	}

	void setDistance(int distance) {
		this.distance = distance;
	}
	
	void read_code(Goods g) {
		if(g.get_pos()>=31) {
			System.out.println("상품을 조금 가깝게");
		}
		else if(g.get_pos()<=30 && g.get_pos()>=0) {
			System.out.println(g.get_barcode());
		}
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// 1-1
		Practice ex = new Practice();
        
        System.out.println(ex.compute(10,20,'+'));
        System.out.println(ex.compute(50, 30, '-'));
        
        // 1-2
        ex.div3(10);
        
        // 1-3
        ex.del_note("james//why");
        ex.del_note("abc//dc");
        
        //1-4
        ex.del_nonchar("hello@gmail.com");
        ex.del_nonchar("hash-tag");
        
        // 2-1
        Goods milk = new Goods("딸기우유#1000",40);
        System.out.println("상품의 바코드는 "+milk.get_barcode());
        System.out.println("상품의 위치는 "+milk.get_pos());
        
        //2-2
        milk.move();
        
        System.out.println("상품의 위치는 "+milk.get_pos());
        
        //3
        ScanCode gs = new ScanCode(30);
        gs.read_code(milk);
	}

}
