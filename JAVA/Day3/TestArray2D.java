import java.util.Scanner;
public class TestArray2D {

 public static void main(String[] args) {
	//int[][] arr3=new int[3][]; 
//int[][][] arr31=new int[3][][]; 
	int[][] arr= {{4,5,6},{3,4,5},{1,2,3}};
	int[][] arr1= {{1,5,6},{3,2,7},{10,20,30}};
	//int[][] arr=new int[3][4];
	Scanner sc=new Scanner(System.in);
	//Array2DService.acceptData(arr);
	ServiceArray2D.displayData(arr);
	ServiceArray2D.displayData(arr1);
	int choice=0;
	do {
	System.out.println("1. add all numbers\n2. add rowwise\n3.columnwise addition");
	System.out.println("4. find max of all numbers\n 5. maximum rowwise\n6. find maximum columnwise");
	System.out.println("7. add 2 arrays\n8. multiply array\n9. find transpose of array");
	System.out.println("10. check identity matrix\n11. rotate matrix rows\n 12. rotate matrix columns");
	System.out.println("13. convert to 1D array\n 14. exit\nchoice : ");
	choice=sc.nextInt();
	switch(choice) {
	case 1:
		int ans=ServiceArray2D.addAllNumbers(arr);
		System.out.println("Addition : "+ans);
		break;
	case 2:
		int[] arradd=ServiceArray2D.addRowwise(arr);
		/*for(int i=0;i<arradd.length;i++) {
			System.out.println(arradd[i]);
		}*/
		for(int val:arradd) {  
			System.out.println(val);
		}
		break;
	case 3:
		 arradd=ServiceArray2D.addColumnwise(arr);
		/*for(int i=0;i<arradd.length;i++) {
			System.out.println(arradd[i]);
		}*/
		for(int val:arradd) {  
			System.out.println(val);
		}
		break;
	case 4:
	    int max = ServiceArray2D.findMax(arr);
	    System.out.println("Maximum of all numbers: " + max);
	    break;
	case 5:
	    int[] maxRow = ServiceArray2D.findMaxRowwise(arr);
	    System.out.println("Maximum row-wise:");
	    for (int val : maxRow) {
	        System.out.println(val);
	    }
	    break;
	case 6:
	    int[] maxCol = ServiceArray2D.findMaxColumnwise(arr);
	    System.out.println("Maximum column-wise:");
	    for (int val : maxCol) {
	        System.out.println(val);
	    }
	    break;
	case 7:
		int[][] addition=ServiceArray2D.add2Darrays(arr,arr1);
		ServiceArray2D.displayData(addition);
		break;
	case 8:
		int[][] multiply=ServiceArray2D.multiplyArray(arr,arr1);
		if(multiply!=null) {
			ServiceArray2D.displayData(multiply);
		}else {
			System.out.println("multiplication not possible");
		}
		break;
	case 9:
		int[][] temp=ServiceArray2D.findTranspose(arr);
		ServiceArray2D.displayData(temp);
		break;
	case 10:
		boolean status=ServiceArray2D.checkIdentity(arr);
		if(status)  ///status==true
			System.out.println("It is identity matrix");
		else
			System.out.println("It is not identity matrix");
		break;
	case 11:
		System.out.println("Enter number of rotation");
		int n=sc.nextInt();
		int[][] newarr=ServiceArray2D.rotateRow(arr,n);
		ServiceArray2D.displayData(newarr);
		break;
	case 12:
		System.out.println("Enter number of rotation for column");
		n=sc.nextInt();
		newarr=ServiceArray2D.rotateColumn(arr,n);
		ServiceArray2D.displayData(newarr);
		break;
	case 13:
		int[] arr2=ServiceArray2D.convertTo1DArray(arr);
		for(int val:arr2) {
			System.out.print(val+",");
		}
		System.out.println();
		break;
	case 14:
		System.out.println("Thank you for visiting.....");
		break;
	default:
		System.out.println("choice is wrong");
		break;
	}
	}while(choice!=14);
	}

}
