
import java.util.ArrayList;
import java.util.List;

public class ListOfPolygons {

	public static int areaOfGeometricFigure(String name, int side, int height) {
		int result = 0;
		try {

			if (name == "Rectangle" && height != 0 && side != 0) {

				return result = height * side;
			}

			else if (name == "Rectangle" && height == 0 || side == 0) {

				throw new Exception("Rectangle not found");

			}
			if (name == "Square" && side != 0) {

				result = side * side;

			} else if (name == "Square" && side == 0) {
				throw new Exception("Square not found");
			}
			if (name == "Triangle" && height != 0 && side != 0) {

				return 1 / 2 * side * height;
			} else if (name == "Triangle" && side == 0 || height == 0) {

				throw new Exception("Triangle not found");
			}

		} catch (Exception e) {
			
			System.out.println(e);

		}
		return result;

	}

	public static void main(String[] args) {

		List<Polygons> geometricFigure = new ArrayList<Polygons>();
		geometricFigure.add(new Polygons("Rectangle", 4, 2));

		geometricFigure.add(new Polygons("Square", 4));

		geometricFigure.add(new Polygons("Triangle", 5, 10));

		System.out.println(areaOfGeometricFigure("Rectangle", 4, 5));

	}

}

