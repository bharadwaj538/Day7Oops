package ai.jobiak.enums;

public class UsePlanets {

	public static void main(String[] args) {
		
		Planets ref;
		ref=Planets.valueOf("Mercury");
		System.out.print(ref);
		System.out.println(" is the "+ref.showColor()+" color Planet");
		ref=Planets.valueOf("Venus");
		System.out.print(ref);
		System.out.println(" is the "+ref.showColor()+" color Planet");
		System.out.println("These Planets are rotated around the sun");
		for(Planets planet: Planets.values())
		{
			System.out.println("The "+planet.ordinal()+" Planet Name : "+planet+", color : "
			+planet.showColor()+"---- Size of planet : "+planet.showSize()+" Million sqkm ");
		}
		
	}

}
