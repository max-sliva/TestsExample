package Tests;
import static org.junit.jupiter.api.Assertions.*;
import javax.security.auth.login.AccountException;
import org.junit.jupiter.api.Test;
import code.Account;
class test1 {
	@Test //аннотация, что это тест
	void test1() {
		Account myAcc = new Account();
		myAcc.setLogin("user1");
	}
	
}
