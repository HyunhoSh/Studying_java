
class GasStation {
    private int j;
	
	void set_gas(int k) {
		j = k;
	}
	
	void show() {
		System.out.println("���� ���: "+j+"l" );
	}
	
	
	void after(int a) {
		
		if(j-a<0) {
			System.out.println("��������");
		}
		else {
			j = j-a;
		}
	}
	
}
