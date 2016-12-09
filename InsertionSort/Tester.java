
public class Tester {

	public static void main(String[] args) {
		System.out.println("hello world");
		int itemToInsert, j;
		boolean keepGoing;
		int a[]={1,3,2,9,5,2};
		for(int x=0;x<a.length;x++){System.out.print(a[x]);}
		for(int k=1;k<a.length;k++){
			itemToInsert=a[k];
			j=k-1;
			keepGoing=true;
			while((j>=0)&&keepGoing){
				if(itemToInsert<a[j]){
					a[j+1]=a[j];
					j--;
					if(j==-1){
						a[0]=itemToInsert;
					}
					else{keepGoing=false;}
					a[j+1]=itemToInsert;
				}
				
			}
			
		}
		for(int y=0;y<a.length;y++){System.out.print(a[y]);}
	}

}
