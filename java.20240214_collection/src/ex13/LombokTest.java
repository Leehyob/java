package ex13;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor //모든 변수 생성자
@NoArgsConstructor	//디폴트 생성자
@Data	//setter,getter, toString, equals, hashCode
@Setter	
@Getter
public class LombokTest {
	
	int a;
	int b;
	int c;
	int d;
	
	
	public static void main(String[] args) {
		
	}

}

@Setter
@Getter
@AllArgsConstructor
class A{
	String a;
	String b;
	int c;
	int d;
	
}



