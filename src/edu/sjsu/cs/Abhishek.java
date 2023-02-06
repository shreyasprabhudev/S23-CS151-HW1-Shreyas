import java.util.*;

class A {
	public void main() {
		ArrayList array = new ArrayList();
	}

	public static void main(String[] args) {
		System.out.println("from class A");
	}
}

class B {
	public static void main(String[] args) {
		System.out.println("from class B");
	}
}

class C {
	public static void main(String[] args) {
		if (args[0].equals("logs"))
			System.out.println("showing logs");
	}
}


