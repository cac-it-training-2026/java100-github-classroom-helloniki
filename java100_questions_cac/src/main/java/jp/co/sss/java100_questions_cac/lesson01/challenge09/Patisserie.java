/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		double num_siro = 30;
		double num_choco = 30;
		double num_pisu = 30;

		System.out.println("本日のおすすめ商品です。");
		System.out.println("");
		System.out.println("シトロン　　　\\250・・・残り" + (int) num_siro + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + (int) num_choco + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + (int) num_pisu + "個");

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）");
		System.out.println("");
		BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン　　　＞");
		String str1 = reader1.readLine();
		double siro = Double.parseDouble(str1);

		System.out.print("ショコラ　　　＞");
		String str2 = reader1.readLine();
		double choco = Double.parseDouble(str2);

		System.out.print("ピスターシュ　＞");
		String str3 = reader1.readLine();
		double pisu = Double.parseDouble(str3);

		System.out.println();
		System.out.println("シトロン　　" + siro + "個");
		System.out.println("ショコラ　　" + choco + "個");
		System.out.println("ピスターシュ" + pisu + "個");
		System.out.println();

		double cost_total = (siro * 250 + choco * 280 + pisu * 320);

		System.out.println("合計個数　　" + (siro + choco + pisu) + "個です");
		System.out.println("合計金額　" + (int) cost_total + "円です");

		System.out.println("");
		System.out.println("を買いあげですね。");
		System.out.println("承りました。");

		num_siro -= siro;
		num_choco -= choco;
		num_pisu -= pisu;

		System.out.println("");
		System.out.println("本日のおすすめ商品です。");
		System.out.println("");
		System.out.println("シトロン　　　\\250・・・残り" + (int) num_siro + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + (int) num_choco + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + (int) num_pisu + "個");

		System.out.println("");
		System.out.println("閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");
		System.out.println("");

		System.out.println("売上の割合");
		System.out.println(" 売上合計 \\" + (int) cost_total);

		System.out.println("");
		System.out.println("内訳");

		double total_cost = 250 * siro + 280 * choco + 320 * pisu;
		double total = siro + choco + pisu;

		System.out.println("シトロン　　\\" + (int) (siro * 250) + "・・・" + (int) (siro * 250 / total_cost * 100) + "%");
		System.out.println("ショコラ　　\\" + (int) (choco * 280) + "・・・" + (int) (choco * 280 / total_cost * 100) + "%");
		System.out.println("ピスターシュ\\" + (int) (pisu * 320) + "・・・" + (int) (pisu * 320 / total_cost * 100) + "%");

		System.out.println("");
		System.out.println("明日の三色マカロンの配合率が決まりました！");

		System.out.println("");
		System.out.println("シトロン　　 " + "・・・" + (int) (siro / total * 100) + "%");
		System.out.println("ショコラ　　 " + "・・・" + (int) (choco / total * 100) + "%");
		System.out.println("ピスターシュ " + "・・・" + (int) (pisu / total * 100) + "%");

		System.out.println("");
		System.out.println("が楽しめます！");

		double aver = cost_total / total;
		aver /= 10;

		System.out.println("");
		System.out.println("値段は\\" + (int) aver * 10 + "です");

	}

}
