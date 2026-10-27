

class Main {
    public static void main(String[] args) {

    for(int i =1; i<=3; i++)
        {
             // Left indentation
            for(int j=4 ; j>=i ; j--)
                {
                    System.out.print("  ");
                }
            // Left triangle: 1, 3, 5 stars
            for(int j=1 ; j<=2*i-1 ; j++)
                {
                    System.out.print("* ");
                }
            
            // Middle gap: 5, 3, 1 pairs of spaces
            for(int j=5 ; j>=2*i-1 ; j--)
                {
                    System.out.print("  ");
                } 
            
            // Right triangle: 1, 3, 5 stars
            for(int j=1 ; j<=2*i-1 ; j++)
                {
                    System.out.print("* ");
                }

             
            System.out.println();
        }

    for(int i=7 ; i>=1; i--)
        {
            // Left indentation
            for(int j=7 ; j>=i ; j--)
                {
                    System.out.print("  ");
                }
            
            // Triangle:
            for(int j=2*i-1 ; j>=1 ; j--)
                {
                    System.out.print("* ");
                }
            
            System.out.println();
        }



        
    }
}
