import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.net.ServerSocket;
import java.io.IOException;

@RunWith(JUnit4.class)
public class SocketIsolationTest {

	@Test
	public void shouldGiveEachTargetIsolatedPorts() throws InterruptedException, IOException {
		ServerSocket serverSocket = new ServerSocket(8080);
		Thread.sleep(5000L);
		serverSocket.close();
	}
}