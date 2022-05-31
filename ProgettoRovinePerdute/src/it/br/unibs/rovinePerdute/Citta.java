package it.br.unibs.rovinePerdute;

public class Citta {
	
	private String name;
	private int h,x,y,id;
	private int[] collegamenti;
	
	public Citta(String name, int h, int x, int y, int id, int[] collegamenti) {
		super();
		this.name = name;
		this.h = h;
		this.x = x;
		this.y = y;
		this.id = id;
		this.collegamenti = collegamenti;
	}

	public int[] getCollegamenti() {
		return collegamenti;
	}
	
	public int getCollegamento(int i) {
		return collegamenti[i];
	}

	public void setCollegamenti(int[] collegamenti) {
		this.collegamenti = collegamenti;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Citta [name=" + name + ", h=" + h + ", x=" + x + ", y=" + y + ", id=" + id + "]";
	}
	
	
}
