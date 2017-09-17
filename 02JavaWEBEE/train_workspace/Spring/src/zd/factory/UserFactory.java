package zd.factory;

import zd.model.User;

public class UserFactory {
	
	public static User getUser(){
		return new User(1,"����","123456");
	}

}
