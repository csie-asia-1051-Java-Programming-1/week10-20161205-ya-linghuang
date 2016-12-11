package hw;
/*
 * Topic:某間學校舉辦英文檢定測驗，若是學生通過該測驗，則能通過畢業門檻。老師準備的 英文測驗中分為三個項目當作考試，分別是聽力、閱讀、口說。每一個項目測驗滿分 皆為 100 分，總分為 300 分。想要通過測驗有兩種方式。方式一:若是三個項目分 數皆為 60 分以上 ( 包含 60 分 ) 即為通過測驗。方式二:若三個項目中有其中一 個項目分數未滿 60 分，但三個項目分數總合超過 220 分，也可算通過測驗。若三 個項目中有其中一個項目分數未滿 60 分，而三個項目分數總合也沒能超過 220 分，可獲得補考機會。若是三個項目中有兩個項目不及格，但另一個項目成績高於 80 分 ( 包含 80 分 ) ，也可獲得補考的機會。其餘皆判定為無法通過測驗。
說明: 第一行為一個整數 N ，代表共有 N 組測試資料。之後有 N 行，每一行有 3 個非 負整數 ( 範圍皆為 0 到 100), 分別代表該名學生聽力、閱讀、口說的測驗分數。
若是通過測驗，則輸出 ”P” 。若是需要補考，則輸出 ”M” 。若是無法通過測驗， 則輸出 ”F”  
 * Date: 2016/12/05
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw01_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		char []ans =new char[num] ;
		for(int i = 0; i< num ; i++){
			int a = scn.nextInt();
			int b = scn.nextInt();
			int c = scn.nextInt();
			int all = a+b+c;
			if(a>=60&&b>=60&&c>=60){
				ans[i] ='P';
			}else if((a<60&&b>=60&&c>=60)||(b<60&&a>=60&&c>=60)||(c<60&&b>=60&&a>=60)){
				if(all>=220){
					ans[i] ='P';
				}else if(all<200){
					ans[i] ='M';
				}
			}else if((a>=80&&b<60&&c<60)||(b>=80&&a<60&&c<60)||(c>=80&&b<60&&a<60)){
				ans[i] ='M';
			}else{
				ans[i] ='F';
			}
		}
		for(int i =0; i<num ; i++){
			System.out.println(ans[i]);
		}
	}

}
