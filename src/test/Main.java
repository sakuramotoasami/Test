/**
 * 
 */
package test;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author asamisakuramoto
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//最初の形容詞のArrayList
		
		ArrayList<String> listOfFirstAdjective = new ArrayList<>();
		
		listOfFirstAdjective.add("不機嫌な");
		listOfFirstAdjective.add("1リットルの");
		listOfFirstAdjective.add("不審な");
		listOfFirstAdjective.add("適当な");
		listOfFirstAdjective.add("やさぐれた");
		listOfFirstAdjective.add("好奇心旺盛な");
		listOfFirstAdjective.add("落ち着きのない");
		listOfFirstAdjective.add("太った");
		
	    Random rand1 = new Random();
	    int num1 = rand1.nextInt(listOfFirstAdjective.size());

        //最初の名詞のArrayList
	    
        ArrayList<String> listOfFirstNoun = new ArrayList<>();
        
        listOfFirstNoun.add("お医者さん");
        listOfFirstNoun.add("どらねこ");
        listOfFirstNoun.add("大統領");
        listOfFirstNoun.add("半魚人");
        listOfFirstNoun.add("女の子");
        listOfFirstNoun.add("管理栄養士");
        
        Random rand2 = new Random();
        int num2 = rand2.nextInt(listOfFirstNoun.size());
        
        //最初の場所のArrayList
        
        ArrayList<String> listOfFirstPlace = new ArrayList<>();
        
        listOfFirstPlace.add("道のはしっこ");
        listOfFirstPlace.add("岩の上");
        listOfFirstPlace.add("黄色い部屋");
        listOfFirstPlace.add("公園");
        listOfFirstPlace.add("アメリカ");
        
        Random rand3 = new Random();
        int num3 = rand3.nextInt(listOfFirstPlace.size());
        
        //3つまとめて出力
        
        System.out.println(listOfFirstAdjective.get(num1) 
        		+ listOfFirstNoun.get(num2) + "が" 
        		+ listOfFirstPlace.get(num3) + "にいる");  
        
        
	}

}
