import java.util.Random;

public class MyLuckyNumber {
	
	public int myNumber;
	public Integer[] myLuckyNumber;
	
	public MyLuckyNumber() {
		myLuckyNumber = new Integer[6];
	}

	public static void main(String[] args) {
		MyLuckyNumber myLuckyNumber = new MyLuckyNumber();
		
		Random random = new Random();
		
		for(int i = 0; i < 6; i++) {
			myLuckyNumber.myLuckyNumber[i] = random.nextInt(45) +1;
		}
		
		myLuckyNumber.myNumber = random.nextInt(45) + 1;
		
		System.out.print("행운의 숫자: ");
		for(int num : myLuckyNumber.myLuckyNumber) {
			System.out.print(num + " ");
		}
		
		
		
	}

}
