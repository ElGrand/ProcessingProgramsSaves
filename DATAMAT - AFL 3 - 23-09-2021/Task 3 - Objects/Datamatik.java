class Main {
	public static void main(String [] args) {
		Teacher myTeacher = new Teacher("Tess", 30, true);
		String s = myTeacher.toString();
		System.out.println(s);
	}
}