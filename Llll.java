public class Llll {

	public static void main(String[] args) {
		int a[]= {9,3,1,8,3,6,7};
		int count=0,median=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}count++;
		}
		
	for(int i=0;i<a.length;i++) {
		if(count%2!=0) {  //odd count of Median
			median=(count/2)+1;
			
		}
		else { //even count of Median 
			median=((count/2)+((count/2)+1))/2;
			
		}
		
	}
	System.out.println("After sorting array");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+",");
		
	}
	
	System.out.println("");
	if(count%2!=0) {
	System.out.print("Median of the array is:"+a[median-1]);
	}
	else {
		System.out.print("Median of the array is:"+a[median-1]+","+a[median]);
	}
	}
}
