package decorator;

public class Captain {
	private RowingBoat rowingBoat;
	public Captain(RowingBoat rowingBoat) {
		this.rowingBoat = rowingBoat;
	}
	
	public void row() {
		this.rowingBoat.row();
	}
}
