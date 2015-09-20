package myClassForTest;

public class Runnable {

	  public static void main(String[] args) 
	  {
		    System.out.println("Hi, starting runup");
		    
		    MainDataContainer MdC = new MainDataContainer();
		    MainDataContainer.DataContainerHelper DcH = MdC.new DataContainerHelper(5);
		    MdC.ContHelper = DcH;
		    
	  }

}
