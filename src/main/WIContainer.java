package main;

import goods.WritingImplement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WIContainer {
	private List<WritingImplement> wi = new ArrayList<WritingImplement>();
	
	public void add(WritingImplement newWi) {
		wi.add(newWi);
	}
	
	public int getCount(){
		return wi.size();
	}
	
	public WritingImplement get(int index) {
		return wi.get(index);
	}
	
	public void sortByPrice() {
		Collections.sort(wi);
	}
	
	public void printContent() {
		for(WritingImplement wi : this.wi)
			Main.print(wi.toString());
	}
}