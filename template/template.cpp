
//Example of nontype template arguments.


//#include <iostream>  
//using namespace std;  
//template<class T, int size>  
//class A   
//{  
//    public:  
//    T arr[size];  
//    void insert()  
//    {  
//        int i =1;  
//        for (int j=0;j<size;j++)  
//        {  
//            arr[j] = i;  
//            i++;  
//        }  
//    }  
//      
//    void display()  
//    {  
//        for(int i=0;i<size;i++)  
//        {  
//        cout << arr[i] << " ";  
//        }  
//    }  
//};  
//int main()  
//{  
//    A<int,10> t1;  
//    t1.insert();  
//    t1.display();  
//    return 0;  
//}  
//

//class template contains one generic data type.

//#include <iostream>  
//     using namespace std;  
//     template<class T>
//    class A   
//    {  
//	public:
//         T a, b;  
//         public:  
//        void display(T,T);
//};
//  template<class T>
//
//          void A<T>:: display(T a ,T b)  
//          {  
//                 cout << "Values of a and b are : " << a<<" ,"<<b<<endl;  
//           }  
//   
//  
//      int main()  
//     {  
//           A<int> d;  
//           d.display(1,5);  
//           return 0;  
//     } 
//     
     
     
// class template contains two generic data type.
	 
//     #include <iostream>  
//     using namespace std;  
//     template<class T1, class T2>  
//    class Iet  
//    {  
//         T1 a;  
//         T2 b;  
//         public:  
//        Iet(T1 x,T2 y)  
//       {  
//           a = x;  
//           b = y;  
//        }  
//           void display()  
//          {  
//                 cout << "Values of a and b are : " << a<<" ,"<<b<<endl;  
//           }  
//      };  
//  
//      int main()  
//     {  
//           Iet<int,float> d(10,12.5);  
//           d.display();  
//           return 0;  
//     }  
