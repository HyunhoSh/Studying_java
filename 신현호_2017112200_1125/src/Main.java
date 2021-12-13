import java.util.ArrayList;

class Quiz{
	int speed_limit() {
		int n = (int)(Math.random()*4);
		switch(n) {
		case 0:
			return 60;
		case 1:
			return 70;
		case 2:
			return 80;
		case 3:
			return 100;
		}
		return 0;
	}
	
	int count(String str, String hunt) {
		int cnt = 0;
		int cut = hunt.length();
		
		for(int i=0;i<(str.length()-cut+1);i++) {
			if(str.substring(i,i+cut).equals(hunt)) {
				cnt++;
			}
		}
		return cnt;
	}
	
	
	
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Quiz quiz = new Quiz();
        
        System.out.println("제한속도= " + quiz.speed_limit() + "km");
        
        String source = "The old man and the sea";
        System.out.println(quiz.count(source,"he"));
	}
    
}
