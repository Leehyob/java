package ex03;

// 한 클래스 내에 클래스를 추가함으로써 직관적으로 로직 파악 가능
class Network{
	
	public void Message(String content) {
		/*
		 * SendMessage msg = new SendMessage(content); System.out.println(msg.getMsg());
		 */
		//一樣的。
		Network.SendMessage msg = new Network.SendMessage(content);
		System.out.println(msg.getMsg());
	}
	
	// 특정 클래스 안에서만 사용되기 때문에 중첩 클래스 사용으로 효용을 높임
	private static class SendMessage{
		private String msg;
		
		public SendMessage(String msg) {
			this.msg = msg;
		}
		
		public String getMsg() {
			return msg;
		}
	}
}

public class staticNested2 {
	public static void main(String[] args) {
		
		Network net = new Network();
		net.Message("전송할 메시지입니다.");
		
	}
}

//정적 중첩 클래스
/*내부 클래스
 * 1. 내부 클래스(멤버 클래스)
 * 2.지역 클래스
 * 3.익명 클래스 -> 람다
 * */
