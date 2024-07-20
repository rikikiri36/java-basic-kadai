package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	HashMap<String,String> fruitDictionary = new HashMap<String,String>();

	//	コンストラクタ
	public Dictionary_Chapter20() {
		//	辞書登録
		fruitDictionary.put("apple", "りんご");
		fruitDictionary.put("peach", "桃");
		fruitDictionary.put("banana", "バナナ");
		fruitDictionary.put("lemon", "レモン");
		fruitDictionary.put("pear", "梨");
		fruitDictionary.put("kiwi", "キウィ");
		fruitDictionary.put("strawberry", "いちご");
		fruitDictionary.put("grape", "ぶどう");
		fruitDictionary.put("muscat", "マスカット");
		fruitDictionary.put("cherry", "さくらんぼ");
	}
	
	public void searchDictionary(String word) {
		
//for(int i = 0; i < fruitDictionary.size(); i++) {
//System.out.println(word + i);

		if(fruitDictionary.get(word) != null) {
				System.out.println(word + "の意味は" + fruitDictionary.get(word));
//				break;
			} else {
				System.out.println(word + "は辞書に存在しません");	
//				break;
		}
//	}
	}
}
