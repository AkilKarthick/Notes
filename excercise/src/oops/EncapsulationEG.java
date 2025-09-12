package oops;

public class EncapsulationEG {
	
	//private variable
	private String name;

	//using getter setter for accessig private variable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public static void main(String[] args) {
		
		EncapsulationEG p1 = new EncapsulationEG();
		p1.setName("Akilkarthic");
		System.out.println("p1 object name:" + p1.getName());
		

	}

}
