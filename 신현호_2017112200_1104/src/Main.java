class Car{
	private int a;
	
	void set_gas(int k) {
		a = k;
		
	}
	
	void show() {
		System.out.println("현재 주유량: "+ a+"l");
	}
	
	void fil_gas(int m, GasStation gs) {
		a = a+m;
		
		gs.after(m);
	}
	
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("자동차와 주유소");
        Car SM5 = new Car();
        GasStation GS = new GasStation();
        
        SM5.set_gas(10);
        GS.set_gas(500);
        SM5.show();
        GS.show();
        SM5.fil_gas(50, GS);
        SM5.show();
        GS.show();
        
        SM5.fil_gas(460, GS);
        
	}

}
