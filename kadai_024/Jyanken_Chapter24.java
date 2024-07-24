package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {

//	定数宣言
	 final String ROCK = "r";
	 final String SCISSORS = "s";
	 final String PAPER = "p";
	 final String ROCK_JP = "グー";
	 final String SCISSORS_JP = "チョキ";
	 final String PAPER_JP = "パー";

	 //	自分のじゃんけんの手を入力
	public String getMychoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockの r を入力しましょう");
		System.out.println("チョキはscissorsの s を入力しましょう");
		System.out.println("パーはpaperの p を入力しましょう");

		Scanner inputMyhand = new Scanner(System.in);
		String input = "";

		while(true) {

			input = inputMyhand.next();

//			入力チェック：r s p 以外はエラー
			if(!input.equals(ROCK) && !input.equals(SCISSORS) && !input.equals(PAPER)) {
				System.out.println("「" + input + "」は入力できません");
				System.out.println("「r」か「s」か「p」を入力してください");
			}else {
				break;
			}
		}
		inputMyhand.close();
		return input;
	}

//	対戦相手のじゃんけんの手を乱数で取得
	public String getRandom() {

//		配列にグー/チョキ/パーを格納
		String[] randomhandArry = new String[3];
		randomhandArry[0] = ROCK;
		randomhandArry[1] = SCISSORS;
		randomhandArry[2] = PAPER;

//		ランダム値を生成：0〜2
		int random = (int)Math.floor(Math.random() * 3) ;

//		対戦相手の手を渡す
		return randomhandArry[random];
	}

//	じゃんけん実行
	public void playGame(String myHand, String otherHand) {

		HashMap<String, String> jankenMap = new HashMap<String, String>();

		jankenMap.put(ROCK, ROCK_JP);
		jankenMap.put(SCISSORS, SCISSORS_JP);
		jankenMap.put(PAPER, PAPER_JP);

		System.out.println("自分の手は" + jankenMap.get(myHand) + "、対戦相手の手は" + jankenMap.get(otherHand));
//		System.out.println("自分の手は" + myHand + "、対戦相手の手は" + otherHand);

//		判定
		//あいこ
		if(myHand.equals(otherHand)) {
			System.out.println("あいこです");
		}
		//自分の勝ち
		else if((myHand.equals(ROCK) && otherHand.equals(SCISSORS)) ||
				(myHand.equals(SCISSORS) && otherHand.equals(PAPER)) ||
				(myHand.equals(PAPER) && otherHand.equals(ROCK))) {
			System.out.println("自分の勝ちです");
		}
		//自分の負け
		else if((myHand.equals(ROCK) && otherHand.equals(PAPER)) ||
				(myHand.equals(SCISSORS) && otherHand.equals(ROCK)) ||
				(myHand.equals(PAPER) && otherHand.equals(SCISSORS))) {
			System.out.println("自分の負けです");
		}
	}
}
