class jas
{
	public static void main(String args[])
	{
		String paragraph = "mYNaMeIsKhAn";
		int indexOf = paragraph.indexOf(" ");
		System.out.println(indexOf);
		int lastIndex = paragraph.lastIndexOf(" ");
		System.out.println(lastIndex);
		boolean equals = paragraph.equals(" ");
		System.out.println(equals);
		boolean contains = paragraph.contains(" ");
		System.out.println(contains);
		boolean startsWith = paragraph.startsWith(" ");
		System.out.println(startsWith);

	}
}
