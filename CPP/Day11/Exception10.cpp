 #include <iostream>  
#include <typeinfo> 
    using namespace std;  
    class Animal
    {
    	public:
    		virtual void move()=0;
    	
	};
	class eagle:public Animal
	{
		public:
    		virtual void move()
    		{
    			cout<<"flying";
			}
    	
		
	};
	class lion:public Animal
	{
		public:
    		virtual void move()
    		{
    			cout<<"running";
			}
    	
		
	};
	int main()
	{
	
		Animal * p_e=new eagle();
		Animal * p_l=new lion();
const	type_info& TypeId=typeid(*p_e);
		if(TypeId==typeid(eagle))
		cout<<"eagle";
	}	
	