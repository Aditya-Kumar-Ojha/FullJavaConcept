package com.greatlearning.corejava;

public class ThreeDimensionShape
{
	 double width, height, depth;
	ThreeDimensionShape()
	{
		double length=0;
		 width=0;
		 depth = 0;
	}
	ThreeDimensionShape(double length)
	{
		width = height = depth = length;
	}
	ThreeDimensionShape(double width,double height,double depth)
	{
		
	}
	 double volume()
	    {
	        return width * height * depth;
	    }
	 
	public static void main(String[] args)
	  { 

        // create boxes using the various 

        // constructors 

     ThreeDimensionShape shape1 = new ThreeDimensionShape(5, 6, 7); 

     ThreeDimensionShape shape2 = new ThreeDimensionShape(); 

     ThreeDimensionShape shape3 = new ThreeDimensionShape(8); 

        double volume; 
        // get volume of first box 
        volume = shape1.volume(); 
        System.out.println(" Volume of shape1 is " + volume); 

        // get volume of second box 
        volume = shape2.volume(); 
        System.out.println(" Volume of shape2 is " + volume); 

        // get volume of cube 
        volume = shape3.volume(); 
        System.out.println(" Volume of shape3 is " + volume); 

    } 

} 
