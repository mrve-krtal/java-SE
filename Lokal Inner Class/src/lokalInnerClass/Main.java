package lokalInnerClass;

public class Main {

	public static void main(String[] args) {


		class Alan{
			public void daire_alan(int yaricap) {
				
				System.out.println("Dairenin Alan�: "+(yaricap*yaricap*Math.PI));
			}
		}
		
		Alan alan=new Alan();
		Alan alan2=new Alan(); 
		
		alan.daire_alan(6);
		alan2.daire_alan(4);
		
	}
	
	public static void deneme() {
		
		//Alan alan1=new Alan();
		//Main class'�n i�indeki local class'a eri�emiyoruz..
	}
	

}
