package ex;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex02_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		float sum = 0;
		float win = 0;
		if (m>=701){
			sum=sum+(m-700)*5.63f;
			win=win+(m-700)*4.50f;
			m=700;
			}
		if (m>=501&&m<=700){
			sum=sum+(m-500)*4.97f;
			win=win+(m-500)*4.01f;
			m=500;
			}
		if (m>=331&&m<=500){
			sum=sum+(m-330)*4.39f;
			win=win+(m-330)*3.61f;
			m=330;
			}
		if (m>=121&&m<=330){
			sum=sum+(m-120)*3.02f;
			win=win+(m-120)*2.68f;
			m=120;
			}
		if(m<=120){
			sum=sum+m*2.10f;
			win=win+m*2.10f;
			}
		System.out.println(sum);
		System.out.println(win);
	}
}
