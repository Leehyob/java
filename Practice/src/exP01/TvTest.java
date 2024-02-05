package exP01;

public class TvTest {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];
		
		for (int i=0; i<tvArr.length; i++) {
			tvArr[i]= new Tv();
			tvArr[i].channel = i+10;
		}
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}
	}

}
//printf 변환 지시자
// %d - 정수형, %s - 문자형
// %n - 줄바꿈, %b - 불리언,...