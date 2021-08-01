// this class is used to create an object under the CreateStorage, and allow the methods under CreateStorgae to be called separately
//this protects createStorage from modification
public class creationMain {

	public static void main(String[] args) {
			createStorage storage1= new createStorage();
		storage1.openFile();
		storage1.addRecords();
		storage1.closeFile();
	}

}
