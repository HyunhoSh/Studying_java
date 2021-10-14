//-------------------
//|   빌딩           |
//-------------------
//|   이름           |
//|   높이           |
//|   창문 개수(한 층당)|
//|   층 수          |
//|------------------ 
//|   창문 총 개수     |
//|   건물 이름 출력    |
//-------------------

class Building{
	String name;
	double height;
	int window;
	int story;
	
	void number_window() {
		System.out.println("창문 개수: "+ window*story);
	}
	void print_name() {
		System.out.println("건물 이름: "+ name);
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
