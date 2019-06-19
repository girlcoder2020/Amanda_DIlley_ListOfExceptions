import java.util.ArrayList;

public class ListOfExceptions {

	public static void main(String[] args) {
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("hello world");
		myList.add(48);
		myList.add("Goodbye World");

		for(int i = 0; i < myList.size(); i++) {
		    Object castedValue = myList.get(i);
		}
		
		try {
			Integer castedValue = (Integer) myList.get(0);
		}
		catch (ClassCastException e) {
			System.out.println("ClassCastException: code has attempted to cast an object to a subclass of which it is not an instance.");
		}
	}

}
