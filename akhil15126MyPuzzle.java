import java.util.*;


public class akhil15126MyPuzzle
{
int[][] a;
int highest;
int b[];
LinkedList l;
akhil15126MyPuzzle()
{
int i, j;
highest=0;
l=new LinkedList();
a=new int[4][4];
b=new int[2];
b[0]=2;
b[1]=4;
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
a[i][j]=0;
}

}

void moveLeft()
{
int i, j, k;
for(i=0;i<4;i++)
{
k=0;
for(j=0;j<4;j++)
{
if(a[i][j]!=0)
a[i][k++]=a[i][j];
}
for(j=k;j<4;j++)
a[i][j]=0;
for(j=1;j<4;j++)
{
if(a[i][j]==a[i][j-1])
{
a[i][j-1]=2*a[i][j-1];
if(a[i][j-1]>highest)
highest=a[i][j-1];
a[i][j]=0;
j++;
}

}


k=0;
for(j=0;j<4;j++)
{
if(a[i][j]!=0)
a[i][k++]=a[i][j];
}
for(j=k;j<4;j++)
a[i][j]=0;


}
}






void moveRight()
{
int i, j, k;
for(i=0;i<4;i++)
{
k=3;
for(j=3;j>=0;j--)
{
if(a[i][j]!=0)
a[i][k--]=a[i][j];
}
for(j=k;j>=0;j--)
a[i][j]=0;
for(j=1;j<4;j++)
{
if(a[i][j]==a[i][j-1])
{
a[i][j-1]=2*a[i][j-1];
if(a[i][j-1]>highest)
highest=a[i][j-1];
a[i][j]=0;
j++;
}

}


k=3;
for(j=3;j>=0;j--)
{
if(a[i][j]!=0)
a[i][k--]=a[i][j];
}
for(j=k;j>=0;j--)
a[i][j]=0;


}
}





void moveUp()
{
int i, j, k;
for(i=0;i<4;i++)
{
k=0;
for(j=0;j<4;j++)
{
if(a[j][i]!=0)
a[k++][i]=a[j][i];
}
for(j=k;j<4;j++)
a[j][i]=0;
for(j=1;j<4;j++)
{
if(a[j][i]==a[j-1][i])
{
a[j-1][i]=2*a[j-1][i];
if(a[j-1][i]>highest)
highest=a[j-1][i];
a[j][i]=0;
j++;
}

}


k=0;
for(j=0;j<4;j++)
{
if(a[j][i]!=0)
a[k++][i]=a[j][i];
}
for(j=k;j<4;j++)
a[j][i]=0;


}
}


void moveDown()
{
int i, j, k;
for(i=0;i<4;i++)
{
k=3;
for(j=3;j>=0;j--)
{
if(a[j][i]!=0)
a[k--][i]=a[j][i];
}
for(j=k;j>=0;j--)
a[j][i]=0;
for(j=1;j<4;j++)
{
if(a[j][i]==a[j-1][i])
{
a[j-1][i]=2*a[j-1][i];
if(a[j-1][i]>highest)
highest=a[j-1][i];
a[j][i]=0;
j++;
}

}


k=3;
for(j=3;j>=0;j--)
{
if(a[j][i]!=0)
a[k--][i]=a[j][i];
}
for(j=k;j>=0;j--)
a[j][i]=0;


}
}








void generateTile()
{
int i, j;
l.clear();
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
if(a[i][j]==0)
l.add(4*i+j);
}
}
int size=l.size();
if(isOver(size, highest)==1)
{
System.out.println("YOU WIN!");
System.exit(0);
}
else if(isOver(size, highest)==-1)
{
System.out.println("SORRY YOU LOST");
System.exit(0);
}
else if(hasWon(highest)==1)
System.out.println("YOU WIN!");
Random r=new Random();
Random r1=new Random();
int rr=(int)l.remove(r.nextInt(size));
//System.out.println(rr);
int rr1=b[r1.nextInt(2)];
a[rr/4][rr%4]=rr1;


}

int isOver(int s, int h)
{
if(s==0 && h>=2048)
return 1;
if(s==0 && h<2048)
return -1;
else
return 0;
}

int hasWon(int h)
{
if(h>=2048)
return 1;
else
return 0;
}

void displayGrid()
{
int i, j;
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
System.out.print(a[i][j]+" ");
System.out.println();

}
System.out.println();

}

}
