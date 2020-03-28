package com.exceptionhandling.app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fileexample {

public static void main(String[] args) {
int n;
try {
FileReader r=new FileReader("in.txt");
FileWriter w= new FileWriter("tt.txt");
while ((n=r.read())!=-1) {
System.out.print((char)n);
w.write(n);
w.flush();
}

} catch (FileNotFoundException e) {
e.printStackTrace();
}
catch (IOException k) {
k.printStackTrace();
}

}

}