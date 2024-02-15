package ex11;

import java.time.LocalDate;

public class Review implements Comparable<Review>{
	
	int reviewCount;
	LocalDate date;
	
	public Review(int reviewCount, LocalDate date) {
		this.reviewCount = reviewCount;
		this.date = date;
	}
	
	
	
	@Override
	public String toString() {
		return "Review [reviewCount=" + reviewCount + ", date=" + date + "]";
	}



	@Override
	public int compareTo(Review o) {
		int x = this.reviewCount;
		int y = o.reviewCount;
//		int result =0;
//		if(x>y) 
//			result =  1;
//		else if (x<y)
//			result = -1;
//		else
//			result =0;
//		//return Integer.compare(x,y);		//x,y를 자동비교해줌
		return (x>y) ? -1 : (x<y) ? 1 : 0;	//↑ 둘 다 똑같이 출력됨
	}
	
	
	
}
