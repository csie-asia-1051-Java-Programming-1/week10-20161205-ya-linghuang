package hw;
/*
 *  ���@�ا{���`�����C���٬� "18 �� "~ ���k���� : �ѥ|�ӻ�l���Y�A�u�n�䤤���� �ӬO�ۦP�I�A�~�}�l�p���I�ơA�I�ƧY���t����I�Ƭۥ[�A�Y�t��Ӥ]�@�ˡA�h���� �j���@�լۥ[�A�t�~���U�C�X�دS���p:
1.�Y�X 4 ����l�I�Ƨ��ۦP�A�٬��q�� !
2.���T���I�ƬۦP�Υ|���I�Ƨ����ۦP�A�Y���L�N�q ! �мg�@�{���A�U�O��J�|����l�I�ơA�P�_���G !
 * Date: 2016/12/05
 * Author: 103051060 �����a
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
		if(a==b&&b==c&&c==d&&d==a){					//4�P
			System.out.println("�q��");
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
