package com.antra.conversion.roles;

/**
 * @author Sivakanth
 */
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetOfUserToSetOfString {

	public static void main(String[] args) {

		Set<User> set = new LinkedHashSet<>();

		set.add(new User(110, "Manager"));
		set.add(new User(111, "Admin"));
		set.add(new User(112, "Trainer"));
		set.add(new User(113, "Developer"));
		set.add(new User(114, "Team Leader"));
		set.add(new User(115, "Tester"));

		System.out.println(set);

		Set<String> newSet = set.stream().map(t -> t.getRole()).collect(Collectors.toSet());

		System.out.println(newSet);

	}
}