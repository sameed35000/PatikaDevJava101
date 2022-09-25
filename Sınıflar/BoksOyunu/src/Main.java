
public class Main {

	public static void main(String[] args) {
		Fighter mAli = new Fighter("Muhammed Ali", 8, 95, 90, 35);
		Fighter mTyson = new Fighter("Mike Tyson", 10, 130, 120, 15);
		Ring r = new Ring(mAli, mTyson, 90, 120);
		r.run();
	}
}
