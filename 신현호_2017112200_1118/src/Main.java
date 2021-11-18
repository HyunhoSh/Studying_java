
class Animal{
	private String type;
	

	Animal(String type){
		this.type = type;
	}
	
	String getType() {
		return type;
	}

	void setType(String type) {
		this.type = type;
	}

	String get_feed() {
		return type;
	}
}

class Fish extends Animal{
	private int depth;
	
	Fish(String type, int depth){
		super( type );
		this.depth = depth;
	}
	
	void show() {
		System.out.println("���� ��: "+  getType() +", ���� ����: "+depth+"m");
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal Tiger = new Animal("�䳢");
	    System.out.println("���� ��: "+Tiger.get_feed());
        
	    Fish Shark = new Fish("��ġ",30);
	    Shark.show();
	    
	}
    
}
