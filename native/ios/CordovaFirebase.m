#import <Cordova/CDV.h>
#import "CordovaFirebase.h"
@implementation CordovaFirebase 
    #pragma mark Cordova JS bridge
    - (void)pluginInitialize {
        [super pluginInitialize];
        [FIRApp configure];
    }
@end