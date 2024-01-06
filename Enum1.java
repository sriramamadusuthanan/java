package java_from_0;

enum Laptop1 {
	
	Maxboook(2200),Acer(2000),HP(1500),HCL(1000);
	private int prize;
	
	Laptop1(int prize) {
		
		this.prize=prize;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}
	
}

public class Enum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop1 lap = Laptop1.HP;
		System.out.println(lap + ": "+lap.getPrize());
		
	}

}
