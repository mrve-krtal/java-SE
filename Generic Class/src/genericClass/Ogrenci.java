package genericClass;

public class Ogrenci {

	private String isim;

	
	public Ogrenci(String isim) {
		super();
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	@Override
	public String toString() {
	
		return "isim :"+isim;
	}
	
}
