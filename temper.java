public class temper{
	public static void main(String[] arg){
		int [] x= new int[] {10, 20, 25, 30, 40, 45, 35, 15, 45, 50};
		int max=x[0];
		for (int i:x){
			if (max<i){
				max=i;
			}
			
		}
		System.out.println("Maximum:" +max);
	}

}
		