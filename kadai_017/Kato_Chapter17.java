package kadai_017;

public abstract class Kato_Chapter17 {
	public String familyName = "";
	public String givenName = "";
	public String address = "";

	//	共通の紹介を出力
	public void commonIntroduce() {

		this.familyName = "加藤";
		this.address = "東京都中野区〇×";

		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}

//	個別の紹介を出力
	public abstract void eachIntroduce();

//	紹介を実行
	public void execIntroduce() {

		this.commonIntroduce();
		this.eachIntroduce();
		System.out.println("");			//空白行をセット

	}
}
