import java.lang.reflect.Array;
import java.util.Arrays;

public class Point2D {
    // property
    private float posX=0.0f;
    private float posY=0.0f;
    // constructor
    public Point2D() {
    }

    public Point2D(float posX, float posY) {
        this.posX = posX;
        this.posY = posY;
    }
    // get and set
    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }

    // method
    public void setXY(float newPosX, float newPosY){
        this.posX= newPosX;
        this.posY= newPosY;
    }
    public float[] getXY(){
        float[] xy = new float[2];
        xy[0] = this.getPosX();
        xy[1] = this.getPosY();
        return xy;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXY());
    }
}
