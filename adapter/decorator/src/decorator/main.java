package decorator;

public class main {
	// Làm cầu nối giữa hai lớp là RowingBoat và lớp Captain được adapter từ FishingAdapter
	/*lớp Caption giữ interface của RowingBoat
	 * interface RowingBoat giữ lớp FishingBoat
	 * FishingAdapter giữ gíá trị của FishingBoat để cầu nối giữa Captain với FishingBoat
	 * kết quả được gọi từ Captain(new Adapter)
	 * Interface RowingBoat giúp trả về kết quả của FishingBoat
	 */
	
	public static void main(String[] args) {
		var captain = new Captain(new FishingAdapter());
		captain.row();
	}
}
