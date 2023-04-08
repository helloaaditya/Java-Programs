class program6a{
	public static void main (String[] args){
		try{
			int[] Num = {1,2,3};
			System.out.println(Num[100]);
		}

		catch(ArrayIndexOutOfBoundsException ad){
			System.out.println("Out of the range!!");
}
}
}