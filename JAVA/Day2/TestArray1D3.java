
public class TestArray1D3 {

	public static void main(String[] args) {
		int[] arr = {10,20,10,10,40,10,10,76};
		ServiceTestArray1D3.printOccurances(arr, 10);
		System.out.println(ServiceTestArray1D3.printList(arr, 10));
		int nthMax = ServiceTestArray1D3.nthMax(arr, 2);
		System.out.println(nthMax);
		int nthMin = ServiceTestArray1D3.nthMin(arr, 2);
		System.out.println(nthMin);
	}

}
