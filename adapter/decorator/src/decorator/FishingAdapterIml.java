package decorator;

public class FishingAdapterIml implements RowingBoat{
	private FishingBoat fishingBoat;
	public FishingAdapterIml() {
		this.fishingBoat = new FishingBoat();
	}
	@Override
	public void row() {
		fishingBoat.sail();
	}
	
}
