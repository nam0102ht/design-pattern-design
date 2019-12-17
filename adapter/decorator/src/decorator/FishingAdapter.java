package decorator;

public class FishingAdapter implements RowingBoat{
	private FishingBoat fishingBoat;
	public FishingAdapter() {
		this.fishingBoat = new FishingBoat();
	}
	@Override
	public void row() {
		fishingBoat.sail();
	}
	
}
