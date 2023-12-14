package com.exception;

public class UncheckedHandling {
	public static void main(String[] args) throws UserNotFoundException {
		User user = new User(2,"Allen", "NY");
		user.setId(2);
		user.setName("Allen");
		user.setAddress("NY");
		if(user.getId()== 1) {
			throw new UserNotFoundException("User not Present");
		}else {
			System.out.println(user.getId()+","+user.getName()+","+user.getAddress());
		}
	}
}
