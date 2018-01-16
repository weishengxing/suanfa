package com.company.Array;
//找出第二大的数字
public class SecondMax {
	public static int FindSecMax(int data[]){
		int length=data.length;
		int max=data[0];
		int sec_max=Integer.MIN_VALUE;
		for(int i=1;i<length;i++){
			if(data[i]>max){
				sec_max=max;
				max=data[i];
			
			}else{
				if(data[i]>sec_max){
					sec_max=data[i];
				}
			}
		}
		return sec_max;
	}
	public static void main(String[] args){
		int[] array={5,1,3,4,6,8,7,2};
		System.out.println(FindSecMax(array));
	}

}
