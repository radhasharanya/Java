package dayAssignment;

public class SynchronizedTest {

	public static void main(String[] args) {
		Evenumbers even =new Evenumbers();
		FirstThreadSynch fsyn=new FirstThreadSynch(even);
		SecondThreadSynch ssyn= new SecondThreadSynch(even);
		ThirdThreadSynch tsyn= new ThirdThreadSynch(even);
		fsyn.setPriority(10);
		fsyn.start();
		ssyn.setPriority(7);
		ssyn.start();
		tsyn.setPriority(5);
		tsyn.start();
	}

}