package main;

import goods.Pen;
import goods.Pencil;
import goods.WritingImplement;

public class Main {
	public static void print(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		try {
			Main main = new Main();
			WIContainer wiContainer = main.getContainer();
		
			main.fillContainer(wiContainer);
			main.printContainer(wiContainer);
			main.sortContainer(wiContainer);
			main.printContainer(wiContainer);
		} catch(Exception ex) {
			print("Exception occurred! This app doesn't support exception handling. Message:");
			print(ex.getMessage());
		}
	}
	
	private WIContainer getContainer() {
		return new WIContainer();
	}
	
	private void fillContainer(WIContainer wiContainer) {
		wiContainer.add(new Pen("pen1", 1.0f, 0.12f, "Blue"));
		wiContainer.add(new Pen("pen2", 1.5f, 0.16f, "Blue"));
		wiContainer.add(new Pen("pen3", 1.1f, 0.1f, "Black"));
		wiContainer.add(new Pencil("pencil1", 0.91f, 0.18f, "Wood5"));
		wiContainer.add(new Pencil("pencil2", 1.5f, 0.09f, "Wood18"));
		
		wiContainer.add(new Pen());
		wiContainer.add(new Pencil());
	}
	
	private void printContainer(WIContainer wiContainer) {
		wiContainer.printContent();
		WritingImplement.printAveragePrice();
		print("------------------------------");
	}
	
	private void sortContainer(WIContainer wiContainer) {
		wiContainer.sortByPrice();
	}
}