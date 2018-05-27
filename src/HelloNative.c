
#include "HelloNative.h"
#include <stdio.h>
 
JNIEXPORT void JNICALL Java_HelloNative_displayHelloWorld()
{
    printf("Hello,JNI");  
return;	
}
