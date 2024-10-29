//#include<iostream>
//using namespace std;
//
//class base {
//private:
//    int private_variable;
// 
//protected:
//    int protected_variable;
// 
//public:
//    base()
//    {
//        private_variable = 10;
//        protected_variable = 99;
//    }
//     
//    
//    friend void friendFunction(base&);
//};
// 
// 
//
//void friendFunction(base & obj)
//{
//    cout<< "Private Variable: " << obj.private_variable<< endl;
//         
//    cout<< "Protected Variable: " << obj.protected_variable;
//}
// 
//
//int main()
//{
//    base object1;
//    
//    object1.friendFunction(object1);
// 
//    return 0;
//}


#include <iostream>
using namespace std;
 
//class base;
class anotherClass {
public:
    void memberFunction(base&);
};
 
// base class for which friend is declared
class base {
private:
    int private_variable;
 
protected:
    int protected_variable;
 
public:
    base()
    {
        private_variable = 10;
        protected_variable = 99;
    }
 
    // friend function declaration
    friend void anotherClass::memberFunction(base&);
};
 
// friend function definition
void anotherClass::memberFunction(base& obj)
{
    cout << "Private Variable: " << obj.private_variable
         << endl;
    cout << "Protected Variable: " << obj.protected_variable;
}
 
// driver code
int main()
{
    base object1;
    anotherClass object2;
    object2.memberFunction(object1);
 
    return 0;
}
