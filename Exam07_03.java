import java.io.*;
import java.util.*;
class RoomMg{
	boolean[] room;
	int roomSu;
	Scanner in;
		
	RoomMg(){
		in = new Scanner(System.in);
		System.out.print("방의 수를 입력 : ");
		roomSu = in.nextInt();
		room = new boolean[roomSu];
	}
	
	//입실할때 사용하는 기능
	void input() {
		int roomNum;
		do {
			System.out.print("입실하실 방의 번호 : ");
			roomNum = in.nextInt();
		}while(roomNum<1 || roomNum>roomSu);
		if (room[roomNum-1]) {
			System.out.println(roomNum+"호실은 사용중");
		}else {
			room[roomNum-1] = true;
			System.out.println(roomNum+"호실에 입실");
		}
	}
	//퇴실할때 사용하는 기능
	void output() {
		int roomNum;
		do {
			System.out.print("퇴실하실 방의 번호 : ");
			roomNum = in.nextInt();
		}while(roomNum<1 || roomNum>roomSu);
		if (!room[roomNum-1]) {
			System.out.println(roomNum+"호실은 빈방");
		}else {
			room[roomNum-1] = false;
			System.out.println(roomNum+"호실에서 퇴실");
		}
	}
	//보기할때 사용하는 기능
	void view() {
		for(int i=0; i<roomSu; ++i) {
			if (room[i]) {
				System.out.printf("%d호실은 사용중\n", i+1);
			}else {
				System.out.printf("%d호실은 빈방\n", i+1);
			}
		}
	}
	//종료할때 사용하는 기능
	void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);	//프로그램을 종료시키는 명령어
	}
}
public class Exam07_03 {
	public static void main(String[] args) throws IOException {
		RoomMg room = new RoomMg();
		while(true) {
			System.out.print("1.입실 2.퇴실 3.보기 4.종료 : ");
			int select = System.in.read() - 48;
			System.in.skip(5);
			switch(select) {
			case 1 :	room.input(); break;
			case 2 :	room.output(); break;
			case 3 :	room.view(); break;
			case 4 :	room.exit(); break;
			default :	System.out.println("잘못누르셨습니다. 다시 입력해 주세요!!");
			}
		}
	}
}




