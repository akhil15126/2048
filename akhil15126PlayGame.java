import java.util.*;


public class akhil15126PlayGame
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);

akhil15126MyPuzzle pp=new akhil15126MyPuzzle();
char c;
pp.generateTile();
pp.displayGrid();
c=sc.next().charAt(0);
while(c!='Q')
{
if(c=='R')
{
pp.moveRight();
pp.generateTile();
pp.displayGrid();

}
else if(c=='L')
{
pp.moveLeft();
pp.generateTile();
pp.displayGrid();
}

else if(c=='U')
{
pp.moveUp();
pp.generateTile();
pp.displayGrid();
}

else
{
pp.moveDown();
pp.generateTile();
pp.displayGrid();
}

c=sc.next().charAt(0);
}
System.out.println("Good Bye!");

}

}