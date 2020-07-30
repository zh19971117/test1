package myself01;

public class day02demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num = 200;;num++){
		boolean flag =true ;
		for(int i = 2;i<num;i++){
			if(num%i==0){
				flag =false;
				/*System.out.println("不是质数");*/
				break;
          }
		}
		
		if(flag){
			System.out.println(num);
		break;
		}
		}
	}

}
