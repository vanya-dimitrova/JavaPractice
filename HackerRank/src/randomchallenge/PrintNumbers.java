package randomchallenge;

public class PrintNumbers {

	public static void main(String[] args) {
		String[] numbers = printNumbers();
		for(int i = 0; i < 100; i++){
			System.out.println(numbers[i]);
		}

	}
	
	 static String[] printNumbers() {
	        String[] numbers = new String[100];
	        for(int i = 1; i <= 100; i++){
	            if(i%3 == 0 && i%5 == 0){
	                numbers[i] = "FizzBuzz";
	            }
	            else if(i%3 == 0){
	                numbers[i-1] = "Fizz";
	            }
	            else if(i%5 == 0){
	                numbers[i-1] = "Buzz";
	            }
	            else{
	                numbers[i-1] = i+"";
	            }
	        }
	        return numbers;
	 }

}
