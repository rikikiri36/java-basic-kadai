package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		final int CHECK_NUMBER = 101;
		boolean[] primenuberArray = new boolean[CHECK_NUMBER];
		int targetNumber;
//		System.out.println(primenuberArray[0]);
//		System.out.println(primenuberArray[99]);
		
//		初期化
		for(int i = 0; i < primenuberArray.length-1; i++ ) {
			primenuberArray[i] = true;
		}
		
//		100回繰り返す
		for(int checkNumber = 0; checkNumber < primenuberArray.length; checkNumber++ ) {

//			配列のindexは0始まりだが、実際にチェックしたい数字は1始まりなのでプラス１をする
			targetNumber = checkNumber + 1;
//			チェックする数字を1〜自分自身の値マイナス１まで、割り切れるかをチェックする
			for(int i = 1; i < targetNumber; i++) {
//				１は必ず割り切れるので読み飛ばす
				if(i == 1) {
					continue;
				}

				if(targetNumber % i == 0) {
					//素数ではないのでfalseにして次の数字に進む
					primenuberArray[checkNumber] = false;
					break;
				}
			}
		}

//		出力
//		1は出力不要なので、i=1から始める
		for(int i = 1; i < primenuberArray.length; i++ ) {
			if(primenuberArray[i]) {
				System.out.println(i+1);
			}
		}
	}
}
