class BinarySearch {
	int Search(int arr[], int f, int n, int e)
	{
		if (n >= f) {
			int mid = f + (n - f) / 2;
			if (arr[mid] == e)
				return mid;
			if (arr[mid] > e)
				return Search(arr, f, mid - 1, e);
			if(arr[mid]<e)
			    return Search(arr, mid + 1, n, e);
		}
		return -1;
	}
}
class Main4{
	public static void main(String args[])
	{
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int result,e = 10;
		BinarySearch ob = new BinarySearch();
		result = ob.Search(arr, 0, n - 1, e);
		if (result == -1)
			System.out.println("Element is not present");
		else
			System.out.println("Element is present in index " + result);
	}
}
