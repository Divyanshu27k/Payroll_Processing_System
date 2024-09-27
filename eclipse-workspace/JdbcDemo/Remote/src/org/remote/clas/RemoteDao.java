package org.remote.clas;

import java.util.*;

public class RemoteDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Remote");
		String type = sc.next();
		Remote sw = RemoteFactory.getRemote(type);
		if (sw != null) {
			sw.on();
			sw.off();
		}

	}

}
