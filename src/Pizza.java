public class Pizza {
    String nombre;
    String[] ing = new String[3];
    public Pizza(String n, String i1, String i2, String i3){
        nombre=n; ing[0]=i1; ing[1]=i2; ing[2]=i3;
    }
    public String toString(){
        return nombre + " [" + ing[0] + ", " + ing[1] + ", " + ing[2] + "]";
    }
}