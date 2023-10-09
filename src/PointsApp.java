// Opgave Points
// BjÃ¸rn Christensen, 16/3-2020
import java.util.ArrayList;
import java.util.Random;

    public class PointsApp {
        public static void main(String[] args) {
            Point p1=new Point(10,2);
            Point p2=new Point(4,7);
            Point p3=new Point(1,-3);

            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);

            double d12=p1.dist(p2);
            double d23=p2.dist(p3);
            double d31=p3.dist(p1);

            System.out.println("Dist p1-p2="+d12);
            System.out.println("Dist p2-p3="+d23);
            System.out.println("Dist p3-p1="+d31);

            double mindist=min(d12, min(d23,d31));
            System.out.println("Min dist="+mindist);
            System.out.println();

            // Extra
            Random generator=new Random();
            ArrayList<Point> list=new ArrayList<Point>();
            for (int i=0; i<10; i++) {
                list.add(new Point(generator.nextInt(100), generator.nextInt(100)));
            }

            double cx=0; 				// x-coordinate for center of mass
            double cy=0; 				// y-coordinate for center of mass
            double top=0;				// Top of bounding rectangle
            double bottom=100;	// Bottom of bounding rectangle
            double right=0;			// Right side of bounding rectangle
            double left=100;		// Left side of bounding rectangle
            for (Point p: list) {
                System.out.println(p);
                cx=cx+p.x;
                cy=cy+p.y;
                if (p.y>top) top=p.y;
                if (p.y<bottom) bottom=p.y;
                if (p.x>right) right=p.x;
                if (p.x<left) left=p.x;
            }
            Point centerOfMass=new Point(cx/list.size(), cy/list.size());
            System.out.println("Center of mass: "+centerOfMass);
            Point topLeft=new Point(left, top);
            Point topRight=new Point(right, top);
            Point bottomLeft=new Point(left, bottom);
            Point bottmRight=new Point(right, bottom);
            System.out.println("topLeft: "+topLeft);
            System.out.println("topRight: "+topRight);
            System.out.println("bottomLeft: "+bottomLeft);
            System.out.println("bottmRight: "+bottmRight);
        }

        static double min(double a, double b){
            if (a<b)
                return a;
            else
                return b;
        }

    }

    class Point {
        double x;
        double y;

        Point(double px, double py){
            x=px;
            y=py;
        }

        double dist(Point p) {
            return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
        }

        public String toString() {
            return "("+x+","+y+")";
        }
    }


