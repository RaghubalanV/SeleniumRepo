package week1.day2Assignment;
public class MissingInArray {
public static void main(String[] args) {
	int[] array = {1,2,3,4,7,6,8};
int n=8;
int sum=n*(n+1)/2;
int sum1 = 0;
for(int i=0; i< array.length; i++) {
	sum1 = sum1+array[i];
}
int num=sum-sum1;
System.out.println(num+"is the missing element in an array.");
}
}
