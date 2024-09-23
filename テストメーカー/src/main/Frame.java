package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JFrame;

public class Frame extends JFrame {
	public Frame() {
		super("testMaker");
		this.setSize(500, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//×ボタンを押したときの動き　閉じたらプログラム停止
		this.setLocationRelativeTo(null);//ウィンドウの表示位置
		this.setVisible(true);
	}
	
	private static void exportCsv(String[][] text) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			FileWriter fw = new FileWriter("test3text.csv",false);
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			pw.print("問題の種類");
			pw.print(",");
			pw.print("正答");
			pw.print(",");
			pw.print("表示される回答と説明");
			pw.print(",");
			pw.print("問題文");
			pw.print(",");
			pw.print("選択肢");
			pw.println();
			
			for(int i = 0 ; i < text.length ; i++) {
				for(int j = 0; j < text[i].length ; j++) {
					pw.print(text[i][j]);
					pw.print(",");
				}
				pw.println();
			}
			pw.close();
			System.out.println("owari");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
