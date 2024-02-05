package java02;

public class Example6_4 {

	public static void main(String[] args) {
		Example6_1[] tvArr = new Example6_1[5];
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Example6_1();
			tvArr[i].channel = i+10;
		}
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel = %d%n",i,tvArr[i].channel);
		}
		
	}

}
