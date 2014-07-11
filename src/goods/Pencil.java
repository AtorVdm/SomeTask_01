package goods;

public class Pencil extends WritingImplement {
	private float leadRadius; //mm
	private String bodyMaterial;
	{
		leadRadius = 0;
		bodyMaterial = "";
	}
	
	public Pencil() {
		super();
		leadRadius = 0.5f;
		bodyMaterial = "Wood";		
	}
	
	public Pencil(String name, float price, float leadRadius, String bodyMaterial) {
		super(name, price);
		this.leadRadius = leadRadius;
		this.bodyMaterial = bodyMaterial;
	}
	
	@Override
	public String toString() {
		return "Pencil [name=" + name +", price=" + price + ", leadRadius=" + leadRadius + ", bodyMaterial=" + bodyMaterial + "]";
	}

	public float getLeadRadius() {
		return leadRadius;
	}

	public void setLeadRadius(float leadRadius) {
		this.leadRadius = leadRadius;
	}

	public String getBodyMaterial() {
		return bodyMaterial;
	}

	public void setBodyMaterial(String bodyMaterial) {
		this.bodyMaterial = bodyMaterial;
	}
}