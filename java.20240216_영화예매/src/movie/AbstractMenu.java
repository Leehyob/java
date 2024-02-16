package movie;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
public abstract class AbstractMenu implements Menu{ //추상클래스
	
	protected String menuText;
	protected Menu prevMenu;
	
	protected static final Scanner sc = new Scanner(System.in);
//	
//	AbstractMenu(String menuText, Menu prevMenu){
//		this.menuText = menuText;
//		this.prevMenu = prevMenu;
//		
//	}
////	
//	public void setPrevMenu(Menu prevMenu) {
//		this.prevMenu = prevMenu;
//	}
//	
	@Override
	public void print() {
		System.out.println("\n" + menuText);
	}

//	@Override
//	public Menu next() {
//		
//		return null;
//	}

}
