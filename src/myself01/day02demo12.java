package myself01;

public class day02demo12 {
public static void main(String[] args) {
		
		
	
	int a=60;
	for(int i=2;i<=a;){
		if(a%i!=0){
			i++;
		}
		else{	
			
			System.out.print(i+"*");
			if(a==i){
				System.out.print(1);
				break;
			}
			a=a/i;
		}
		
	}
	}
}
