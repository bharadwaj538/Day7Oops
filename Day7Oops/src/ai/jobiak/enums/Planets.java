package ai.jobiak.enums;

public enum Planets {
	Mercury("Grey",74.8),
	Venus("Brown&Grey",460.2),
	Earth("Blue",510.1),
	Mars("Red",144.8),
	Jupiter("Orange&Brown",61.42),
	Saturn("Golden",42.7),
	Uranus("Blue-Green",8.083),
	Neptune("Blue",7.618),
	Pluto("Brown",1188.3);
	
	String color;		
	double size;		
	Planets(String color,double size)		
	{
		this.color=color;		
		this.size=size;
	}
	String showColor()		
	{
		return this.color;
	}
	double showSize()
	{
		return this.size;
	}
	
	
}
