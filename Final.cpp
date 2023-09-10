/* Kiran    Kadariya
  CSCI 201-54
  Project 01 Question 05
  */

//Using the header files!!
#include<iostream>
#include<fstream>
#include<string>
#include<iomanip>
using namespace std;


char grad(float totl)     //Function to determine student's Grade.
{ 
  
  char A, B, C, D, F, Z;
  
  if(totl>90 || totl==90)
    return 'A';
  else if(totl>80 || totl==80)
         return 'B';
  else if(totl>70 || totl==70)
         return 'C';
  else if(totl>60 || totl == 60)
         return 'D';
  else if(totl<60 && totl>0)
         return 'F';
  else
     return 'Z';

  }

float testScore(istream& infile)  // Function to calculate test score
{
  float tot=0, test=0;
  bool error=false;
  
  for ( int j=1; j<=3; j++)
  { 
    infile>>test;
    
    if( (test<0) || (test>100))
    {
      error = true;
     }
    
    tot +=test;
    
   }
    
   infile>>test;
   tot = (tot + 2*test)/10;

  if(error)
     return -1;

  return tot;
  }


float hworkScore(istream& infile)   //Function to calculate homework score
{
 float total = 0, hw, least =0;
 bool error = false;

 infile>>hw;
 least = hw;

 for( int i =1; i<=9; i++)
  {
   
   if ((hw<0) || (hw>100))
      error = true;

   total += hw;
   
   if ( hw < least)
      least = hw;

   infile>>hw;
   }
  total +=hw;
  total = (total - least);

  if(error)
   return -1;

  return total;
  }

void printRecord (string name,  string Id, float hwscore, float testscore, 
		  float finalscore, char grade, ostream& outfile) 		//Function to print output
{
 outfile<<setw(12)<<left<<name 			   //Left aligned with width 12
 	<<setw(10)<<Id;

 if(hwscore == -1 || testscore == -1)               // To print the value as -1.0 instead of -1.00
   {
    outfile<<setw(8)<<fixed<<setprecision(1)<<hwscore   //Prints the decimal even if its zero
           <<setw(8)<<testscore
           <<setw(8)<<finalscore;
    }
 else
    {
    outfile<<setw(8)<<fixed<<setprecision(2)<<hwscore   
           <<setw(8)<<testscore
           <<setw(8)<<finalscore;
     }
 outfile<<setw(8)<<grade<<endl;
}

int main()   //Main function
{
 ofstream outfile;
 ifstream infile;

 string file_name, Id, name, record;
 char grade = 'Z';
 float hw = 0, ca = 0, hwscore = 0, testscore = 0, totalscore = 0;
 
 cout<<"Please enter the name of the file: ";
 cin>>file_name;
 infile.open(file_name.c_str());

 if (!infile)  //If file cannot be opened, it terminates the program.
 {
  cout << "Could not open output file \n";
  return 0;
  }

 outfile.open("Grade.txt");   //Saves output file as Grade.txt
 
 if (!outfile)
 {
  outfile << "Could not open output file \n";
  return 0;
  }



 infile>>name;       //Try to read a name;
 
 while(!infile.eof())
 { 
   infile >> Id;              //Read Id
   hw = hworkScore(infile); //Calling the hworkScore function
   infile >> ca;           //Read next number as class participation
   hwscore = (ca + hw)*50/1000;   //calculates the total hw and class participation score out of 50.
   
   if (hw == -1 || (ca<0 || ca>100) )  //Checking error!!!
       hwscore = -1;
 
  testscore = testScore(infile); //Calculate the testscore by calling testScore function

  totalscore = hwscore + testscore;  //Calculate the total score
   // Compute grade (function not written)

   if (hwscore == -1 || testscore == -1) //Checking error!!!
      totalscore = -1;

   grade = grad(totalscore);  //Calculates grade calling grad function
    

   printRecord(name, Id, hwscore, testscore, totalscore, grade, outfile); //Calling function to print output
   getline(infile, record); //Consumes the rest of the line
   infile >> name; //Try to read another name
 
 }

 infile.close();  //Closes the input file
 outfile.close(); //Closes the output file

 return 0;

}
