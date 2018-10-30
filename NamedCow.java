class NamedCow extends Cow
{
	private String myName;
	
	public NamedCow(String name, String type, String sound) {
	myName = name;
	myType = type;
	mySound = sound;
	}
	
	public String getName() {return myName;}

}