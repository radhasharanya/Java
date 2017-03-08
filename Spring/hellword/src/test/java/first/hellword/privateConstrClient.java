package first.hellword;

import java.lang.reflect.Constructor;

public class privateConstrClient {

	public static void main(String[] args) {
		try {
			Class c= Class.forName("first.hellword.PrivateConstr");
			Constructor con[]=c.getDeclaredConstructors();
				con[0].setAccessible(true);
				con[0].newInstance(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
