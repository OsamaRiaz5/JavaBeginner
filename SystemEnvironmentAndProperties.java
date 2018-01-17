/*
 * Program to get the current system environment and system properties.
 */

public class SystemEnvironmentAndProperties {
	public static void main(String[] args) {
		System.out.println("System environment: ");
		System.out.println(System.getenv());
		System.out.println("\nSystem properties: ");
		System.out.println(System.getProperties());
	}

}
