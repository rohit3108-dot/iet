//#include<iostream>
//using namespace std;
//#include<string.h>
//
//class Account
//{
//	public:
//	int accno;
//	char name[10];
//	static float rateOfInterest;
//	
//		
//		Account(int accno, char* name )
//		{
//			this->accno=accno;
//			
//			strcpy(this->name,name);
//			
//		}
//	void display()
//	{
//		
//		cout<<accno<<" "<<name<<" "<<rateOfInterest<<endl;
//	}
//	
//	
//};
//
//float Account::rateOfInterest=6.5;
//int main()
//{
//	Account a1(101,"rohit");
//	Account a2(202,"roshan");
//	a1.display();
//	a2.display();
//	
//	return 0;
//}

//Exercise 1
//#include<iostream>
//using namespace std;
//class complex
//{
//	int real, img;
//	public: static const  int cnt;
//	private: static const int cnt1;
//	public:
//		    complex()
//		    {
//		    	cout<<"default is invoked\n";
//		    	real=5;
//		    	img=5;
//		    	cnt++;
//			}
//			static int getcnt()
//			{
//				return cnt1;
//			}
//};
//const int complex::cnt=5;
//const int complex::cnt1=10;
//int main()
//{
//	complex c1;
//	cout<<"no of object created is "<<complex::getcnt()<<endl;//
//	cout<<"sizeof obj is "<<sizeof(c1)<<endl;
//	cout<<complex::cnt;
//	
//}
//O/P;
//default is invoked
//no of object created=10
//sizeof(c1)=8
//cnt=5


////Exercise 2
//#include<iostream>
//using namespace std;
//
//class Test
//{
//	static int x;
//	public:
//		
//		
//		Test()
//		{
//			x++;
//		}
//		static int getx()
//		{
//          return x;			
//		}
//};
//int Test::x; 
//
//int main()
//{
//	
//
//	cout<<Test::getx()<<" ";
//	
//}

//O/p
//
//x=0

//Exercise 3
//#include<iostream>
//using namespace std;
//
//class Player
//{
//	int Id;
//	static int bat_id;
//	
//	public:
//		
//		Player()
//		{
//			Id=bat_id++;
//			/
//		}
//	   int getid()
//	   {
//	   	return Id;
//	   	
//	   }
//	
//};
//
//int Player::bat_id=1;
//
//int main()
//{
//	Player P1;
//	Player P2;	
//	Player P3;
//	cout<<P1.getid()<<endl;
//    cout<<P2.getid()<<endl;
//	cout<<P3.getid();
//	
//	return 0;
//}
//
//O/P
//1
//2
//3

//Exercise 1


//#include <iostream>
//using namespace std;
// class Point 
// {
//    
//    Point() 
//	{ cout << "Constructor called"; }
//};
//int main()
//{
//    Point t1;
//    return 0;
//}
//O/P
//constructor is private


//Exercise 2

//#include <iostream>
//using namespace std;
//
//class Point {
//public:
//    Point() 
//	{ 
//	cout << "Constructor called";
//	 }
//};
//int main()
//{
//   Point t1, *t2;
//   return 0;
//}
//
//O/P
//
//only one time constructor called.


//Exercise 3
//#include <iostream>
//using namespace std;
//#include<stdlib.h>
//
// class Test 
//{ 
//public: 
//   Test() 
//   { cout << "Constructor called"; } 
//}; 
// int main() 
//{ 
//    Test *t = (Test *) malloc(sizeof(Test)); 
//    return 0; 
//} 
//
//O/P
//No constructor called because no object created.


//Exercise 4
//#include <iostream>
//using namespace std;
//
//class temp
//{
//	int z;
//	static int y;
//public:
//	temp();
//	void show();
//	void display();
//};
//int x;
//int temp::y;
//void temp::show()
//{
//	y++;
//}
//temp::temp()
//{
//	int z=200;
//	x=100;
//	cout<<"value of z is "<<z<<endl;
//}
//void temp::display()
//{
//	cout<<"value of x is "<<x<<endl;
//	cout<<"value of y is  "<<y<<endl;
//}
//int main()
//{
//	temp t;
//	t.show();
//	t.show();
//	t.display();
//	cout<<sizeof(t);
//}


//O/P
//200
//100
//2
//4 -static member do not contribute to the size of object



//Exercise 5

//#include<iostream>
//using namespace std;
//class item
//{
//public:
//	static int x;
//	int number;
//public:
//	void getdata(int a)
//	{
//		number=a;
//		number++;
//		x++;
//	}
//	void getcount()
//	{
//		x=10;
//		cout<<"value is "<<x<<endl;
//	}
//	void getcount_1()
//	{
//		x++;
//		cout<<"value is  "<<number<<endl;
//		cout<<"value is "<<x<<endl;
//	}
//};
//int number=9;
//int item::x;
//int main()
//{
//	item a;
//	a.getcount();
//	a.getdata(100);
//	a.getcount_1();
//	cout<<number<<endl;
//	cout<<a.number;
//}

//O/P
//10
//101,12
//9
//101
