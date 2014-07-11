package goods;

import main.Main;

abstract public class WritingImplement implements Comparable<WritingImplement> {
	protected static int wiCount = 0;
	protected static float allWiPrice = 0;
	protected String name;
	protected float price;
	{
		name = "";
		price = 0;
	}
	
	public WritingImplement(String name, float price) {
		super();
		setName(name);
		setPrice(price);
		wiCount++;
	}
	
	public WritingImplement() {
		super();
		setName("Default");
		setPrice(1.0f);
		wiCount++;
	}
	
	public static void printAveragePrice() {
		Main.print("AveragePrice = " + allWiPrice/wiCount);
	}
	
	public int compareTo(WritingImplement wi) {
        if (this.price < wi.getPrice())
            return -1;
        else if (this.price == wi.getPrice())
            return 0;
        else
            return 1;
    }
	
	@Override
	abstract public String toString();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		allWiPrice -= this.price;
		allWiPrice += price;
		this.price = price;
	}
}