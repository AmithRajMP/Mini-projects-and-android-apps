import java.util.Scanner;
public class add {
	public static void main(String args[]){
		Scanner veyron = new Scanner(System.in);
		double fnum,snum,ans;
		System.out.println("Input First Number: ");
		fnum = veyron.nextDouble();
		System.out.println("Input Second Number: ");		
		snum = veyron.nextDouble();
		ans=fnum+snum;
		System.out.println(ans);
	}
	
}
