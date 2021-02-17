package Tests;
import static org.junit.jupiter.api.Assertions.*;
import javax.security.auth.login.AccountException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import code.AccList;
import code.Account;
class Test1 {
	@Test //аннотация, что это тест
	void test1() {
		Account myAcc = new Account();
		myAcc.setLogin("user1");
	}
	
	@Test 
	void test2() {
		Account myAcc = new Account("Ivanov", "user1", "123", 21, false);
		Assertions.assertEquals("Ivanov", myAcc.getFio());
		Assertions.assertEquals("user1", myAcc.getLogin());
		Assertions.assertEquals("123", myAcc.getPass());
		Assertions.assertEquals(21, myAcc.getAge());
		Assertions.assertFalse(myAcc.isOnline());
	}
	
	@Test 
	void testAccList() {
		AccList accList = new AccList();
	}

	
}
