package adelium.cours.java;

import java.util.Comparator;

public class monComparateur implements Comparator<Point>{

	@Override
	public int compare(Point o1, Point o2) {
		// TODO Auto-generated method stub
		return ((Integer) o1.getX()).compareTo(o2.getX());
	}

}
