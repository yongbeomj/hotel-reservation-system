package Reference;

public class Skyscanner {
	   
	   public static 예매[] 예매리스트 = new 예매[100]; 
	   
	   public static void main(String[] args) {
	      // 1. 인터페이스 생성
	      예매 예매;
	      // 2. 인터페이스 클래스 연결
	      예매 = new 항공권();
	      // 3. 인터페이스로 부터 클래스 조작
	      예매.예매등록();
	      예매.예매취소();
	      예매.입금();
	      예매.예매조회();
	      예매.자리조회();
	      // 4. 인터페이스내 클래스 변경
	      예매 = new 숙박권();
	      예매.예매등록();
	      
	      // 5. 동일한 슈퍼클래스로부터 서로 다른 서브클래스를 배열로 사용
	      예매회사 티켓1 = new 예매회사();   
	      예매리스트[0] = 티켓1;
	      
	      항공권 티켓2 = new 항공권();
	      예매리스트[1] = 티켓2;
	      
	      숙박권 티켓3 = new 숙박권();
	      예매리스트[2] = 티켓3;
	   }
	}
	

