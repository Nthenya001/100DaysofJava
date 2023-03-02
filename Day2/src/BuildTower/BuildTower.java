package BuildTower;

public class BuildTower {
	public static String[] towerBuilder(int nFloors)
	{
//		we create an array called tower
		String[] tower = new String[nFloors];

//		this is basically the width of the star tower.
		int width = nFloors * 2 - 1;

//		if floors=3, the number of stars will be 1 on the first floor, 3 on the second floor, 5 on the last floor.
		for (int i = 0; i < nFloors ; i++) {
			int stars = i * 2 + 1;
			int spaces = (width - stars) / 2;
			
//			We then create a StringBuilder to build the string for the floor, and add the appropriate number of spaces and stars to it. Finally, we store the completed string in the tower array.
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < spaces ; j++) {
//				append() method appends an element to the end of the list.
				sb.append(" ");
			}
			for (int j = 0; j < stars ; j++) {
				sb.append("*");
			}
			for (int j = 0; j < spaces ; j++) {
				sb.append(" ");
			}
			tower[i] = sb.toString();
		}
		return tower;
	}
}
