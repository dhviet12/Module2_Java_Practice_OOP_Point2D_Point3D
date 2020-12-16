public class Main {
    public static void main(String[] args) {
        // test Pos2d
        Point2D myPos2d= new Point2D();
        System.out.println(myPos2d.toString());  // 0 0
        myPos2d.setXY(22,33);
        System.out.println(myPos2d.toString()); // 22 33

        //test Pos3d
        Point3D myPos3d= new Point3D(30,40,50);
        System.out.println(myPos3d.toString()); // 30 40 50
        myPos3d.setPosX(3);
        System.out.println(myPos3d.toString()); // 3 40 50
        Point3D myPost3d2= new Point3D();
        myPost3d2.setPosXYZ(20,10,100); // 20 10 100
        System.out.println(myPost3d2.toString());


    }

}
