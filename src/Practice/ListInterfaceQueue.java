package Practice;

// Question 8:
public class ListInterfaceQueue<T> implements QueueInterface<T> {
	
	// beginning of the list is the front of queue
	// remember: ListInterface objects start at position 1
	private ListInterface<T> list; 
	
	public ListInterfaceQueue() {
		list = new LList(); // LList and AList are equally efficient (or inefficient)
		// if using LList, enqueues will be O(n) and dequeues will be O(1)
		// if using AList, enqueues will be O(1) and dequeues will be O(n)
		// if we had a tail pointer in LList, then that would be more efficient because enqueues would then also be O(1); but LList doesn't have this
	}

	@Override
	public void enqueue(T newEntry) {
		list.add(newEntry);
		
	}

	@Override
	public T dequeue() {
		if(list.isEmpty()) {
			throw new EmptyQueueException();
		} else {
			return list.remove(1);
		}
	}

	@Override
	public T getFront() {
		if(list.isEmpty()) {
			throw new EmptyQueueException();
		} else {
			return list.getEntry(1);
		}
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void clear() {
		list.clear();
	}

}
