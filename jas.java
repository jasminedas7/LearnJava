class jas
{
	public static void main(String args[])
	{
		String paragraph = "mY NaMe Is KhAn. I am not terrorist";
		int indexOf = paragraph.indexOf(" ");
		System.out.println(indexOf);
		int lastIndex = paragraph.lastIndexOf(" ");
		System.out.println(lastIndex);
		boolean equals = paragraph.equals(" ");
		System.out.println(equals);
		boolean contains = paragraph.contains(" ");
		System.out.println(contains);
	}
}
