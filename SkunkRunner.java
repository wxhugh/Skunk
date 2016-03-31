class SkunkRunner {
	public static void main(String[] args) {
		SkunkSetup skunk = new SkunkSetup();
		skunk.playerSetup();
		System.out.println(skunk.toString());
		skunk.roll();
		
	}
}