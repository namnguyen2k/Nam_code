public class MyDate {
	private int day;
	private int month;
	private int year;
	MyDate(int d, int m, int y){
		this.day=d;
		this.month=m;
		this.year=y;
	}
	public void printDay() {
		System.out.println(this.day);
	}
	public int getMonth() {
		return this.month;
	}
	public boolean Ngaylonhon(int k) {
		return this.day>k;
	}
	
}
