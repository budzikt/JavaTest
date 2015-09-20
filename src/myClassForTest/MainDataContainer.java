package myClassForTest;

import java.util.Date;

public class MainDataContainer {
	static private int StaticCnt;
	public Date date;
	DataContainerHelper ContHelper;
	
	public class DataContainerHelper {
		public DataContainerHelper(int helperInt) {
			HelperInt = helperInt;
		}

		int HelperInt;
		
	}
}






