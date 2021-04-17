package Practice;

public class PracticeDriver {

    public static void main(String[] args) {
        String text1 = "raceCar";
        String text2 = "hello";
        String text3 = "sees";
        String text4 = "a";
        String text5 = "";

        System.out.println(isPalindrome(text1));            // true
        System.out.println(isPalindrome(text2));            // false
        System.out.println(isPalindrome(text3));            // true
        System.out.println(isPalindrome(text4));            // true
        System.out.println(isPalindrome(text5));            // false
    }

    // Question 5:
    public static boolean isPalindrome(String word) {
        if (word.isEmpty()) {
            return false;
        }

        DequeInterface<Character> temp = new LinkedDeque<>();
        int length = word.length();

        for (int i = 0; i < length; i++) {
            temp.addToBack(Character.toUpperCase(word.charAt(i)));
        }

        while (length > 1) {
            if (!temp.removeFront().equals(temp.removeBack())) {
                return false;
            }

            length -= 2;
        }

        return true;
    }

    // Question 8:
    public static <T> QueueInterface<T> createNewQueue(QueueInterface<T> otherQueue) {
        QueueInterface<T> copyQueue = new LinkedQueue<T>(); // or these could be Homework.ArrayQueue

        while (!copyQueue.isEmpty()) {
            T element = otherQueue.dequeue();
            otherQueue.enqueue(element);
            copyQueue.enqueue(element);
        }

        return copyQueue;
    }
}
