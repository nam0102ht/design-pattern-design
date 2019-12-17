package decorator;

public class main {
	// Làm cầu nối giữa hai lớp là RowingBoat và lớp Captain được adapter từ FishingAdapter
	public static void main(String[] args) {
		var captain = new Captain(new FishingAdapterIml());
		captain.row();
	}
}
