//
// Created by Vitaliy on 2019-04-25.
// Copyright (c) 2019 ___FULLUSERNAME___. All rights reserved.
//

#import <Foundation/Foundation.h>

#if !defined(OBJC_DESIGNATED_INITIALIZER)
# if __has_attribute(objc_designated_initializer)
#  define OBJC_DESIGNATED_INITIALIZER __attribute__((objc_designated_initializer))
# else
#  define OBJC_DESIGNATED_INITIALIZER
# endif
#endif

#if __has_attribute(warn_unused_result)
# define SWIFT_WARN_UNUSED_RESULT __attribute__((warn_unused_result))
#else
# define SWIFT_WARN_UNUSED_RESULT
#endif
#if __has_attribute(noreturn)
# define SWIFT_NORETURN __attribute__((noreturn))
#else
# define SWIFT_NORETURN
#endif

#if __has_attribute(noescape)
# define SWIFT_NOESCAPE __attribute__((noescape))
#else
# define SWIFT_NOESCAPE
#endif

#if !defined(SWIFT_EXTENSION)
# define SWIFT_EXTENSION(M) SWIFT_PASTE(M##_Swift_, __LINE__)
#endif

@interface ObjcData: NSObject

@property (nonatomic, copy) NSArray<NSNumber *> * _Nonnull items;

- (NSString * _Nonnull) helloWithName:(NSString * _Nonnull)name
                              payload:(NSInteger)payload
                                block:(SWIFT_NOESCAPE void (^ _Nonnull)(void))block SWIFT_WARN_UNUSED_RESULT;

- (nonnull instancetype)init OBJC_DESIGNATED_INITIALIZER;

@end

@interface ObjcData (MyTest)

- (NSArray<NSString *> * _Nonnull)textItems SWIFT_WARN_UNUSED_RESULT;

- (void)setTextItemsWithTextItems:(NSArray<NSString *> * _Nonnull)textItems;

@property (nonatomic, copy) NSArray<NSString *> * _Nonnull textItemsVar;

@end
