package testngsessions;

import org.testng.annotations.Test;

public class CRUDTest {
		
	
	public int addUser() {
		return 123;
		}
		
		public String getUser(int uid) {
		  return "user info for " +uid;
		}
		
		public String updateUser(int uid) {
		return "updated user info for " +uid;
		}
		
		public void deleteUser() {
		
		}
		@Test
		public void addUserTest() {
			 addUser();
		}
		
		@Test
		public void getUserTest() {
			int uid= addUser();
			String userInfo=getUser(uid);
			System.out.println(userInfo);
		}
		
		@Test
		public void updateUsereTest() {
			int uid=addUser();
			updateUser(uid);
			getUser(uid);
}
		}
	

