package advanced;

import java.util.Scanner;

public class CovariantReturnTypes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		State state = null;
		Flower flower;
		switch(input){
		case "WestBengal":
			state = new WestBengal();
			break;
		case("Karnataka"):
			state = new Karnataka();
			break;
		case("AndhraPradesh"):
			state = new AndhraPradesh();
			break;
		default:
			state = new State();
			break;
		}
		
		flower = state.yourNationalFlower();
		System.out.println(flower.whatsYourName());
		sc.close();

	}
	
	
	static class Flower{
		String whatsYourName(){
			return "No valid name!";
		}
	}
	
	static class Jasmine extends Flower{
		@Override
		String whatsYourName() {
			return "Jasmine";
		}
	}
	
	static class Lily extends Flower{
		@Override
		String whatsYourName() {
			return "Lily";
		}	
	}
	
	static class Lotus extends Flower{

		@Override
		String whatsYourName() {
			return "Lotus";
		}
		
	}
	
	
	static class State{
		Flower yourNationalFlower(){
			return new Flower();
		}
	}
	
	static class WestBengal extends State{
		@Override
		Jasmine yourNationalFlower() {
			return new Jasmine();
		}
	}
	
	static class Karnataka extends State{
		@Override
		Lotus yourNationalFlower() {
			return new Lotus();
		}
	}
	
	static class AndhraPradesh extends State{
		@Override
		Lily yourNationalFlower() {
			return new Lily();
		}
	}
	

}
