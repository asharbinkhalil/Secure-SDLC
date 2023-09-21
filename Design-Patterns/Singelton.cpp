#include<iostream>
//k201724
//Ashar Khalil
using namespace std;

class logger {
private:

	string data, IP;
	static logger* instancePtr;
	logger()
	{
	}

public:
	logger(const logger& obj)= delete;

	static logger* getInstance()
	{
		if (instancePtr == NULL)
		{
			instancePtr = new logger();
			return instancePtr;
		}
		else
			return instancePtr;
	}

	void setValues(string data,string IP)
	{
		this->data = data;
		this->IP = IP;
	}

	void log()
	{
		cout << "DATA: "<< data << " IP " << IP << "." << endl;
	}

};

logger* logger::instancePtr = NULL;

// Driver code 
int main()
{
	logger* obj1= logger::getInstance();

	obj1->setValues("Network","1.2.3.4");
	obj1->log();

	cout << "Address of obj1: " <<obj1 << endl;
	cout << endl;

	logger* obj2 = logger::getInstance();
	obj2->setValues("SIEM","8.8.8.8");
	obj2->log();

	cout << "Address of obj2: " << obj2 << endl;
	return 0;
}