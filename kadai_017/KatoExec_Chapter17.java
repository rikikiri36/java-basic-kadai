package kadai_017;

public class KatoExec_Chapter17 {
	public static void main(String[] args) {
		
		KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
		KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
		KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();

//		givenNameフィールドに値をセット
		taro.setGivenName();
		ichiro.setGivenName();
		hanako.setGivenName();

//		出力
		taro.execIntroduce();
		ichiro.execIntroduce();
		hanako.execIntroduce();
	}
}
