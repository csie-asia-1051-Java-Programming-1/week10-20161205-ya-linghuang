package ex;
/*
 * Topic: 請設計 Person 類別 (姓名,性別,身高,體重)，使用者可以新增個人資料，每新增一筆就會列出目前的資料串有哪些人，而這些資料請用插入排序法依每一個人的 BMI 值由大到小排序。
 * Date: 2016/12/05
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
import java.util.ArrayList;
public class ex03_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList<Person> per = new ArrayList<Person>();
		while(true){
			System.out.println("姓名: ");
			String Name = scn.next();
			System.out.println("性別(F/M): ");
			char Sex = scn.next().charAt(0);
			int Tall = 0;
			while(true){
				System.out.println("身高(cm): ");
				Tall = scn.nextInt();
				if(Tall>=0){break;}
				else{
					System.out.println("「身高輸入錯誤!」");
				}
			}
			int Weight = 0;
			while(true){
				System.out.println("體重(kg): ");
				Weight = scn.nextInt();
				if(Weight>=0){break;}
				else{
					System.out.println("「體重輸入錯誤!」");
				}
			}
			Person all = new Person(Name, Sex, Tall, Weight);
			float bmi = all.BMI();
			if(per.size()==0){
				per.add(all);
			}else if(per.size()==1){
				if(bmi>per.get(0).BMI()){
					per.add(0,all);
				}else{
					per.add(all);
				}
			}else{
				boolean bool = true;
				int find = 0;
				while(bool&&find<per.size()-1){
					if(find==0&&per.get(0).BMI()<bmi){
						per.add(0,all);
						bool=false;
					}else{
						if(per.get(find).BMI()>bmi&&per.get(find+1).BMI()<=bmi){
							per.add(find+1,all);
							bool=false;
						}else if(per.get(per.size()-1).BMI()>bmi){
							per.add(all);
							bool=false;
						}else{
							find+=1;
						}
					}
				}
			}
			for(int i =0; i<per.size(); i++){
				per.get(i).info();
			}
			System.out.println("Next(Y/N): ");
			char check = scn.next().charAt(0);
			if(check=='N'||check=='n'){break;}
		}
	}
}
class Person{
	private String name;
	private char sex;
	private float tall,weight;
	public Person(String name1,char sex1,int tall1,int weight1){
		name = name1;
		sex = sex1;
		tall = tall1;
		weight = weight1;
	}
	public float BMI(){
		return weight/(float)Math.pow((tall/100), 2);
	}
	public void info(){
		System.out.println(name+"\t"+sex+"\t"+tall+"\t"+weight+"\t"+BMI());
	}
}
