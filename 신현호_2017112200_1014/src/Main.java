//-------------------
//|   ����           |
//-------------------
//|   �̸�           |
//|   ����           |
//|   â�� ����(�� ����)|
//|   �� ��          |
//|------------------ 
//|   â�� �� ����     |
//|   �ǹ� �̸� ���    |
//-------------------

class Building{
	String name;
	double height;
	int window;
	int story;
	
	void number_window() {
		System.out.println("â�� ����: "+ window*story);
	}
	void print_name() {
		System.out.println("�ǹ� �̸�: "+ name);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Building company = new Building();
        
        company.name = "Java Company";
        company.height = 100.15;
        company.window = 20;
        company.story = 30;
        
        company.number_window();
        company.print_name();
	}

}
