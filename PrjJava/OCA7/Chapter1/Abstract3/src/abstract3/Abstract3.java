/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract3;

/**
 *
 * @author andad
 */
interface I { 
  int getI(int a, int b); 
}

interface J{
    int getJ(int a, int b, int c);
}

abstract class MyIJ implements J , I { }

class Abstract3{ 
    int getI(int x, int y){ return x+y; }
}

interface K extends J{
    int getJ(int a, int b, int c, int d);
}