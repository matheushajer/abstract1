package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.print("Shape #" + i + " data:");
			System.out.print("Rectangle or circle (r/c)? ");
			char ver = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Color (BLACK/RED/BLUE): ");
			Color color = Color.valueOf(sc.next().toUpperCase());

			if (ver == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Heigth: ");
				double heigth = sc.nextDouble();

				list.add(new Rectangle(color, width, heigth));
			} else {
				System.out.println("Radius: ");
				double radius = sc.nextDouble();

				list.add(new Circle(color, radius));
			}

		}

		System.out.println("SHAPE AREAS:");
		for (Shape s : list) {
			System.out.println(String.format("%.2f", s.area()));
		}

		sc.close();
	}

}
