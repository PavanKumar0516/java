package com.exceptionhandling.app;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileinputstreamexa {

public static void main(String[] args)  {
String s;
FileInputStream fr=null;
FileOutputStream fo = null;
try {
int c;
fr=new FileInputStream("in.txt");
   fo=new FileOutputStream("inp.txt");
while ((c=fr.read()) != -1) {
System.out.print((char)c);
fo.write(c);
fo.flush();
}
}
catch (FileNotFoundException e) {
e.printStackTrace();
}
catch (IOException e) {
e.printStackTrace();
}
finally {

try {
fr.close();
fo.close();
} catch (IOException e) {

e.printStackTrace();
}
}

}
}