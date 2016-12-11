package hw;
/*
 *  有一種坊間常見的遊戲稱為 "18 啦 "~ 玩法介紹 : 由四個骰子來擲，只要其中任兩 個是相同點，才開始計算點數，點數即為另兩個點數相加，若另兩個也一樣，則取較 大的一組相加，另外有下列幾種特殊情況:
1.擲出 4 顆骰子點數均相同，稱為通殺 !
2.任三顆點數相同或四顆點數均不相同，即為無意義 ! 請寫一程式，各別輸入四顆骰子點數，判斷結果 !
 * Date: 2016/12/05
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw02_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int [] la=new int[4];
		int a=la[0]=scn.nextInt();
		int b=la[1]=scn.nextInt();
		int c=la[2]=scn.nextInt();
		int d=la[3]=scn.nextInt();
		int count = 0;
		int [] all = new int[6] ;
		if(a==b&&b==c&&c==d&&d==a){					//4同
			System.out.println("通殺");
		}else{
			for(int i = 0 ; i <4 ; i++){
				for(int j =0 ; j<4 ; j++){
					if(i!=j){
						if(la[i]==la[j]){
							all[count]=la[i];
							count++;
						}
					}
				}
			}
			if(count==2){
				System.out.println(a+b+c+d-(all[1]*2));
			}else if(count==4){
					for(int j =0 ; j<4 ; j++){
						if(la[j]>la[0]){
							System.out.println(a+b+c+d-(la[0]*2));
							break;
						}else if(la[j]<la[0]){
							System.out.println(a+b+c+d-(la[j]*2));
							break;
						}
					}
			}else if(count==6||count==0){
				System.out.println("R");
			}
		}
	}

}
