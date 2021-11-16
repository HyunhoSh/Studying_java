
public class King {
    private String name;
    private int sequence;
    
    King(){}
    King(String name, int sequence){
    	this.name = name;
    	this.sequence = sequence;
    }
	String getName() {
		return name;
	}
	int getSequence() {
		return sequence;
	}
	void setName(String name) {
		this.name = name;
	}
	void setSequence(int sequence) {
		this.sequence = sequence;
	}
	
	void show() {
		System.out.println("Á¶¼±"+sequence+"´ë¿Õ"+" "+name);
	}
    
    
}
