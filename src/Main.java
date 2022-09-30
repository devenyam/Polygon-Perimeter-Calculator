import java.util.Scanner;

public class Main {
    static class Polygon {
        int numOfSide, select;
        Scanner getInput = new Scanner(System.in);
        float length;
        String[] arrPolygons = {
                "Triangle", "Quadrilateral",
                "Pentagon", "Hexagon",
                "Heptagon", "Octagon",
                "Nonagon", "Decagon"
        };

        float getLength() {
            System.out.print("Enter the length of sides: ");
            length = getInput.nextFloat();
            return length;
        }

        public float calcPerimeter() {
            System.out.println("Number of side: " + numOfSide);
            return (float) numOfSide * getLength();
        }

        public float  Triangle() {
            numOfSide = 3;
            return calcPerimeter();
//            return numOfSide * getLength();
        }

        public float Quadrilateral() {
            numOfSide = 4;
            return calcPerimeter();
//            return numOfSide * getLength();
        }

        public float Pentagon() {
            numOfSide = 5;
            return calcPerimeter();
//            return (float) numOfSide * getLength();
        }

        public float Hexagon() {
            numOfSide = 6;
            return calcPerimeter();
//            return (float) numOfSide * getLength();
        }

        public float Heptagon() {
            numOfSide = 7;
            return calcPerimeter();
//            return (float) numOfSide * getLength();
        }

        public float Octagon() {
            numOfSide = 8;
            return calcPerimeter();
//            return (float) numOfSide * getLength();
        }

        public float Nonagon() {
            numOfSide = 9;
            return calcPerimeter();
//            return (float) numOfSide * getLength();
        }

        public float Decagon() {
            numOfSide = 10;
            return calcPerimeter();
//            return (float) numOfSide * getLength();
        }

        public void  polygonList() {
            int index = 1;
            for (String arrPolygon : arrPolygons)
                System.out.println(index++ + ". " + arrPolygon);
        }
        public void  polygons () {
            polygonList();
            System.out.print("Select the polygon from the list: ");


            while(true) {
                select = getInput.nextInt();
                if(select == 0 || select > 10) {
                    System.out.println("Invalid input. Select number from 1 - 9: ");
                    System.out.print("Select polygon: ");
                }
                else {
                    System.out.println("You selected " + arrPolygons[select - 1]);
                    break;
                }
            }
        }
        public float result() {
            polygons();
            return switch (select) {
                case 1 -> Triangle();
                case 2 -> Quadrilateral();
                case 3 -> Pentagon();
                case 4 -> Hexagon();
                case 5 -> Heptagon();
                case 6 -> Octagon();
                case 7 -> Nonagon();
                case 8 -> Decagon();
                default -> 0;
            };
        }
    }

    public static void main(String[] args) {
        System.out.println("---------POLYGON PERIMETER CALCULATOR---------");
        Polygon polygon = new Polygon();
        System.out.println(polygon.result() + "cm");
    }
}