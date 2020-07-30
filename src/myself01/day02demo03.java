package myself01;

public class day02demo03 {
	public static void main(String[] args){
	int m = 8;
	int n = 12;
	int result =1;
	for(int i=1;i<m;i++){
		if(m%i==0 && n%i==0){
			result = i;
		}
		
	}
	System.out.println(result);
	}
}
