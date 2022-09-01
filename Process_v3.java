package Bank7version;

import java.util.Scanner;

public class Process_v3 {

	
	int menu1() {
		
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("=======Bank=====");
		System.out.println("1.추가");
		System.out.println("2.조회");
		System.out.println("3.입금");
		System.out.println("4.출금");
		System.out.println("5.삭제");
		System.out.println("9.종료");
		System.out.print("입력 >>>");
		num = sc.nextInt();
		return num;
	}

	void input(Bank_v3 user1) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		user1.setId(sc.next());  
		System.out.print("비밀번호 입력 : ");
		user1.setPass(sc.next());  
		System.out.print("잔액입력 : ");
		user1.setBalance(sc.nextDouble());
	}

	void show(Bank_v3 user1) {
		String idok ="";  String passok = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");
		idok = sc.next();
		System.out.print("pass : ");
		passok = sc.next();

		if (user1.getId().equals(idok) && user1.getPass().equals(passok)) {

			System.out.println("잔액 : " + user1.getBalance());
		} else if (user1.getId().equals("") && user1.getPass().equals("")) {
			System.out.println("다시 확인해주세요");
		} else {
			System.out.println("다시 확인해주세요");
		}
	}

	void deposit(Bank_v3 user1) {
		String idok ="";  String passok = ""; int passbal = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");
		idok = sc.next();
		System.out.print("pass : ");
		passok = sc.next();

		if (user1.getId().equals(idok) && user1.getPass().equals(passok)) {
			System.out.print("입금 : "); 
			passbal = sc.nextInt();
			user1.setBalance(user1.getBalance()+passbal);  
			System.out.println("==입금완료");
			System.out.println("잔액 : " + user1.getBalance());
		} else {
			System.out.println("다시 확인해주세요");
		}
	}

	void withdraw(Bank_v3 user1) {
		String idok ="";  String passok = "";int passbal = 0;
	 Scanner sc = new Scanner(System.in);
	 System.out.print("id : ");
	 idok = sc.next();
	 System.out.print("pass : ");
	 passok = sc.next();

	 if (user1.getId().equals(idok) && user1.getPass().equals(passok))  {
	 	System.out.print("출금 : ");
	 	passbal = sc.nextInt();
	 	user1.setBalance(user1.getBalance()-passbal);
	 	 System.out.println("==출금완료");
	 	 System.out.println("잔액 : " + user1.getBalance());
	}
	 else
		{System.out.println("다시 확인해주세요");
		}

	}

	void delete(Bank_v3 user1) {
		String idok ="";  String passok = "";
		char delete = ' ';
		Scanner sc = new Scanner(System.in);
	 System.out.print("id : ");
	 idok = sc.next();
	 System.out.print("pass : ");
	 passok = sc.next();

	 if ( user1.getId().equals(idok) && user1.getPass().equals(passok))  {
		 
	 	System.out.println("계좌를 삭제하시겠습니까? (Y/N)");
	 	 delete = sc.next().charAt(0);
	 	 if (delete =='y'||delete =='Y') {
	 		 user1.setId(""); user1.setPass("") ; user1.setBalance(0);
	 		 	 
	 		 
	 	 }
	}
	 else
		{System.out.println("다시 확인해주세요");
		}
	  
	}


	void exit() {System.out.println("종료 기능입니다.");
	}


	public void menu (Bank_v3 user1) {
		int num = 0 ;
		do {
			num = menu1();
			switch (num) {
			case 1:
				input( user1);
				break;
			case 2:
				show(user1);
				break;
			case 3:
				deposit(user1);
				break;
			case 4:
				withdraw(user1);
				break;
			case 5:
				delete(user1);
				break;
			case 9:exit();
				
				break;// 리턴값 void/ 메서드명 delete/파라미터x

			}
		} while (num != 9);
		
		
	}


	
}
