import java.util.Scanner;

public class Ex401 {

	public static void main(String[] args) {
		System.out.println("당신의 나이를 입력하세요: ");
		
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		
		if(age >= 19) {
			System.out.println("당신의 나이는 19세 이상입니다.");
			System.out.println("당신은 투표할 자격이 있습니다.");
		}

		System.out.println("이 문장은 if문 외부의 있습니다.");
	}

}
