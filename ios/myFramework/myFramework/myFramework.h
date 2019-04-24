#import <Foundation/Foundation.h>
#include <time.h>

//! Project version number for myFramework.
FOUNDATION_EXPORT double myFrameworkVersionNumber;

//! Project version string for myFramework.
FOUNDATION_EXPORT const unsigned char myFrameworkVersionString[];

FOUNDATION_EXPORT time_t getMyCurrentTime() {
    time_t rawTime;
    time(&rawTime);
    return rawTime;
}

FOUNDATION_EXPORT char* getMyCurrentTimeText() {
    time_t time = getMyCurrentTime();

    struct tm * timeInfo;
    timeInfo = localtime(&time);
    return asctime(timeInfo);
}

// In this header, you should import all the public headers of your framework using statements like #import <myFramework/PublicHeader.h>

