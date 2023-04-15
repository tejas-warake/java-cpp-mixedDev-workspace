// Native methods implementation of
// C:/Users/tswar/OneDrive/Documents/NetBeansProjects/JavaApplication1/src/test/Test1.java

#include "Test1.h"
#include <iostream>

JNIEXPORT void JNICALL Java_test_Test1_sayHi 
    (JNIEnv *jvm, jclass Test1_class) {
    std::cout << "Hello from C++!" << std::endl;
}

/*
 * Class:     test_Test1
 * Method:    sayHiToMeAndGoodbye
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_test_Test1_sayHiToMeAndGoodbye
  (JNIEnv *jvm, jclass Test1_class) {
    std::cout<<"Hello from C++! Bye!!" << std::endl;
}
