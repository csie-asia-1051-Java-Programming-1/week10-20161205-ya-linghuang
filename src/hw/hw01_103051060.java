package hw;
/*
 * Topic:�Y���Ǯ��|��^���˩w����A�Y�O�ǥͳq�L�Ӵ���A�h��q�L���~���e�C�Ѯv�ǳƪ� �^����礤�����T�Ӷ��ط�@�ҸաA���O�Oť�O�B�\Ū�B�f���C�C�@�Ӷ��ش��纡�� �Ҭ� 100 ���A�`���� 300 ���C�Q�n�q�L���禳��ؤ覡�C�覡�@:�Y�O�T�Ӷ��ؤ� �ƬҬ� 60 ���H�W ( �]�t 60 �� ) �Y���q�L����C�覡�G:�Y�T�Ӷ��ؤ����䤤�@ �Ӷ��ؤ��ƥ��� 60 ���A���T�Ӷ��ؤ����`�X�W�L 220 ���A�]�i��q�L����C�Y�T �Ӷ��ؤ����䤤�@�Ӷ��ؤ��ƥ��� 60 ���A�ӤT�Ӷ��ؤ����`�X�]�S��W�L 220 ���A�i��o�ɦҾ��|�C�Y�O�T�Ӷ��ؤ�����Ӷ��ؤ��ή�A���t�@�Ӷ��ئ��Z���� 80 �� ( �]�t 80 �� ) �A�]�i��o�ɦҪ����|�C��l�ҧP�w���L�k�q�L����C
����: �Ĥ@�欰�@�Ӿ�� N �A�N��@�� N �մ��ո�ơC���ᦳ N ��A�C�@�榳 3 �ӫD �t��� ( �d��Ҭ� 0 �� 100), ���O�N��ӦW�ǥ�ť�O�B�\Ū�B�f����������ơC
�Y�O�q�L����A�h��X ��P�� �C�Y�O�ݭn�ɦҡA�h��X ��M�� �C�Y�O�L�k�q�L����A �h��X ��F��  
 * Date: 2016/12/05
 * Author: 103051060 �����a
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
