package ex02;

public class Interface_1 implements Interface {

	@Override
	public String a() {
		
		return "A";
	}

	@Override
	public String b() {
		
		return "B";
	}

	@Override
	public int c() {
		
		return 3;
	}

	@Override
	public void d() {
		System.out.println("hi");
	}
	
	public void random() {
		int[] lotto = new int[6];
		boolean flag;
		
		for(int j=0; j<5; j++) {
			for(int i=0; i<lotto.length; i++) {
				flag = false;
				int random = (int)((Math.random()*45)+1);
				
				for(int k=0; k<i; k++) {
					if(random == lotto[k]) {
						flag = true;
						break;
					}
				}
				if(flag) {
					i--;
					continue;
				}
				
				lotto[i]=random;
				
			}
		
			 for(int i=0; i<lotto.length; i++)	
				System.out.print(lotto[i]+" ");
				
			 System.out.println("\n------------------");
		}
	}
	
	public void random2() {
		int[] random = new int[45];
		
		for(int i=0; i<random.length; i++) {
			random[i] = i+1;
		}
		for(int i=0; i<500; i++) {
			int ran = (int)((Math.random()*44)+1);
			int tmp =0;
			tmp = random[0];
			random[0]=random[ran];
			random[ran]=tmp;
			
		}
		for(int k=0; k<5; k++) {
			for(int j=k+1; j<6; j++) {
				if(random[k]>random[j]) {
					int emp = random[k];
					random[k]=random[j];
					random[j]=emp;
				}
			}
		}
			
		for(int i=0; i<6; i++) {
			System.out.print(random[i]+" ");
		}
//				for(int a=0; a<5; a++) {
//					for(int b=a+1; b<6; b++) {
//						if(random[a]>random[b]) {
//							int emp;
//							emp = random[a];
//							random[a]=random[b];
//							random[b]=emp;
//						}
//					}
//				}
			
//			for(int i=0; i<6; i++)
//			System.out.print(random[i] + " ");
//	
	}	

}