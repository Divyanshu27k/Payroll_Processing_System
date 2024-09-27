package org.remote.clas;

public class RemoteFactory {
    public static Remote getRemote(String type) {
        if (type.equalsIgnoreCase("Epson")) {
            return (Remote) new Epson();
        } else if (type.equalsIgnoreCase("Samsung")) {
            return (Remote) new Samsung();
        } else {
            System.out.println("No such remote");
            return null;
        }
    }
}