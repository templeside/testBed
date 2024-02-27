package ztemp3Kumar;
import java.util.ArrayDeque;
import java.util.HashSet;

public class CustomHashSet<E> extends HashSet<E> {
    public int limit;
    public ArrayDeque<E> queue;
    
    public CustomHashSet(int e) {
    	super(e);
    	this.limit = e;
    	this.queue = new ArrayDeque<>(e);
    }
    
	@Override
	public boolean add(E e) {
		if(super.contains(e))
			return false;
		queue.offer(e);
		if(super.size()== limit) {
    		E elem = queue.poll();
    		super.remove(elem);
    	}
        return super.add(e);
    }

	@Override
    public boolean remove(Object o) {
        if (super.remove(o)) {
            queue.remove(o);
            return true;
        }
        return false;
    }

    
	public static void main(String[] args) {
		 HashSet<Integer> set = new CustomHashSet<>(3);
		 set.add(1);
		 set.add(2);
		 set.add(3);
		 
		 System.out.println(set);
		 set.add(4);
		 System.out.println(set);
	}

}
