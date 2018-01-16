package com.company.Sort;
//快速排序
public class QuickSort {
	public static void quickSort(int item[], int low, int hight) {
		if(low>=hight){
			return;
		}
		int i=low;
		int j=hight;
		int index=item[i];
		while (i<j){
			while (i<j&&item[j]>=index){
				j--;
			}
			if(i<j){
				item[i++]=item[j];
			}
			while (i<j&&item[i]<=index){
				i++;
			}
			if(i<j){
				item[j--]=item[i];
			}
		}
		item[i]=index;
		quickSort(item,low,i-1);
		quickSort(item,i+1,hight);
	}
	public static void sort(int item[]){
		quickSort(item,0,item.length-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int item[] = { 12, 21, 13, 18, 9,11, 15, 17, 14, 16, 10, 10,1};
		sort(item);
		for (int i = 0; i < item.length; i++) {
			System.out.print(item[i] + "    ");
		}

	}

}
