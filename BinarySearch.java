

public class Driver {
	
	public static int binarySearch(Comparable[] objArray, Comparable searchObj){
		if (objArray.length == 0){
			return 999;
		}
		
		int firstIndex = 0;
		int lastIndex = objArray.length - 1;
		int middleIndex = 0;
		int returnValue = 999;
		int midValue = 0;
		
		while (firstIndex <= lastIndex){
			middleIndex = (firstIndex + lastIndex) / 2;
			
			if (objArray[middleIndex].compareTo(searchObj) < 0){
				midValue = middleIndex;
				firstIndex = middleIndex + 1;
			}
			else if (objArray[middleIndex].compareTo(searchObj) > 0){
				midValue = middleIndex;
				lastIndex = middleIndex - 1;
			}
			else if (objArray[middleIndex].compareTo(searchObj) == 0){
				returnValue = middleIndex;
				return returnValue;
			}
		}
		
		if (objArray[midValue].compareTo(searchObj) < 0){
			returnValue = midValue + 1;
		}
		else if (objArray[midValue].compareTo(searchObj) > 0){
			returnValue = midValue;
		}
		
		return returnValue;
	}	
	
	public static void main(String[] args){
		int expectedIndex;
		int actualIndex;
		
		/* Test Case 1: Empty Array */
		Integer[] emptyArray = {};
		System.out.println("Test Case 1: Empty Array");
		System.out.println("Testing the binary search on an empty array.");
		expectedIndex = 999;
		actualIndex = binarySearch(emptyArray, 12);
		if (actualIndex == expectedIndex){
			System.out.println("Test 1: Pass");
		}
		else {
			System.out.println("Test 1: Fail");
		}
		
		System.out.println();
		
		/* Test Case 2: Item exists in lower bound of even array */
		Integer[] intArray = {1, 2, 4, 5, 6, 7, 9, 11};
		System.out.println("Test Case 2: Item exists in lower bound of even array.");
		System.out.println("Printing array:");
		for (int x: intArray){
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("Testing for integer 1 insertion into lower bound of even array.");
		expectedIndex = 0;
		actualIndex = binarySearch(intArray, 1);
		System.out.println("Index expected: 0");
		System.out.println("Index returned: " + actualIndex);
		if (actualIndex == expectedIndex){
			System.out.println("Test 2: Pass");
		}
		else {
			System.out.println("Test 2: Fail");
		}
		
		System.out.println();
		
	
		/* Test Case 3: Item doesn't exist in lower bound of even array */
		Integer[] intArray2 = {2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Test Case 3: Item doesn't exist in lower bound of even array.");
		System.out.println("Printing array:");
		for (int x: intArray2){
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("Testing for integer 1 insertion into lower bound of even array.");
		expectedIndex = 0;
		actualIndex = binarySearch(intArray, 1);
		System.out.println("Index expected: 0");
		System.out.println("Index returned: " + actualIndex);
		if (actualIndex == expectedIndex){
			System.out.println("Test 3: Pass");
		}
		else {
			System.out.println("Test 3: Fail");
		}
		
		System.out.println();
		
		/* Test Case 4: Item exists in lower bound of odd array */
		Character[] charArray = {'b', 'c', 'e', 'g', 'i'};
		System.out.println("Test Case 4: Item exists in lower bound of odd array.");
		System.out.println("Printing array:");
			for (char c: charArray){
				System.out.print(c + " ");
			}
		System.out.println();
		System.out.println("Testing for character b insertion into lower bound of odd array.");
		expectedIndex = 0;
		actualIndex = binarySearch(charArray, 'b');
		System.out.println("Index expected: 0");
		System.out.println("Index returned: " + actualIndex);
		if (actualIndex == expectedIndex){
			System.out.println("Test 4: Pass");
		}
		else {
			System.out.println("Test 4: Fail");
		}
		
		System.out.println();
		
		/* Test Case 5: Item doesn't exist in lower bound of odd array*/
		Double[] doubleArray = {2.2, 4.1, 5.7, 7.2, 8.8};
		System.out.println("Test Case 5: Item doesn't exist in lower bound of odd array");
		System.out.println("Printing array:");
		for (double d: doubleArray){
			System.out.print(d + " " );
		}
		System.out.println();
		System.out.println("Testing for double 2.1 insertion into lower bound of odd array.");
		expectedIndex = 0;
		actualIndex = binarySearch(doubleArray, 2.1);
		System.out.println("Index expected: 0");
		System.out.println("Index returned: " + actualIndex);
		if (actualIndex == expectedIndex){
			System.out.println("Test 5: Pass");
		}
		else {
			System.out.println("Test 5: Fail");
		}
		System.out.println();
		
		/* Test Case 6: Item exists in upper bound of even array. */
		Integer[] intArray3 = {1, 2, 4, 5, 6, 7, 9, 11};
		System.out.println("Test Case 6: Item exists in upper bound of even array.");
		System.out.println("Printing array:");
		for (int x: intArray3){
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("Testing for integer 11 insertion into upper bound of even array.");
		expectedIndex = 7;
		actualIndex = binarySearch(intArray3, 11);
		System.out.println("Index expected: 7");
		System.out.println("Index returned: " + actualIndex);
		if (actualIndex == expectedIndex){
			System.out.println("Test 6: Pass");
		}
		else {
			System.out.println("Test 6: Fail");
		}
		
		System.out.println();
		
		/* Test Case 7: Item doesn't exist in upper bound of even array. */
		Integer[] intArray4 = {1, 2, 4, 5, 6, 7, 9, 11};
		System.out.println("Test Case 7: Item doesn't exist in upper bound of even array.");
		System.out.println("Printing array:");
		for (int x: intArray4){
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("Testing for integer 12 insertion into upper bound of even array.");
		expectedIndex = 8;
		actualIndex = binarySearch(intArray4, 12);
		System.out.println("Index expected: 8");
		System.out.println("Index returned: " + actualIndex);
		if (actualIndex == expectedIndex){
			System.out.println("Test 7: Pass");
		}
		else {
			System.out.println("Test 7: Fail");
		}
		
		System.out.println();
		
		/* Test Case 8: Item exists in upper bound of odd array. */
		Character[] charArray2 = {'a', 'b', 'c', 'd', 'e'};
		System.out.println("Test Case 8: Item exists in upper bound of odd array.");
		System.out.println("Printing array:");
		for (char c: charArray2){
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("Testing for character e insertion into upper bound of odd array.");
		expectedIndex = 4;
		actualIndex = binarySearch(charArray2, 'e');
		System.out.println("Index expected: 4");
		System.out.println("Index returned: " + actualIndex);
		if (actualIndex == expectedIndex){
			System.out.println("Test 8: Pass");
		}
		else {
			System.out.println("Test 8: Fail");
		}
		
		System.out.println();
		
		/* Test Case 9: Item doesn't exist in upper bound of odd array. */
		Character[] charArray3 = {'a', 'b', 'c', 'd', 'e'};
		System.out.println("Test Case 9: Item doesn't exist in upper bound of odd array.");
		System.out.println("Printing array:");
		for (char c: charArray3){
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("Testing for character 'f' insertion into upper bound of odd array.");
		expectedIndex = 5;
		actualIndex = binarySearch(charArray3, 'f');
		System.out.println("Index expected: 5");
		System.out.println("Index returned: " + actualIndex);
		if (actualIndex == expectedIndex){
			System.out.println("Test 9: Pass");
		}
		else {
			System.out.println("Test 9: Fail");
		}
		
		System.out.println();
		
		/* Test Case 10: Item exists in the middle of even array. */
		Character[] charArray5 = {'a', 'b', 'c', 'd', 'e', 'f'};
		System.out.println("Test Case 10: Item exists in the middle of even array.");
		System.out.println("Printing array:");
		for (char c: charArray5){
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("Testing for character c insertion into array that has c in middle.");
		expectedIndex = 2;
		actualIndex = binarySearch(charArray5, 'c');
		System.out.println("Index expected: 2");
		System.out.println("Index returned: " + actualIndex);
		if (actualIndex == expectedIndex){
			System.out.println("Test 10: Pass");
		}
		else {
			System.out.println("Test 10: Fail");
		}
		
		System.out.println();
		
		/* Test Case 11: Item doesn't exist in the middle of even array. */
		Character[] charArray6 = {'a', 'b', 'c', 'e', 'f', 'g'};
		System.out.println("Test Case 11: Item doesn't exist in the middle of even array.");
		System.out.println("Printing array:");
		for (char c: charArray6){
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("Testing for character d insertion.");
		expectedIndex = 3;
		actualIndex = binarySearch(charArray6, 'd');
		System.out.println("Index expected: 3");
		System.out.println("Index returned: " + actualIndex);
		if (actualIndex == expectedIndex){
			System.out.println("Test 11: Pass");
		}
		else {
			System.out.println("Test 11: Fail");
		}
		
		System.out.println();
		
		/* Test Case 12: Item exists in the middle of odd array. */
		Long[] longArray = {2L, 4L, 6L, 8L, 10L, 12L, 16L};
		System.out.println("Test Case 12: Item exists in the middle of odd array.");
		System.out.println("Printing array:");
		for (long l: longArray){
			System.out.print(l + " ");
		}
		System.out.println();
		System.out.println("Testing for long 8 insertion.");
		expectedIndex = 3;
		actualIndex = binarySearch(longArray, 8L);
		System.out.println("Index expected: 3");
		System.out.println("Index returned: " + actualIndex);
		if (actualIndex == expectedIndex){
			System.out.println("Test 12: Pass");
		}
		else {
			System.out.println("Test 12: Fail");
		}
		
		System.out.println();
		
		/* Test Case 13: Item doesn't exist in the middle of odd array. */
		Long[] longArray2 = {2L, 4L, 6L, 8L, 10L, 12L, 16L};
		System.out.println("Test Case 13: Item doesn't exist in the middle of odd array.");
		System.out.println("Printing array:");
		for (long l: longArray2){
			System.out.print(l + " ");
		}
		System.out.println();
		System.out.println("Testing for long 9 insertion.");
		expectedIndex = 4;
		actualIndex = binarySearch(longArray, 9L);
		System.out.println("Index expected: 4");
		System.out.println("Index returned: " + actualIndex);
		if (actualIndex == expectedIndex){
			System.out.println("Test 13: Pass");
		}
		else {
			System.out.println("Test 13: Fail");
		}
		
		System.out.println();
		
		/* Test Case 14: Item doesn't exist in the middle of odd array. */
		String[] stringArray = {"Apples", "Bananas", "Carrots", "Everything", "Fantasy"};
		System.out.println("Test Case 14: Item doesn't exist in the middle of odd array.");
		System.out.println("Printing array:");
		for (String s: stringArray){
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("Testing for string Diamonds insertion.");
		expectedIndex = 3;
		actualIndex = binarySearch(stringArray, "Diamonds");
		System.out.println("Index expected: 3");
		System.out.println("Index returned: " + actualIndex);
		if (actualIndex == expectedIndex){
			System.out.println("Test 14: Pass");
		}
		else {
			System.out.println("Test 14: Fail");
		}
		
		System.out.println();
	}
}

