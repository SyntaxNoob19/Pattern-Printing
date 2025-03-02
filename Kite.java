class Kite
{
public static void main(String []args)
{


for(int i=0;i<=5;i++)
{
for(int j=4;j>=i;j--)
{
System.out.print("  ");
}
for(int j=1;j<=(2*i-1);j++)
{
if (j == 1 || j == (2 * i - 1)|| j == i || j == (2 * i - i)|| i==5) 
{
System.out.print(" *");
} 
else 
{
System.out.print("  ");
}
}
System.out.println();
}



for(int i=4;i>=0;i--)
{
for(int j=4;j>=i;j--)
{
System.out.print("  ");
}
for(int j=(2*i-1);j>=1;j--)
{
if (j == 1 || j == (2 * i - 1)|| j == i || j == (2 * i - i)) 
{
System.out.print(" *");
} 
else 
{
System.out.print("  ");
}
}
if(i!=1)
System.out.println();
}



for(int i=1;i<=10;i++)
{
for(int j=1;j<4;j++)
{
System.out.print("   ");
}
for(int j=1;j<=10;j++)
{
if (j == i) 
{
System.out.print("  *");
} 
else 
{
System.out.print("  ");
}
}
System.out.println();
}


}
}