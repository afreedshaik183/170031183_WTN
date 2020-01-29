import java.util.*;
import java.io.*;
class Box{
double height;
double width;
double depth;
public Box(double height,double width,double depth)
{
this.height=height;
this.width=width;
this.depth=depth;
}
public void volume()
{
System.out.println(height*width*depth);
}
}
public class P41{
public static void main(String[] args){
Box a=new Box(5.2,6.8,2.5);
a.volume();
}
}
