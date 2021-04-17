package Homework;

public class ListDequeTester {

	public static void main(String[] args) {
		ListDeque<String> wordDeque = new ListDeque<String>();
		
		printDeque(wordDeque);
		wordDeque.addToBack("amps");
		printDeque(wordDeque);
		wordDeque.addToBack("bank");
		printDeque(wordDeque);
		wordDeque.addToFront("card");
		printDeque(wordDeque);
		wordDeque.addToFront("door");
		printDeque(wordDeque);
		wordDeque.removeFront();
		printDeque(wordDeque);
		wordDeque.removeBack();
		printDeque(wordDeque);
		wordDeque.removeFront();
		printDeque(wordDeque);
		wordDeque.removeBack();
		printDeque(wordDeque);
	}

	private static void printDeque(ListDeque deque) {
		if(deque.isEmpty()) {
			System.out.println("Front: null \tBack: null");
		} else if (deque.getFront()== deque.getBack()) {
			System.out.println("Front: " + deque.getFront() + "\tBack: " + deque.getBack()+"\t"+deque.getBack());
		} else {
			System.out.print("Front: " + deque.getFront() + "\tBack: " + deque.getBack()+"\t");

			ListDeque<String> temp = new ListDeque<>();

			while (!deque.isEmpty()) {
				System.out.print(deque.getFront() + "<-->");
				temp.addToBack((String) deque.removeFront());
			}

			System.out.println();

			while (!temp.isEmpty()) {
				deque.addToBack(temp.removeFront());
			}
		}
	}
	
}