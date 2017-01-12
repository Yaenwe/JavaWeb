package adelium.cours.java;

public class Point implements Comparable<Point>
{
   private int x ;
   private int y ;
   
   public static int compteur = 0 ;
   
   public Point(int dx , int dy)
   {
	   this.x = dx ;
	   this.y = dy ;
	   compteur++;
   }
   
   public Point(int dx )
   {
	   this.x = dx ;
	   this.y = dx ;
	   compteur++;
   }
   
   public Point()
   {
	   this.x = 0 ;
	   this.y = 0 ;
	   compteur++;
   }

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("(");
	builder.append(x);
	builder.append(",");
	builder.append(y);
	builder.append(")");
	
	builder.append( " Module = ");
	builder.append(this.Module());
	
	return builder.toString();
}


public Boolean Coincide(Point p)
{
	return  ((this.x == p.x) && (this.y == p.y)) ;
} 

public Point Symetrique()
{
	/*Point p = new Point(-this.x,-this.y);
	return p ;*/

	return new Point(-this.x,-this.y);	
}


public double Module()
{
	return Math.sqrt((this.x*this.x) + (this.y * this.y));
}

@Override
public int compareTo(Point o) {
	
	/*if (this.Module() < o.Module())	
		return -1;
	else
		if (this.Module() > o.Module())	
			return +1;
		else
			return 0;*/
	
	
	
	return ((Double) this.Module()).compareTo(o.Module());
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}




   
}
