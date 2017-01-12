import com.m2i.formationjava.entities.*;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("Hello World!");
			int i =2;
			int j = 3;
			int k = max(i,j);
			System.out.println(k);
			System.out.println(pow(2,3));
			int[] tab = {1, 5, 99, 0, -5, -4, 3, 2, 88, 77};
			display(tab);
			System.out.println(sum(tab));
			System.out.println(max(tab));
			System.out.println(average(tab));
			Point3d p3d = new Point3d();
			
			
			Point p1 = new Point(3,4);
			p1.move(10, 12);
	
			
			
			Book b1 = new Book();
			b1.setTitle("");
			BankAccount ba1 = new BankAccount();
			
			
			Rectangle r1 = new Rectangle();
			//r1.setOrigin(p1);
			//r1.setOrigin(new Point(2,3));
			
			Publisher pub1 = new Publisher();
			b1.setPublisher(pub1);
			b1.setPublisher(new Publisher());
			b1.addAuthor(new Author());
			
			Counter.increment();
			Counter.increment();
			System.out.println(Counter.getI());
			b1.setCategory(Category.Computer);
			
			
			IMedia b2 = new Book();
		
			
			b2.getVATPrice();
			if( b2 instanceof Book) {
				Book b3 = (Book)b2;
				b3.getNbPage();
			}
			((Book)b2).getNbPage();
			
			Cd cd = new Cd(0,"Cd1");
			cd.setPrice(10);
			Dvd dvd = new Dvd(123,"Dvd1");
			dvd.setPrice(22);
			Book livre = new Book(456,"Java pour les nuls");
			livre.setPrice(12);
			Cart cart = new Cart();
			cart.getMedias().add(cd);
			cart.getMedias().add(dvd);
			cart.getMedias().add(livre);
			double prix = cart.getTotalPrice();
			
			int aa = Integer.parseInt("123");
			Integer.toString(aa);
			
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	public static int sum(int[] tab) {
		int sum = 0;
		for(int i = 0;i<tab.length;i++) {
			sum += tab[i];
		}
		return sum;
	}
	
	public static int max(int[] tab) {
		int max = tab[0];
		for(int i=1;i<tab.length;i++) {
			if(tab[i] > max) {
				max = tab[i];
			}
		}
		return max;
	}
	
	public static double average(int[] tab) {
		return (double)sum(tab)/tab.length;
	}
	
	public static void display(int[] tab) {
		for(int i = 0;i<tab.length;i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * Min of x & y
	 * @param x x
	 * @param y y
	 * @return
	 */
	public static int max(int x, int y) {
		if(x > y) {
			return x;
		}
		else {
			return y;
		}
	}
	
	public static int pow(int x, int y) {
		int result = 1;
		for(int i=0;i<y;i++) {
			result = result * x;
		}
		return result;
	}
	
	
}
