import com.webservice.TestWS;
import com.webserviceimpl.TestWSImpl;

public class Test {

	public static void main(String[] args) {
		TestWSImpl factory = new TestWSImpl();
		TestWS tws = factory.getTestWSImplPort();
		tws.hello();
	}

}
