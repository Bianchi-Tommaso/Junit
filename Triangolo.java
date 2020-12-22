public class Triangolo 
{
    public int A;
    public int B;
    public int C;
    
    public Triangolo()
    {
        A = 0;
        B = 0;
        C = 0;
    }
   
    public Triangolo(int A, int B, int C)
    {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    
    public void Calcolo()
    {
        int P = 0;
        double Area = 0;
        String s = Controllo();
        
        if(s.equals("Equilatero"))
        {
            P = A * 3;
            Area = (A * B) / 2;
            System.out.println("Il Perimetro E': " + P + " L'Area E': " + Area);
        }
        else if(s.equals("Isoscele"))
        {
            P = A + 2 * B;
            Area = (A * B) / 2;
            System.out.println("Il Perimetro E': " + P + " L'Area E': " + Area);
        }
        
        else if(s.equals("Scaleno"))
        {
            P = A + B + C;
            Area = (A * B) / 2;
            System.out.println("Il Perimetro E': " + P + " L'Area E': " + Area);
        }
        
    }
    
    public String Controllo()
    {
        String s = "";
        
        if(A == B && C == A)
        {
            System.out.println("Il Triangolo E' Equilatero: ");
            s = "Equilatero";
        }
        else if(A != B && C != B && A != C)
        {
            System.out.println("Il Triangolo E' Scaleno: ");
            s = "Scaleno";
        }
        else if(A != C && C == B)
        {
            System.out.println("Il Triangolo E' Isoscele: ");
            s = "Isoscele";
        }
        
        return s;
    }
}
