class jas
{
	public static void main(String args[])
	{
		String paragraph = "    mY NaMe Is KhAn    ";
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
        boolean endsWith = paragraph.endsWith("n");
        System.out.println(endsWith);
    	System.out.println(paragraph);
        System.out.println(paragraph.trim());
        
        String[] splitByName = paragraph.split("NaMe");
        System.out.println(paragraph.split("NaMe"));


	}
}
