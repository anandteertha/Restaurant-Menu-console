import java.util.Scanner;
class Menu
{
Scanner sc=new Scanner(System.in);
String food [  ]={
"",
"pav bhaji",
"vada pav",
"samosa pav",
"cheese pizza",
"sada dosa",
"masala dosa",
"idli vada",
"chapati",
"chole bature",
"palak paneer",
"paneer kofta",
"paneer kohlapuri",
"harabara kebab",
"veg crispy",
"hakka noodles",
"american choupsey",
"cheese paratha",
"paneer paratha",
"cheese pakoda",
"paneer pakoda",
"sandwich",
"cheese sandwich",
"grilled sandwich",
"chineese bhej",
"mosambi juice",
"watermelon juice",
"strawberry juice",
"falooda",
"icecream(any)",
"softdrinks(any)"
};
int cost1[]={
100,25,30,120,40,55,35,9,60,100,130,125,75,80,120,95,40,37,60,60,40,50,60,30,30,30,30,100,80,80};
int quantity;
int choice;
public double display_menu()
{
int array_of_choice[]=new int[100];
double price=0.00;
int i=0;
int cost;
int doagain;
do
{
System.out.println("1.pav bhaji        \t\t100/-");
System.out.println("2.vada pav         \t\t 25/-");
System.out.println("3.samosa pav       \t\t 30/-");
System.out.println("4.cheese pizza     \t\t120/-");
System.out.println("5.sada dosa        \t\t 40/-");
System.out.println("6.masala dosa      \t\t 55/-");
System.out.println("7.idli vada        \t\t 35/-");
System.out.println("8.chapati          \t\t  9/-");
System.out.println("9.chole bature     \t\t 60/-");
System.out.println("10.palak paneer    \t\t100/-");
System.out.println("11.paneer kofta    \t\t130/-");
System.out.println("12.paneer kohlapuri\t\t125/-");
System.out.println("13.harabara kebab  \t\t 75/-");
System.out.println("14.veg crispy      \t\t 80/-");
System.out.println("15.hakka noodles   \t\t120/-");
System.out.println("16.american choupsey\t\t95/-");
System.out.println("17.cheese paratha  \t\t 40/-");
System.out.println("18.paneer paratha  \t\t 37/-");
System.out.println("19.cheese pakoda   \t\t 60/-");
System.out.println("20.paneer pakoda   \t\t 60/-");
System.out.println("21.sandwich        \t\t 40/-");
System.out.println("22.cheese sandwich \t\t 50/-");
System.out.println("23.grilled sandwich\t\t 60/-");
System.out.println("24.chineese bhej   \t\t 30/-");
System.out.println("25.mosambi juice   \t\t 30/-");
System.out.println("26.watermelon juice\t\t 30/-");
System.out.println("27.strawberry juice\t\t 30/-");
System.out.println("28.falooda         \t\t100/-");
System.out.println("29.icecream(any)   \t\t80/-");
System.out.println("30.softdrinks(any) \t\t60/-");
System.out.println("ENTER YOUR FOOD ITEM NUMBER");
choice=sc.nextInt();
array_of_choice[i]=choice;
i++;
switch(choice)
{
case 1:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=100;
price+=cost*quantity;
System.out.println("pav bhaji -"+cost+"/-");
int j;
for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 2:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=25;
price+=cost*quantity;
System.out.println("vada pav -"+cost+"/-");
for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 3:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=30;
price+=cost*quantity;
System.out.println("samosa pav -"+cost+"/-");
for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 4:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=120;
price+=cost*quantity;
System.out.println("cheese pizza -"+cost+"/-");
for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 5:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=40;
price+=cost*quantity;
System.out.println("sada dosa -"+cost+"/-");
for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 6:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=55;
price+=cost*quantity;
System.out.println("masala dosa -"+cost+"/-");
for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 7:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=35;
price+=cost*quantity;
System.out.println("idli vada -"+cost+"/-");
for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 8:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=9;
price+=cost*quantity;
System.out.println("chapati -"+cost+"/-");
for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 9:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=100;
price+=cost*quantity;
System.out.println("chole bature -"+cost+"/-");
for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;

case 10:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=100;
price+=cost*quantity;
System.out.println("palak paneer -"+cost+"/-");

for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 11:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=130;
price+=cost*quantity;
System.out.println("paneer kofta -"+cost+"/-");

for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 12:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=125;
price+=cost*quantity;
System.out.println("paneer kohlapuri -"+cost+"/-");

for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 13:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=75;
price+=cost*quantity;
System.out.println("harabara kebab -"+cost+"/-");

for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 14:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=80;
price+=cost*quantity;
System.out.println("veg crispy -"+cost+"/-");

for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 15:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=120;
price+=cost*quantity;
System.out.println("hakka noodles -"+cost+"/-");

for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 16:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=95;
price+=cost*quantity;
System.out.println("american choupsey -"+cost+"/-");

for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 17:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=40;
price+=cost*quantity;
System.out.println("cheese paratha -"+cost+"/-");

for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 18:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=37;
price+=cost*quantity;
System.out.println("paneer paratha -"+cost+"/-");

for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 19:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=60;
price+=cost*quantity;
System.out.println("cheese pakoda -"+cost+"/-");

for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 20:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=60;
price+=cost*quantity;
System.out.println("paneer pakoda -"+cost+"/-");

for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 21:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=40;
price+=cost*quantity;
System.out.println("sandwich -"+cost+"/-");
for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 22:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=50;
price+=cost*quantity;
System.out.println("cheese sandwich -"+cost+"/-");

for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 23:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=60;
price+=cost*quantity;
System.out.println("grilled sandwich -"+cost+"/-");

for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 24:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=30;
price+=cost*quantity;
System.out.println("chineese bhel -"+cost+"/-");

for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 25:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=30;
price+=cost*quantity;
System.out.println("mosambi juice -"+cost+"/-");

for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 26:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=30;
price+=cost*quantity;
System.out.println("watermelon juice -"+cost+"/-");

for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 27:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=30;
price+=cost*quantity;
System.out.println("strawbery juice -"+cost+"/-");

for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 28:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=100;
price+=cost*quantity;
System.out.println("falooda -"+cost+"/-");

for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 29:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=80;
price+=cost*quantity;
System.out.println("iceream(any) -"+cost+"/-");

for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
case 30:
System.out.println("quantity?");
quantity=sc.nextInt();
cost=60;
price+=cost*quantity;
System.out.println("softdrinks(any) -"+cost+"/-");
for(j=0;j<i;j++)
System.out.println(food[array_of_choice[j]]);
System.out.println("bill="+price);
break;
}
Menu m2=new Menu();
price=m2.delete(i,price,array_of_choice);
System.out.println("do you want to order something else??");
System.out.println("yes=1,no=0");
doagain=sc.nextInt();
}while(doagain!=0);
return price;
}
public double delete(int i,double price,int array_of_choice[])
{
System.out.println("do you want to delete anything from your order");
 System.out.println("yes=1,no=0");
int j,k;
int delete_choice=sc.nextInt();
if(delete_choice==1)
{
for(j=0;j<i;j++)
	{
	System.out.println(j+1+"."+food[array_of_choice[j]]);
	}
System.out.println("enter the corresponding number to delete the food item");
int num=sc.nextInt();
System.out.println("enter the quantity ");
int d_quantity=sc.nextInt();
price=price-cost1[array_of_choice[num-1]-1]*d_quantity;
System.out.println("the bill after deleting is ="+price);
}
return price;
}

public static void main(String args[])
{
double totalamount;
Menu m1=new Menu();
totalamount=m1.display_menu();

System.out.println("your bill is "+totalamount);
}
}
