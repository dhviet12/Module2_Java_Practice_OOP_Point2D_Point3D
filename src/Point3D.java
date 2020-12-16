import java.util.Arrays;

public class Point3D extends Point2D{
    // property
    private float posZ=0.0f;
     /// constructor
    public Point3D(float posX, float posY, float posZ) {
        super(posX, posY);
        this.posZ = posZ;
    }
    public Point3D(){
    }
     // get and set
    public float getPosZ() {
        return posZ;
    }

    public void setPosZ(float posZ) {
        this.posZ = posZ;
    }
    public void setPosXYZ(float newX,float newY,float newZ){
        super.setXY(newX,newY);
        this.posZ=newZ;

    }
    public float[] getXYZ(){
        float[] xyz= new float[3];
        xyz[0]= this.getPosX();
        xyz[1]= this.getPosY();
        xyz[2]= this.getPosZ();
        return xyz;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXYZ());
    }
}
