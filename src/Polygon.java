public class Polygon {

/*The formula to calculate the area of a regular polygon is, Area = (number of sides × length of one side × apothem)/2,
where the value of apothem can be calculated using the formula,
Apothem = [(length of one side)/{2 ×(tan(180/number of sides))}].
2A = (x1y2 - x2y1) + (x2y3 - x3y2) + (x3y4 - x4y3) + (x4y1 - x1y4)
2A = (x1y2 - x2y1) + (x2y3 - x3y2) + (x3y4 - x4y3) + (x4y5 - x5y4) + (x5y1 - x1y5)
 */
    public static void main(String[] args) {
        Point1[] p1 = new Point1[5];
        p1[0] = new Point1(4,2);
        p1[1] = new Point1(1,5);
        p1[2] = new Point1(5,10);
        p1[3] = new Point1(7,2);
        p1[4] = new Point1(6,10);

            System.out.println(p1[0].x);

        double udreng = (p1[0].x*p1[1].y - p1[1].x* p1[0].y) + (p1[1].x * p1[2].y - p1[2].x * p1[1].y)
                + (p1[2].x * p1[3].y - p1[3].x * p1[2].y) + (p1[3].x * p1[4].y - p1[4].x * p1[3].y) + (p1[4].x * p1[0].y - p1[0].x * p1[4].y);

        System.out.println(udreng);
    }

}
class Point1 {
    double x;
    double y;

    Point1(double px, double py) {
        x = px;
        y = py;
    }

    double dist(Point p) {
        return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}