import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

public class MSet<T> {

	private TreeSet<T> elements;

	public MSet() {
		elements = new TreeSet<T>();
	}
	public MSet(TreeSet<T> s) {
		elements = new TreeSet<T>(s);
	}
	
	
	
	public MSet<T> Intersection(MSet<T> s) {
		MSet<T> temp = new MSet<T>();
		Iterator<T> iterator;
		if(elements.size() < s.elements.size()) {
			//temp.elements.retainAll(elements);
			iterator = elements.iterator();
		
		while(iterator.hasNext()) {
			T val = iterator.next();
			if(s.elements.contains(val)) {
				temp.elements.add(val);
			}
		}
		}
		else {
			iterator = s.elements.iterator();
			while(iterator.hasNext()) {
				T val = iterator.next();
				if(elements.contains(val)) {
					temp.elements.add(val);
				}
			}
		}
		return temp;
	}
	
	

	public MSet<T> Union(MSet<T> s) {
		MSet<T> temp = new MSet<T>();
		Iterator<T> iterator;
		if(elements.size() < s.elements.size()) {
			temp.elements.addAll(elements);
			iterator = s.elements.iterator();
		}
		else{
			temp.elements.addAll(s.elements);
			iterator = elements.iterator();
		}
		while(iterator.hasNext()) {
			T val = iterator.next();
			if(!temp.elements.contains(val)) {
				temp.elements.add(val);
			}
		}
		return temp;
	}

	public MSet<T> SetDifference(MSet<T> b) {
		MSet<T> temp = new MSet<T>(elements);
		temp.elements.removeAll(b.elements);
		return temp;
	}

	public boolean isDisjoint(MSet<T> b) {
		MSet<T> temp = SetDifference(b);
		temp.elements.removeAll(b.elements);
		return (elements.size() == temp.elements.size());
	}	
	
	@Override
	public String toString()
	{
		if(this.elements.isEmpty())
		{
			return "Empty Set";
		}
		else
		{
			return this.elements.toString();
		}
	}	
	


}
