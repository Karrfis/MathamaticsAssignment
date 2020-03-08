import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Program {

	public static String[] binaryInput = { "0010010", "0100100", "0010010", "0100010", "0001001", "0100000", "0010001",
			"1000010", "1000100", "0010100" };

	public static String[] hexInput = { "87", "32", "11", "43", "F1", "97", "42", "56", "FF", "6B", };

	public static String[] base20Input = { "87", "32", "11", "43", "F1", "97", "42", "56", "FF", "6B", };

	public static String[] base3input = { "0020010", "0100200", "0010010", "0220010", "0002201", "0200020", "0210021",
			"1200010", "1000100", "0010100" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] ConvertBinaryToInt(String[] binaryArray) {

		int[] resultsArray = new int[binaryArray.length];

		for (int i = 0; i < binaryArray.length; i++) {
			resultsArray[i] = IntegerArray(binaryArray[i]);
		}
		return resultsArray;
	}

	public static int IntegerArray(String binary)

	{

		char[] numberArray = binary.toCharArray();
		int result = 0;
		for (int i = numberArray.length - 1; i >= 0; i--) {
			if (numberArray[i] == '1') {
				result += Math.pow(2, (numberArray.length - i - 1));
			}
		}

		return result;

	}

	////////////////////////////////////////////////////////

	public static int[] ConvertHexToInt(String[] array) {
		int[] resultsArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			resultsArray[i] = getIntForBase(array[i], 16);
		}
		return resultsArray;
	}

	public static int getIntForBase(String number, int base) {
		String ordered = reverse(number);
		int num = 0;
		if (base > 10) {
			for (int i = 0; i < ordered.length(); i++) {
				char c = ordered.charAt(i);
				int pos = (ordered.charAt(i) - '0');
				if (Character.isAlphabetic(c)) {
					pos = Math.abs('A' - c) + 10;
				}
				num += pos * Math.pow(base, i);
			}
		} else {
			for (int i = 0; i < ordered.length(); i++) {
				num += (ordered.charAt(i) - '0') * Math.pow(base, i);
			}
		}
		return num;
	}

	public static String reverse(String input) {
		char[] in = input.toCharArray();
		int begin = 0;
		int end = in.length - 1;
		char temp;
		while (end > begin) {
			temp = in[begin];
			in[begin] = in[end];
			in[end] = temp;
			end--;
			begin++;
		}
		return new String(in);
	}

	////////////////////////////////////////////////////////

	public static int[] Union(int[] intArrayA, int[] intArrayB) {

		ArrayList<Integer> unionList = new ArrayList<Integer>();

		int[] resultsArray = new int[unionList.size()];
		for (int i = 0; i < unionList.size(); i++) {
			resultsArray[i] = unionList.get(i);
		}

		return resultsArray;

	}

////////////////////////////////////////////////////////////////////
	public static int[] Intersection(int[] intArrayA, int[] intArrayB) {

		ArrayList<Integer> intersectList = new ArrayList<Integer>();

		int[] resultsArray = new int[intersectList.size()];
		for (int i = 0; i < intersectList.size(); i++) {
			resultsArray[i] = intersectList.get(i);
		}

		return resultsArray;

	}

	/////////////////////////////////////////////////////////////////
	public static int[] Difference(int[] intArrayA, int[] intArrayB) {

		ArrayList<Integer> differenceList = new ArrayList<Integer>();

		int[] resultsArray = new int[differenceList.size()];
		for (int i = 0; i < differenceList.size(); i++) {
			resultsArray[i] = differenceList.get(i);
		}

		return resultsArray;

	}

	///////////////////////////////////////////////////////////////
	public static int Sum(int[] input) {
		{
			int result = 0;

			for (int i = 0; i < input.length; i++) {
				result = result + input[i];
			}
			return result;
		}
	}

	//////////////////////////////////////////////////////////
	public static double Mean(int[] input) {

		double mean = 0;

		for (int i = 0; i < input.length; i++) {
			mean += input[i];
		}
		mean /= input.length;

		return mean;

	}

//////////////////////////////////////////////////////////////////////
	public static int[] ConvertBase20ToInt(String[] b20array) 
	{

		int[] resultsArray = new int[b20array.length];
		for (int i = 0; i < b20array.length; i++) {
			resultsArray[i] = getIntForBase(b20array[i], 20);
		}
		return resultsArray;

	}

	public static int GetIntForBase(String number, int base) 
	{
		String ordered = reverse(number);
		int num = 0;

		for (int i = 0; i < ordered.length(); i++) 
		{
			num += (ordered.charAt(i) - '0') * Math.pow(base, i);
		}
		return num;
	}

	public static String ReserveInput(String input) 
	{
		char[] in = input.toCharArray();
		int begin = 0;
		int end = in.length - 1;
		char temp;

		while (end > begin) 
		{
			temp = in[begin];
			in[begin] = in[end];
			in[end] = temp;
			end--;
			begin++;
		}
		return new String(in);
	}

	///////////////////////////////////////////////////////////////
	public static int Range(int[] input) {

		int output = 0;

		int high = 1;
		int low = 100;

		for (int i = 0; i < input.length; i++) {
			if (input[i] >= high) {
				high = input[i];
			}
			if (input[i] <= low)

			{
				low = input[i];
			}
		}

		output = high - low;

		return output;
	}

