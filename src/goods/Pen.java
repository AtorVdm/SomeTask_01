package goods;

public class Pen extends WritingImplement {
	private float inkVolume; // millilitres
	private String incColor;
	{
		inkVolume = 0;
		incColor = "";
	}
	
	public Pen() {
		super();
		inkVolume = 0.1f;
		incColor = "Blue";
	}
	
	public Pen(String name, float price, float inkVolume, String incColor) {
		super(name, price);
		this.inkVolume = inkVolume;
		this.incColor = incColor;
	}

	@Override
	public String toString() {
		return "Pen [name=" + name +", price=" + price + ", inkVolume=" + inkVolume + ", incColor=" + incColor + "]";
	}

	public float getInkVolume() {
		return inkVolume;
	}

	public void setInkVolume(float inkVolume) {
		this.inkVolume = inkVolume;
	}

	public String getIncColor() {
		return incColor;
	}

	public void setIncColor(String incColor) {
		this.incColor = incColor;
	}
}
