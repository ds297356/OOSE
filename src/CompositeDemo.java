import java.util.ArrayList; //D0392458 ªô¬f²W
import java.util.ListIterator;

public class CompositeDemo {
	
	public static void main(String[] args) {
		
	}
	
	static void m1(Component c) {
		for(Component[] cc: c) {
			c.print();
		}
	}
	
}

abstract class Component {
	abstract void print();
}

class Composite extends Component {
	
	ArrayList<Component> list;
	
	public Composite() {
		list = new ArrayList<Component>();
	}
	
	void addComponent(Component c) {
		list.add(c);
	}
	
	void print() {
		ListIterator<Component> iterator = list.listIterator();
		
		while(iterator.hasNext()){
			Component c = iterator.next();
			c.print();
		}
	}
}

class Question extends Component {
	
	String description;
	
	public Question(String desc) {
		this.description = desc;
	}
	
	public void print () {
		System.out.println(description);
	}

	void addComponent(Component c) {
		
	}
}
