package hw;
/*
 *  設計一個 Student 的類別(學號, 姓名, 英文成績, 數學成績, 國文成績)，使用者可以連續輸入多筆同學資料，程式需滿足下列要求
1.成績輸入必須檢查是否在 0~100之間，如果錯誤要請使用者重新輸入
2.加入資料後要顯示目前有哪些人在資料串裡
3.資料串的資料須使用插入排序法依每同學的平均分數由大到小排序
 * Date: 2016/12/05
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
import java.util.ArrayList;
public class hw03_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList<Student>stu = new ArrayList<Student>();
		while(true){
			System.out.print("增加學生資訊 學號，姓名，英文成績，數學成績，國文成績: ");
			String Num = scn.next();
			String Name = scn.next();
			int En = scn.nextInt();
			int Ma = scn.nextInt();
			int Ch = scn.nextInt();
			while(true){
				if(En>=0&&En<=100){break;}
				else{
					System.out.print("「英文成績輸入錯誤!」\n英文成績為: ");
					En = scn.nextInt();
				}
			}
			while(true){
				if(Ma>=0&&Ma<=100){break;}
				else{
					System.out.print("「數學成績輸入錯誤!」\n數學成績為: ");
					Ma = scn.nextInt();
				}
			}
			while(true){
				if(Ch>=0&&Ch<=100){break;}
				else{
					System.out.print("「國文成績輸入錯誤!」\n國文成績為: ");
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
