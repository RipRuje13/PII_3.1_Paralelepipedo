/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paralelepipedo;

/**
 *
 * @author Noriega
 */
public class Vector {
    private int x;
    private int y;
    private int z;
    
    public Vector(){
        x = 0;
        y = 0;
        z = 0;
    }
    
    public Vector(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public int getZ(){
        return z;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public void setZ(int z){
        this.z = z;
    }
    
    public void volumen(Vector v, Vector w){
        int a, b,c, det;
        //producto cruz
        a = y * v.getZ()- v.getY() * z;
        b = v.getX() * z - x * v.getZ();
        c = x * v.getY() - v.getX() * y;
        //producto punto 
        det = w.getX() * a + w.getY() * b + w.getZ() * c;
        
       System.out.println("El volumen es : "+Math.abs(det)+"u^3");
        
        
    }
    
    public String toString(Vector v, Vector w){
        return "Los vectores son: u=("+x+","+y+","+z+"), v=("
                                      +v.getX()+","+v.getY()+","+v.getZ()+"), w=("
                                      +w.getX()+","+w.getY()+","+w.getZ()+")";
    }
}

