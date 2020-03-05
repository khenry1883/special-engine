/* This is the class that must be used as the type while creating an object of the StackQ class 
 * and for demonstrating the Queue operations from the driver class.
 * DO NOT USE PRIMITIVE WRAPPER CLASSES */
package Data;

public class DataClass {

	private String dataName;
	private int dataID;

	public DataClass(String dataName, int dataID) {
		super();
		this.dataName = dataName;
		this.dataID = dataID;
	}

	public String getDataName() {
		return dataName;
	}

	public void setDataName(String dataName) {
		this.dataName = dataName;
	}

	public int getDataID() {
		return dataID;
	}

	public void setDataID(int dataID) {
		this.dataID = dataID;
	}

	public String toString() {
		String str = "";
		str += "Data Name: " + getDataName() + " Data ID: " + getDataID();
		return str;
	}

}
