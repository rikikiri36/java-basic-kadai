package kadai_020;

public class DictionaryExec_Chapter20 {
	public static void main(String[] args) {
	
		Dictionary_Chapter20 dictionary = new Dictionary_Chapter20();

//		調べる英単語を配列にセット
		String[] wordArray = new String[4];

		wordArray[0] = "apple";
		wordArray[1] = "banana";
		wordArray[2] = "grape";
		wordArray[3] = "orange";
	
//		辞書を調べる
		for(int i = 0; i < wordArray.length; i++ ) {
			dictionary.searchDictionary(wordArray[i]);
		}
	}

}
