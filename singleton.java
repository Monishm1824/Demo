class A
{
	//step 3 : create one class referance(public and static)
	public static PrimeMinister pm=null;
	
	//step 1 : make the constructor private
	private PrimeMinister()
	{
		
	}
	//step 2 : create one static method return type will be classtype
	
	public static PrimeMinister getPm()
	{
		if(pm==null)
			pm=new PrimeMinister();
		return pm;
	}
	
}