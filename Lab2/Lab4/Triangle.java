package Lab2.Lab4;

public class Triangle {
    public int s1; 
    public int s2;
    public int s3;
    public int perimeter;
    public Triangle(int a, int b, inc c)
    s1=a;
    s2=b;
    s3=c;
    perimeter= s1+s2+s3;
}
public void triangleDetails(){
    System.out.println("Three side of the triangle are: "+s1+s2+s3);
}


public String printTriangle()
String msg="";
if (s1==s2 && s3){
    msg="This is an Equilaternal Triangle";
}
