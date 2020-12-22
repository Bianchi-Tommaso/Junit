public class ProgTriangolo 
{
    public static void main(String[] args) 
    {
        Triangolo t  = new Triangolo(3, 6, 7);
        Triangolo t2 = new Triangolo(3, 7, 7);
        Triangolo t3 = new Triangolo(3, 3, 3);
        
        t.Calcolo();
        t2.Calcolo();
        t3.Calcolo();
    }
    
}
