static void Krushkals()
{
 int a=b=u=v=0;
 int i,j,min;
 int mincost=0;
 int ne=1;
 while(ne<n){
  for(i=1,min=999;i<=n;i++){
     for(j=1;j<=n;j++){
     min=cost[i][j];
     a=u=i;
     b=v=j;
     }
   }
 }  
  u=find(u);
  v=find(v);
  if(u!=v)
  {
  uni(a,v
  SOP (" ne (a,b) is min);
  mincost=mincost+min;
  }
  cost[a][b]=cost[b][a]=999;
  }
  SOP("Mincost");
  static int find(int i){
  while(parent[i]!=0;
  i=parent[i];
  return i;
  }
  static int uni(int i,int j)
  {
  parent[j]=i;
  }
  }
  
  
