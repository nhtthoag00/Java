import java.util.Scanner;

public class RemoveElementInArray extends CreateAndCheckArray {
	public static void main(String[] args) {
		CreateAndCheckArray.CreateAndCheck();
		
		//Create a new array
		int[] newArr = new int[size - 1];
		
		//Get index and Remove element in array at the position "index"
		System.out.println("Enter index of element want to remove: ");
		int index = sc.nextInt();
		if (index >= 0 && index <= arr.length) {
			int count = 0;
			while (count < index) {
				newArr[count] = arr[count];
				count++;
			}
			
			while (index < newArr.length) {
				newArr[index] = arr[index + 1];
				index++;
			
			}
		}
		
		//Show elements in array
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + "\t");
		}
		
		
	}
}
