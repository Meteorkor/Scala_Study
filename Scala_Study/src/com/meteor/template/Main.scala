package com.meteor.template

object Main {

  def main(args: Array[String]): Unit = {
    
    println("Hello World~!");
    
    
    /**
     * val : JAVA final or const
     * var : variable
     * 
     */
    
    var ob = new Sample("test")
    
    ob = new Sample("sss")
    
    println( "ob : " + ob );
    
  }

}