package adelium.cours.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principale {

	public static void main(String[] args) {
		Point p = new Point(12,10);
		System.out.println(p.toString());
		Point p2 = new Point(11,70);
		System.out.println(p.Coincide(p2));
		
		
		List<Point> lstPoints = new ArrayList<Point>();
		lstPoints.add(p);
		lstPoints.add(p2);
		lstPoints.add(new Point(4,6));
		lstPoints.add(new Point(3,2));
		
	
	//Collections.sort(lstPoints);	
		
	lstPoints.sort(new Comparator<Point>() {

		@Override
		public int compare(Point o1, Point o2) {
			// TODO Auto-generated method stub
			return ((Double) o1.Module()).compareTo(o2.Module());
		}
		
	});			
		
	for(Point ps:lstPoints)	
	{
		System.out.println(ps);
	}	
	
	
	monComparateur pc1 =  new monComparateur();
	lstPoints.sort(pc1);
	
	for(Point ps:lstPoints)
	{
		System.out.println(ps);
	}
	
	
	}

	
	
}
