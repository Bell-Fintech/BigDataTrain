package nuc.sw.zd.logreg;

public class UploadClient2   {

	public static void main(String[] args) {
	     Client clientRunnable = new	Client ();  
		 ThreadPoolUtils.exxcute(clientRunnable);
	}
}
