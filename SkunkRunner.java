class SkunkRunner {
	public static void main(String[] args) {
		SkunkSetup skunk = new SkunkSetup();
		skunk.playerSetup();
		skunk.roll();
		System.out.println(skunk.toString());
	}
}