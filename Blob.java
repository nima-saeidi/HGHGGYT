public class Blob {
    // NIMA SAEIDI / SANA GHORBANI / SANA GHOLINAVAZ / BITA RAZPOOR
    private double sunY=0;
    private  double sumX=0;
    private int mass=0;
    public Blob(){}
    public void add(double x, double y){
        mass++;
        sumX= Math.round((((sumX*mass)+x)/(mass+1))*10000.0)/10000.0;
        sunY=Math.round((((sunY*mass)+y)/(mass+1))*10000.0)/10000.0;
    }
    public int mass(){  return mass; }

    public double distinceTo(Blob blob){
        double x= blob.sumX/ blob.mass;
        double y= blob.sunY/ blob.mass;
        double cx=sumX/mass;
        double cy=sunY/mass;
        return Math.sqrt(Math.pow(x-cx,2)+Math.pow(y-cy,2));
    }
    public String ToString(){
        return String.format("%d ( %.4f , %.4f )",mass,sumX,sunY );
    }

    public static void main(String[] args){

    }

}
