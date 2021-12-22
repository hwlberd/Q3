
public class Q3 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1;i<100;i++) {
			if(i%5==0 || i%7==0) {
				System.out.println(i);
				sum=sum+i;
			}
			
		}
		System.out.println("Sum of numbers:"+sum);
	}
}
