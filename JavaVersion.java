/*
 * Program to check java version and other
 */

public class JavaVersion {
	public static void main(String[] args) {
		System.out.println("Java version: " + System.getProperty("java.version"));
		System.out.println("Java runtime version: " + System.getProperty("java.runtime.version"));
		System.out.println("Java Home: " + System.getProperty("java.home"));
		System.out.println("Java vendor: " + System.getProperty("java.vendor"));
		System.out.println("Java vendor URL: " + System.getProperty("java.vedor.url"));
		System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
	}
}
