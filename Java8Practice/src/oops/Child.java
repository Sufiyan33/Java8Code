package oops;

class Child extends Parent {

	int i = 20;
	public Child() {
		System.out.println("Child class constructor");
	}

	public String test() {
		return " Hello Inheritence";
	}

	public static void main(String[] args) {
		// Child c = new Child();
		// Parent c = new Parent();
		// System.out.println("method return is ::" + c.test());
		// System.out.println("method return is ::" + ci.test());

		Parent c = new Child();
		System.out.println("method return is :: " + c.test());
		System.out.println("value of vaiable is :: " + c.i);
	}
}
