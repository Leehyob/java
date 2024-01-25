
public class ques11 {

	public static void main(String[] args) {
		int[] coinUnit = {500, 100, 50, 10};
		int money =2680;
		System.out.println("money : " + money);
			
		
		int mon1 = money/coinUnit[0];
		int mon2 = money%coinUnit[0];
		int mon3 = mon2/coinUnit[1];
		int mon4 = mon2%coinUnit[1];
		int mon5 = mon4/coinUnit[2];
		int mon6 = mon4%coinUnit[2];
		int mon7 = mon6/coinUnit[3];

		System.out.println("500원 : " + mon1);
		System.out.println("100원 : " + mon3);
		System.out.println("50원 : " + mon5);
		System.out.println("10원 : " + mon7);
			
		for (int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원" + money/coinUnit[i]);
			money = money%coinUnit[i];
			
		}

	}

}
