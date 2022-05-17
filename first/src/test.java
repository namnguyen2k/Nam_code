import java.util.Scanner;

public class test {
	public static void main(String[] args){
		/*Scanner nhap= new Scanner(System.in);
		float a=21;
		int a=nhap.nextInt();
		int b=nhap.nextInt();
		int b=a;
		System.out.println(a + " " + b);
		double x= new Double(2.1);
		System.out.println(a +","+ b);
		*String kq=(x%2==0)?"true":"false";
		System.out.println(kq);
		int n;
		double mang[];
		mang = new double[] {1,2,3,4,5};
		double[] mang2=new double[10];
		
		for (int i=0;i <mang.length; i++)
			System.out.println(mang[i]+" ");
		do {
			System.out.println("Nhap n: ");
			n=nhap.nextInt();
		} while (n<0);*/
		MyDate date;
		date=new MyDate(12,12,13);
		date.printDay();
		System.out.println(date.Ngaylonhon(3));
	}
}