/////////////////////////////////////////////////////////////////////
	public static int[] ConvertBase3ToInt(String[] b3array) {

		int[] resultsArray = new int[b3array.length];
		for (int i = 0; i < b3array.length; i++) {
			resultsArray[i] = getIntForBase(b3array[i], 3);
		}
		return resultsArray;
	}

	public static int getIntforBase3(String number, int Base) {
		String ordered = reverse(number);
		int num = 0;
		for (int i = 0; i < ordered.length(); i++) {
			num += (ordered.charAt(i) - '0') * Math.pow(Base, i);
		}
		return num;
	}

	public static String Reverse(String input) {
		char[] in = input.toCharArray();
		int begin = 0;
		int end = in.length - 1;
		char temp;
		while (end > begin) {
			temp = in[begin];
			in[begin] = in[end];
			in[end] = temp;
			end--;
			begin++;
		}

		return new String(in);

	}

	/////////////////////////////////////////////////////////////////
	public static int Mode(int[] input) {
		int num2 = 0;
		int num1 = 0;
		int value1 = 0;
		int value2 = 0;

		for (int i = 0; i < input.length; i++) {
			value1 = input[i];
			num1 = 0;

			for (int j = i + 1; j < input.length; j++) {
				if (value1 == input[j])
					num1++;
			}

			if (num1 > num2) {
				value2 = value1;
				num2 = num1;
			}

			else if (num1 == num2) {
				value2 = Math.min(value2, value1);
			}
		}
		return value2;
	}

////////////////////////////////////////////////////////////////////
	public static double Median(int[] input) 
	{
		double output = 0;
		Arrays.sort(input);
		double length = input.length;
		int wholenumber = input.length / 2;
	

		if (length - Math.floor(length) == 0) 
		{
			int FirstNumber = wholenumber;
			int SecondNumber = wholenumber - 1;
			int ValueOne = input[FirstNumber];
			int ValueTwo = input[SecondNumber];
			double sum = ValueOne + ValueTwo;

			sum = sum / 2;
			output = sum;
		}
		return output;
	}

////////////////////////////////////////////////////////////////////
	public static double StandardDeviation(int[] input) 
	{

		double mean = 0;

		for (int i = 0; i < input.length; i++) 
		{
			mean += input[i];
		}

		mean /= input.length;

		double output = 0;

		for (int j = 0; j < input.length; j++) 
		{
			double calc = Math.pow((input[j] - mean), 2);
			output += calc;
		}

		output /= input.length - 1;
		output = Math.sqrt(output);
		return output;
	}

	///////////////////////////////////////////////////////////////////
	public static double HarmonicMean(int[] input) 
	{
		{
			double output = 0;

			for (int i = 0; i < input.length; i++) 
			{
				output += 1.0 / input[i];
			}
			return input.length / output;
		}

	}

	//////////////////////////////////////////////////////////////////
	public static double ComplexSumFunctionA(int[] input) 
	{
		// wasnt completed
		double output = 0;

		return output;
	}

//////////////////////////////////////////////////////////////////////////
	public static int[][] MatrixScalarMultiplication(int[][] matrix, int scalar) 
	{
		//wasnt completed
		int[][] resultMatrix = new int[matrix.length][matrix[0].length];

		return resultMatrix;
	}

//////////////////////////////////////////////////////////////////////////////////////
	public static int[][] ComplexMatrixOperation(int[][] matrixA, int[][] matrixB, int scalar) 
	{
		//wasnt completed
		int[][] resultMatrix = new int[matrixA[0].length][matrixA[0].length];
		return resultMatrix;
	}

	//////////////////////////////////////////////////////////////////////
	public static double[] GenerateRandomDistributionForSpecificDie(int iterations) 
	{
		//wasnt completed
		double[] resultsArray = new double[5121];

		Random rng = new Random(1234);

		for (int i = 0; i < iterations; i++) {

		}

		return resultsArray;
	}

///////////////////////////////////////////////////////////////////////////
	public static double[] GenerateRandomDistribution(int dieSides, int rolls, int iterations) {
		
		//Wasnt Completed
		double[] resultsArray = new double[(dieSides * rolls) + 1];

		Random rng = new Random(1234);

		for (int i = 0; i < iterations; i++) {

		}

		return resultsArray;
	}

	///////////////////////////////////////////////////////////////////////
	public static double GetProbabilityOfResultOrHigher(int dieSides, int rolls, int sum) {
		//wasnt completed
		double[] distribution = GenerateRandomDistribution(dieSides, rolls, 100000);

		double result = 0;

		return result;
	}

}
