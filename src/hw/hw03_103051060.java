package hw;
/*
 *  �]�p�@�� Student �����O(�Ǹ�, �m�W, �^�妨�Z, �ƾǦ��Z, ��妨�Z)�A�ϥΪ̥i�H�s���J�h���P�Ǹ�ơA�{���ݺ����U�C�n�D
1.���Z��J�����ˬd�O�_�b 0~100�����A�p�G���~�n�ШϥΪ̭��s��J
2.�[�J��ƫ�n��ܥثe�����ǤH�b��Ʀ��
3.��Ʀꪺ��ƶ��ϥδ��J�ƧǪk�̨C�P�Ǫ��������ƥѤj��p�Ƨ�
 * Date: 2016/12/05
 * Author: 103051060 �����a
 */
import java.util.Scanner;
import java.util.ArrayList;
public class hw03_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList<Student>stu = new ArrayList<Student>();
		while(true){
			System.out.print("�W�[�ǥ͸�T �Ǹ��A�m�W�A�^�妨�Z�A�ƾǦ��Z�A��妨�Z: ");
			String Num = scn.next();
			String Name = scn.next();
			int En = scn.nextInt();
			int Ma = scn.nextInt();
			int Ch = scn.nextInt();
			while(true){
				if(En>=0&&En<=100){break;}
				else{
					System.out.print("�u�^�妨�Z��J���~!�v\n�^�妨�Z��: ");
					En = scn.nextInt();
				}
			}
			while(true){
				if(Ma>=0&&Ma<=100){break;}
				else{
					System.out.print("�u�ƾǦ��Z��J���~!�v\n�ƾǦ��Z��: ");
					Ma = scn.nextInt();
				}
			}
			while(true){
				if(Ch>=0&&Ch<=100){break;}
				else{
					System.out.print("�u��妨�Z��J���~!�v\n��妨�Z��: ");
					Ch = scn.nextInt();
				}
			}
			Student all = new Student(Num, Name, En,Ma,Ch);
			float avg = all.Avg();
			if(stu.size()==0){
				stu.add(all);
			}else if(stu.size()==1){
				if(avg>stu.get(0).Avg()){
					stu.add(0,all);
				}else{
					stu.add(all);
				}
			}else{
				boolean bool = true;
				int find = 0;
				while(bool&&find<stu.size()-1){
					if(find==0&&stu.get(0).Avg()<avg){
						stu.add(0,all);
						bool=false;
					}else{
						if(stu.get(find).Avg()>avg&&stu.get(find+1).Avg()<=avg){
							stu.add(find+1,all);
							bool=false;
						}else if(stu.get(stu.size()-1).Avg()>avg){
							stu.add(all);
							bool=false;
						}else{
							find+=1;
						}
					}
				}
			}
			for(int i =0; i<stu.size(); i++){
				stu.get(i).info();
			}
			System.out.print("Next(Y/N): ");
			char check = scn.next().charAt(0);
			if(check=='N'||check=='n'){break;}
		}
	}

}
class Student{
	private String name,num;
	private int en,ma,ch;
	public Student(String num1,String name1,int en1,int ma1,int ch1){
		name = name1;
		num = num1;
		en=en1;
		ma=ma1;
		ch=ch1;
	}
	public float Avg(){
		return (float)(en+ma+ch)/3;
	}
	public void info(){
		System.out.println(name+"("+num+")\t"+en+"\t"+ma+"\t"+ch+"\t"+Avg());
	}
}
