
public class StudentPassing extends CreateAndCheckArray {
	public static void main(String[] args) {
		CreateAndCheckArray.CreateAndCheck();
		int count = 0;
		System.out.print("List of mark: \t");
		 for (int j = 0; j < arr.length; j++) {
		     System.out.print(arr[j] + "\t");
		     if (arr[j] >= 5 && arr[j] <= 10)
		         count++;
		 }
		 System.out.print("\n The number of students passing the exam is " + count);
	}
}
