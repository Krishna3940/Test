
public class stringmaniplation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="A quick brown fox jumps over the lazy dog ";
		System.out.println(str);
		int index=str.indexOf('d');
		System.out.println("the index of d is ="+ index);
		int indw=str.indexOf('w');
		indw=indw*2;
		char ch=str.charAt(indw);
		System.out.println("character at index twice the fist instance of  'w'="+ch);
		String s=str.substring(15,22);
		System.out.println("substring from index 15 to 22 is="+s);
		String uc=str.toUpperCase();
		System.out.println("String in uppercase="+ uc);
		int indu=str.lastIndexOf('u');
		System.out.println("last index of u="+indu);
		String append=str.concat("in the night");
		System.out.println("after append="+append);

	}

}
