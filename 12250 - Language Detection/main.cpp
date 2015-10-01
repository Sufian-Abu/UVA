
       /* 12250 - Language Detection */
        #include <iostream>
        #include <algorithm>
        #include <string>
        using namespace std;

        int main()
        {
           string str1("HELLO");
           string str2("HOLA");
           string str3("HALLO");
           string str4("BONJOUR");
           string str5("CIAO");
           string str6("ZDRAVSTVUJTE");
           int counter=1;
           string input;
           while(true)
           {


           cin >> input;
           if(input=="#")
           {
                break;
           }
           else
           {

           if(str1==input)
           {
               cout <<"Case"<<" " << (counter++)<<":"<<" " <<"ENGLISH" << endl;
           }
           else if (str2==input)
           {

              cout <<"Case"<<" " << (counter++)<<":"<<" " <<"SPANISH" <<endl;
           }
           else if (str3==input)
           {

               cout <<"Case"<<" " << (counter++)<<":"<<" " <<"GERMAN" <<endl;
           }
           else if (str4==input)
           {
               cout <<"Case"<<" " << (counter++)<<":"<<" " <<"FRENCH" << endl;

           }
           else if (str5==input)
           {
             cout <<"Case"<<" " << (counter++)<<":"<<" " <<"ITALIAN" <<endl;

           }
           else if (str6==input)
           {
               cout <<"Case"<<" " << (counter++)<<":"<<" " <<"RUSSIAN" << endl;

           }
           else
            {
            cout <<"Case"<<" " << (counter++)<<":"<<" " <<"UNKNOWN"<< endl;
           }
           }
           }
           return 0;

        }
