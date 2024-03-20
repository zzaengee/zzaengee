
import java.util.*;
class SungJuk1 {
	private String name;
	private int kor;
	private int eng;
	private int tot;
	private int rank;
	
	//setter메소드
	/*
	 * public void setName(String name) { this.name = name; }
	 */
	public void setKor(int kor) {
		this.kor = kor;
		setTot();
	}
	public void setEng(int eng) {
		this.eng = eng;
		setTot();
	}
	public void setTot() {
		this.tot = kor + eng;
	}
	//getter메소드
	public String getName() {	return name;}
	public int getKor() {		return kor;	}
	public int getEng() {		return eng;	}
	public int getTot() {		return tot;	}
	public int getRank() {		return rank;}	
	
	public SungJuk1(String name, int kor, int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		tot = kor + eng;
		rank = 1;
	}
	
	public void clearRank() {
		rank = 1;
	}
	public void plusRank() {
		rank++;
	}	
	public void disp() {
		System.out.println(name+"님의 총점은 " + tot+"점이고, 순위는 " + rank +"등 입니다.");
	}
}
public class Exam07_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//SungJuk sj1, sj2, sj3, sj4, sj5;
		if (args.length != 1) {
			System.out.println("인원수를 먼저 입력해야만 합니다.");
			System.exit(0);
		}
		int inwon = Integer.parseInt(args[0]);//String값을 int형으로 형변환하는 명령어
		
		SungJuk1[] sj = new SungJuk1[inwon];//5의 객체가 선언
		for(int i=0; i<inwon; ++i) {
			System.out.print("이름을 입력 : ");
			String name = in.next();
			int kor = inputSu("국어");
			int eng = inputSu("영어");
			sj[i] = new SungJuk1(name, kor, eng);	//각각의 객체를 생성
		}
		
		for(int i=0; i<inwon; ++i) {
			for(int j=0; j<inwon; ++j) {
				if (sj[i].getTot() < sj[j].getTot()) {
					sj[i].plusRank();
				}
			}
		}
		
		for(int i=0; i<inwon; ++i) {
			sj[i].disp();
		}
	}
	
	public static int inputSu(String str) {
		Scanner in = new Scanner(System.in);
		System.out.print(str+"점수를 입력 : ");
		int su = in.nextInt();
		if (su<0 || su>100) {
			System.out.println(str+"점수는 0~100점만 입력하셔야 합니다.");
			return inputSu(str);	//재귀호출
		}else {
			return su;
		}
	}
}

























