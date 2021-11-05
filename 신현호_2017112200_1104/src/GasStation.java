
class GasStation {
    private int j;
	
	void set_gas(int k) {
		j = k;
	}
	
	void show() {
		System.out.println("현재 재고량: "+j+"l" );
	}
	
	
	void after(int a) {
		
		if(j-a<0) {
			System.out.println("주유실패");
		}
		else {
			j = j-a;
		}
	}
	
}
