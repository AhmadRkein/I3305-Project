package models;

public class HardDisk extends Product {
	private int Storage;
	private boolean isHdd;
	
	public int getStorage() {
		return Storage;
	}
	public void setStorage(int storage) {
		Storage = storage;
	}
	public boolean isHdd() {
		return isHdd;
	}
	public void setHdd(boolean isHdd) {
		this.isHdd = isHdd;
	}
}