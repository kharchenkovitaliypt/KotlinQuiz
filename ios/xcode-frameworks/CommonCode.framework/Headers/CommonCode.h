#import <Foundation/Foundation.h>

@class CommonCodeSize, CommonCodeDbQuestionAdapter, CommonCodeDbQuestionImpl, CommonCodeSqldelight_runtimeQuery, CommonCodeKotlinUnit, CommonCodeSqldelight_runtimeTransacterTransaction, CommonCodeKotlinQuizDbCompanion, CommonCodeSelectAllTestImpl, CommonCodeViewModel, CommonCodeCoroutineViewModel, CommonCodeMutableLiveData, CommonCodeQuizViewModel, CommonCodeQuizService, CommonCodePointsLiveData, CommonCodeQuestionStateLiveData, CommonCodeQuestionState, CommonCodeQuestionStateValue, CommonCodeQuestionStateDone, CommonCodeQuestionImpl, CommonCodeDbService, CommonCodeSizeColumnAdapter, CommonCodeAssetServiceImpl, CommonCodeMainDispatcher, CommonCodeKotlinx_coroutines_coreCoroutineDispatcher, CommonCodeKotlinAbstractCoroutineContextElement, CommonCodeAnswerResult, CommonCodeInputQuestionDto, CommonCodeInputQuestionDtoCompanion, CommonCodeInputQuestionDto$serializer, CommonCodeKotlinArray, CommonCodeOptQuestionDto, CommonCodeOptAnswerDto, CommonCodeOptQuestionDtoCompanion, CommonCodeOptQuestionDto$serializer, CommonCodeOptAnswerDtoCompanion, CommonCodeOptAnswerDto$serializer, NSObject, CommonCodeKotlinThrowable, CommonCodeKotlinDetachedObjectGraph, CommonCodeKotlinx_coroutines_coreCancellationException, CommonCodeKotlinx_serialization_runtime_nativeEnumDescriptor, CommonCodeKotlinx_serialization_runtime_nativeSerialKind, CommonCodeKotlinNothing, CommonCodeKotlinx_serialization_runtime_nativeUpdateMode, CommonCodeKotlinTransferMode, CommonCodeKotlinByteArray, CommonCodeKotlinIllegalStateException, CommonCodeKotlinRuntimeException, CommonCodeKotlinException, CommonCodeKotlinx_serialization_runtime_nativeSerialClassDescImpl, CommonCodeKotlinEnum, CommonCodeKotlinByteIterator, CommonCodeKotlinx_coroutines_coreAtomicDesc, CommonCodeKotlinx_coroutines_coreAtomicOp, CommonCodeKotlinx_coroutines_coreOpDescriptor;

@protocol CommonCodeDbQuestion, CommonCodeSqldelight_runtimeColumnAdapter, CommonCodeDbQuestionQueries, CommonCodeSqldelight_runtimeTransacter, CommonCodeKotlinQuizDb, CommonCodeSqldelight_runtimeSqlDriver, CommonCodeSqldelight_runtimeSqlDriverSchema, CommonCodeSelectAllTest, CommonCodeKotlinx_coroutines_coreCoroutineScope, CommonCodeKotlinCoroutineContext, CommonCodeKotlinx_coroutines_coreJob, CommonCodeOptAnswer, CommonCodeQuestion, CommonCodeAssetService, CommonCodeKotlinCoroutineContextElement, CommonCodeKotlinCoroutineContextKey, CommonCodeKotlinContinuationInterceptor, CommonCodeKotlinContinuation, CommonCodeKotlinx_coroutines_coreRunnable, CommonCodeKotlinx_coroutines_coreDelay, CommonCodeKotlinx_coroutines_coreDisposableHandle, CommonCodeKotlinx_coroutines_coreCancellableContinuation, CommonCodeAnswer, CommonCodeInputQuestion, CommonCodeKotlinx_serialization_runtime_nativeKSerializer, CommonCodeKotlinx_serialization_runtime_nativeGeneratedSerializer, CommonCodeKotlinx_serialization_runtime_nativeSerializationStrategy, CommonCodeKotlinx_serialization_runtime_nativeEncoder, CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor, CommonCodeKotlinx_serialization_runtime_nativeDeserializationStrategy, CommonCodeKotlinx_serialization_runtime_nativeDecoder, CommonCodeOptQuestion, CommonCodeSqldelight_runtimeSqlCursor, CommonCodeSqldelight_runtimeQueryListener, CommonCodeSqldelight_runtimeSqlPreparedStatement, CommonCodeSqldelight_runtimeCloseable, CommonCodeKotlinx_coroutines_coreChildHandle, CommonCodeKotlinx_coroutines_coreChildJob, CommonCodeKotlinSequence, CommonCodeKotlinx_coroutines_coreSelectClause0, CommonCodeKotlinIterator, CommonCodeKotlinx_serialization_runtime_nativeCompositeEncoder, CommonCodeKotlinx_serialization_runtime_nativeSerialModule, CommonCodeKotlinAnnotation, CommonCodeKotlinx_serialization_runtime_nativeCompositeDecoder, CommonCodeKotlinx_coroutines_coreParentJob, CommonCodeKotlinx_coroutines_coreSelectInstance, CommonCodeKotlinSuspendFunction0, CommonCodeKotlinx_serialization_runtime_nativeSerialModuleCollector, CommonCodeKotlinKClass, CommonCodeKotlinComparable, CommonCodeKotlinSuspendFunction, CommonCodeKotlinKDeclarationContainer, CommonCodeKotlinKAnnotatedElement, CommonCodeKotlinKClassifier;

NS_ASSUME_NONNULL_BEGIN

@interface KotlinBase : NSObject
- (instancetype)init __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
+ (void)initialize __attribute__((objc_requires_super));
@end;

@interface KotlinBase (KotlinBaseCopying) <NSCopying>
@end;

__attribute__((objc_runtime_name("KotlinMutableSet")))
__attribute__((swift_name("KotlinMutableSet")))
@interface CommonCodeMutableSet<ObjectType> : NSMutableSet<ObjectType>
@end;

__attribute__((objc_runtime_name("KotlinMutableDictionary")))
__attribute__((swift_name("KotlinMutableDictionary")))
@interface CommonCodeMutableDictionary<KeyType, ObjectType> : NSMutableDictionary<KeyType, ObjectType>
@end;

@interface NSError (NSErrorKotlinException)
@property (readonly) id _Nullable kotlinException;
@end;

__attribute__((objc_runtime_name("KotlinNumber")))
__attribute__((swift_name("KotlinNumber")))
@interface CommonCodeNumber : NSNumber
- (instancetype)initWithChar:(char)value __attribute__((unavailable));
- (instancetype)initWithUnsignedChar:(unsigned char)value __attribute__((unavailable));
- (instancetype)initWithShort:(short)value __attribute__((unavailable));
- (instancetype)initWithUnsignedShort:(unsigned short)value __attribute__((unavailable));
- (instancetype)initWithInt:(int)value __attribute__((unavailable));
- (instancetype)initWithUnsignedInt:(unsigned int)value __attribute__((unavailable));
- (instancetype)initWithLong:(long)value __attribute__((unavailable));
- (instancetype)initWithUnsignedLong:(unsigned long)value __attribute__((unavailable));
- (instancetype)initWithLongLong:(long long)value __attribute__((unavailable));
- (instancetype)initWithUnsignedLongLong:(unsigned long long)value __attribute__((unavailable));
- (instancetype)initWithFloat:(float)value __attribute__((unavailable));
- (instancetype)initWithDouble:(double)value __attribute__((unavailable));
- (instancetype)initWithBool:(BOOL)value __attribute__((unavailable));
- (instancetype)initWithInteger:(NSInteger)value __attribute__((unavailable));
- (instancetype)initWithUnsignedInteger:(NSUInteger)value __attribute__((unavailable));
+ (instancetype)numberWithChar:(char)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedChar:(unsigned char)value __attribute__((unavailable));
+ (instancetype)numberWithShort:(short)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedShort:(unsigned short)value __attribute__((unavailable));
+ (instancetype)numberWithInt:(int)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedInt:(unsigned int)value __attribute__((unavailable));
+ (instancetype)numberWithLong:(long)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedLong:(unsigned long)value __attribute__((unavailable));
+ (instancetype)numberWithLongLong:(long long)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedLongLong:(unsigned long long)value __attribute__((unavailable));
+ (instancetype)numberWithFloat:(float)value __attribute__((unavailable));
+ (instancetype)numberWithDouble:(double)value __attribute__((unavailable));
+ (instancetype)numberWithBool:(BOOL)value __attribute__((unavailable));
+ (instancetype)numberWithInteger:(NSInteger)value __attribute__((unavailable));
+ (instancetype)numberWithUnsignedInteger:(NSUInteger)value __attribute__((unavailable));
@end;

__attribute__((objc_runtime_name("KotlinByte")))
__attribute__((swift_name("KotlinByte")))
@interface CommonCodeByte : CommonCodeNumber
- (instancetype)initWithChar:(char)value;
+ (instancetype)numberWithChar:(char)value;
@end;

__attribute__((objc_runtime_name("KotlinUByte")))
__attribute__((swift_name("KotlinUByte")))
@interface CommonCodeUByte : CommonCodeNumber
- (instancetype)initWithUnsignedChar:(unsigned char)value;
+ (instancetype)numberWithUnsignedChar:(unsigned char)value;
@end;

__attribute__((objc_runtime_name("KotlinShort")))
__attribute__((swift_name("KotlinShort")))
@interface CommonCodeShort : CommonCodeNumber
- (instancetype)initWithShort:(short)value;
+ (instancetype)numberWithShort:(short)value;
@end;

__attribute__((objc_runtime_name("KotlinUShort")))
__attribute__((swift_name("KotlinUShort")))
@interface CommonCodeUShort : CommonCodeNumber
- (instancetype)initWithUnsignedShort:(unsigned short)value;
+ (instancetype)numberWithUnsignedShort:(unsigned short)value;
@end;

__attribute__((objc_runtime_name("KotlinInt")))
__attribute__((swift_name("KotlinInt")))
@interface CommonCodeInt : CommonCodeNumber
- (instancetype)initWithInt:(int)value;
+ (instancetype)numberWithInt:(int)value;
@end;

__attribute__((objc_runtime_name("KotlinUInt")))
__attribute__((swift_name("KotlinUInt")))
@interface CommonCodeUInt : CommonCodeNumber
- (instancetype)initWithUnsignedInt:(unsigned int)value;
+ (instancetype)numberWithUnsignedInt:(unsigned int)value;
@end;

__attribute__((objc_runtime_name("KotlinLong")))
__attribute__((swift_name("KotlinLong")))
@interface CommonCodeLong : CommonCodeNumber
- (instancetype)initWithLongLong:(long long)value;
+ (instancetype)numberWithLongLong:(long long)value;
@end;

__attribute__((objc_runtime_name("KotlinULong")))
__attribute__((swift_name("KotlinULong")))
@interface CommonCodeULong : CommonCodeNumber
- (instancetype)initWithUnsignedLongLong:(unsigned long long)value;
+ (instancetype)numberWithUnsignedLongLong:(unsigned long long)value;
@end;

__attribute__((objc_runtime_name("KotlinFloat")))
__attribute__((swift_name("KotlinFloat")))
@interface CommonCodeFloat : CommonCodeNumber
- (instancetype)initWithFloat:(float)value;
+ (instancetype)numberWithFloat:(float)value;
@end;

__attribute__((objc_runtime_name("KotlinDouble")))
__attribute__((swift_name("KotlinDouble")))
@interface CommonCodeDouble : CommonCodeNumber
- (instancetype)initWithDouble:(double)value;
+ (instancetype)numberWithDouble:(double)value;
@end;

__attribute__((objc_runtime_name("KotlinBoolean")))
__attribute__((swift_name("KotlinBoolean")))
@interface CommonCodeBoolean : CommonCodeNumber
- (instancetype)initWithBool:(BOOL)value;
+ (instancetype)numberWithBool:(BOOL)value;
@end;

__attribute__((swift_name("DbQuestion")))
@protocol CommonCodeDbQuestion
@required
@property (readonly) NSString *id __attribute__((swift_name("id")));
@property (readonly) NSString *text __attribute__((swift_name("text")));
@property (readonly) CommonCodeSize * _Nullable size __attribute__((swift_name("size")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DbQuestionAdapter")))
@interface CommonCodeDbQuestionAdapter : KotlinBase
- (instancetype)initWithSizeAdapter:(id<CommonCodeSqldelight_runtimeColumnAdapter>)sizeAdapter __attribute__((swift_name("init(sizeAdapter:)"))) __attribute__((objc_designated_initializer));
@property (readonly) id<CommonCodeSqldelight_runtimeColumnAdapter> sizeAdapter __attribute__((swift_name("sizeAdapter")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DbQuestionImpl")))
@interface CommonCodeDbQuestionImpl : KotlinBase <CommonCodeDbQuestion>
- (instancetype)initWithId:(NSString *)id text:(NSString *)text size:(CommonCodeSize * _Nullable)size __attribute__((swift_name("init(id:text:size:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (NSString *)component2 __attribute__((swift_name("component2()")));
- (CommonCodeSize * _Nullable)component3 __attribute__((swift_name("component3()")));
- (CommonCodeDbQuestionImpl *)doCopyId:(NSString *)id text:(NSString *)text size:(CommonCodeSize * _Nullable)size __attribute__((swift_name("doCopy(id:text:size:)")));
@end;

__attribute__((swift_name("Sqldelight_runtimeTransacter")))
@protocol CommonCodeSqldelight_runtimeTransacter
@required
- (void)transactionNoEnclosing:(BOOL)noEnclosing body:(CommonCodeKotlinUnit *(^)(CommonCodeSqldelight_runtimeTransacterTransaction *))body __attribute__((swift_name("transaction(noEnclosing:body:)")));
@end;

__attribute__((swift_name("DbQuestionQueries")))
@protocol CommonCodeDbQuestionQueries <CommonCodeSqldelight_runtimeTransacter>
@required
- (CommonCodeSqldelight_runtimeQuery *)selectAllMapper:(id (^)(NSString *, NSString *, CommonCodeSize * _Nullable))mapper __attribute__((swift_name("selectAll(mapper:)")));
- (CommonCodeSqldelight_runtimeQuery *)selectAll __attribute__((swift_name("selectAll()")));
- (CommonCodeSqldelight_runtimeQuery *)selectAllTestMapper:(id (^)(NSString *, NSString *))mapper __attribute__((swift_name("selectAllTest(mapper:)")));
- (CommonCodeSqldelight_runtimeQuery *)selectAllTest __attribute__((swift_name("selectAllTest()")));
- (void)insertId:(NSString *)id text:(NSString *)text size:(CommonCodeSize * _Nullable)size __attribute__((swift_name("insert(id:text:size:)")));
@end;

__attribute__((swift_name("KotlinQuizDb")))
@protocol CommonCodeKotlinQuizDb <CommonCodeSqldelight_runtimeTransacter>
@required
@property (readonly) id<CommonCodeDbQuestionQueries> dbQuestionQueries __attribute__((swift_name("dbQuestionQueries")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinQuizDbCompanion")))
@interface CommonCodeKotlinQuizDbCompanion : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
- (id<CommonCodeKotlinQuizDb>)invokeDriver:(id<CommonCodeSqldelight_runtimeSqlDriver>)driver DbQuestionAdapter:(CommonCodeDbQuestionAdapter *)DbQuestionAdapter __attribute__((swift_name("invoke(driver:DbQuestionAdapter:)")));
@property (readonly) id<CommonCodeSqldelight_runtimeSqlDriverSchema> Schema __attribute__((swift_name("Schema")));
@end;

__attribute__((swift_name("SelectAllTest")))
@protocol CommonCodeSelectAllTest
@required
@property (readonly) NSString *text __attribute__((swift_name("text")));
@property (readonly) NSString *size __attribute__((swift_name("size")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SelectAllTestImpl")))
@interface CommonCodeSelectAllTestImpl : KotlinBase <CommonCodeSelectAllTest>
- (instancetype)initWithText:(NSString *)text size:(NSString *)size __attribute__((swift_name("init(text:size:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (NSString *)component2 __attribute__((swift_name("component2()")));
- (CommonCodeSelectAllTestImpl *)doCopyText:(NSString *)text size:(NSString *)size __attribute__((swift_name("doCopy(text:size:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Size")))
@interface CommonCodeSize : KotlinBase
- (instancetype)initWithValue:(int64_t)value __attribute__((swift_name("init(value:)"))) __attribute__((objc_designated_initializer));
@property (readonly) int64_t value __attribute__((swift_name("value")));
@end;

__attribute__((swift_name("ViewModel")))
@interface CommonCodeViewModel : KotlinBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (void)onCleared __attribute__((swift_name("onCleared()")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreCoroutineScope")))
@protocol CommonCodeKotlinx_coroutines_coreCoroutineScope
@required
@property (readonly) id<CommonCodeKotlinCoroutineContext> coroutineContext __attribute__((swift_name("coroutineContext")));
@end;

__attribute__((swift_name("CoroutineViewModel")))
@interface CommonCodeCoroutineViewModel : CommonCodeViewModel <CommonCodeKotlinx_coroutines_coreCoroutineScope>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@end;

__attribute__((swift_name("MutableLiveData")))
@interface CommonCodeMutableLiveData : KotlinBase
- (instancetype)initWithData:(id _Nullable)data __attribute__((swift_name("init(data:)"))) __attribute__((objc_designated_initializer));
- (void)observeCallback:(CommonCodeKotlinUnit *(^)(id _Nullable))callback __attribute__((swift_name("observe(callback:)")));
@property id _Nullable data __attribute__((swift_name("data")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("QuizViewModel")))
@interface CommonCodeQuizViewModel : CommonCodeCoroutineViewModel
- (instancetype)initWithQuizService:(CommonCodeQuizService *)quizService __attribute__((swift_name("init(quizService:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (id<CommonCodeKotlinx_coroutines_coreJob>)processAnswerAnswer:(NSString *)answer __attribute__((swift_name("processAnswer(answer:)")));
- (id<CommonCodeKotlinx_coroutines_coreJob>)processAnswerAnswer_:(id<CommonCodeOptAnswer>)answer __attribute__((swift_name("processAnswer(answer_:)")));
@property (readonly) CommonCodePointsLiveData *totalPoints __attribute__((swift_name("totalPoints")));
@property (readonly) CommonCodeQuestionStateLiveData *questionState __attribute__((swift_name("questionState")));
@end;

__attribute__((swift_name("QuestionState")))
@interface CommonCodeQuestionState : KotlinBase
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("QuestionState.Value")))
@interface CommonCodeQuestionStateValue : CommonCodeQuestionState
- (instancetype)initWithValue:(id<CommonCodeQuestion>)value __attribute__((swift_name("init(value:)"))) __attribute__((objc_designated_initializer));
@property (readonly) id<CommonCodeQuestion> value __attribute__((swift_name("value")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("QuestionState.Done")))
@interface CommonCodeQuestionStateDone : CommonCodeQuestionState
- (instancetype)initWithTotalPoints:(int64_t)totalPoints __attribute__((swift_name("init(totalPoints:)"))) __attribute__((objc_designated_initializer));
@property (readonly) int64_t totalPoints __attribute__((swift_name("totalPoints")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("PointsLiveData")))
@interface CommonCodePointsLiveData : CommonCodeMutableLiveData
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithData:(id _Nullable)data __attribute__((swift_name("init(data:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (void)observeCallback:(CommonCodeKotlinUnit *(^)(CommonCodeLong *))callback __attribute__((swift_name("observe(callback:)")));
@property CommonCodeLong *data __attribute__((swift_name("data")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("QuestionStateLiveData")))
@interface CommonCodeQuestionStateLiveData : CommonCodeMutableLiveData
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithData:(id _Nullable)data __attribute__((swift_name("init(data:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (void)observeCallback:(CommonCodeKotlinUnit *(^)(CommonCodeQuestionState *))callback __attribute__((swift_name("observe(callback:)")));
@property CommonCodeQuestionState *data __attribute__((swift_name("data")));
@end;

__attribute__((swift_name("AssetService")))
@protocol CommonCodeAssetService
@required
@end;

__attribute__((swift_name("Question")))
@protocol CommonCodeQuestion
@required
@property (readonly) NSString *id __attribute__((swift_name("id")));
@property (readonly) NSString *text __attribute__((swift_name("text")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("QuestionImpl")))
@interface CommonCodeQuestionImpl : KotlinBase <CommonCodeQuestion>
- (instancetype)initWithId:(NSString *)id text:(NSString *)text __attribute__((swift_name("init(id:text:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (NSString *)component2 __attribute__((swift_name("component2()")));
- (CommonCodeQuestionImpl *)doCopyId:(NSString *)id text:(NSString *)text __attribute__((swift_name("doCopy(id:text:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DbService")))
@interface CommonCodeDbService : KotlinBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@end;

__attribute__((swift_name("Sqldelight_runtimeColumnAdapter")))
@protocol CommonCodeSqldelight_runtimeColumnAdapter
@required
- (id)decodeDatabaseValue:(id _Nullable)databaseValue __attribute__((swift_name("decode(databaseValue:)")));
- (id _Nullable)encodeValue:(id)value __attribute__((swift_name("encode(value:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("SizeColumnAdapter")))
@interface CommonCodeSizeColumnAdapter : KotlinBase <CommonCodeSqldelight_runtimeColumnAdapter>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (CommonCodeSize *)decodeDatabaseValue:(CommonCodeLong *)databaseValue __attribute__((swift_name("decode(databaseValue:)")));
- (CommonCodeLong *)encodeValue:(CommonCodeSize *)value __attribute__((swift_name("encode(value:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("QuizService")))
@interface CommonCodeQuizService : KotlinBase
- (instancetype)initWithAssetService:(id<CommonCodeAssetService>)assetService __attribute__((swift_name("init(assetService:)"))) __attribute__((objc_designated_initializer));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("AssetServiceImpl")))
@interface CommonCodeAssetServiceImpl : KotlinBase <CommonCodeAssetService>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@end;

__attribute__((swift_name("KotlinCoroutineContext")))
@protocol CommonCodeKotlinCoroutineContext
@required
- (id _Nullable)foldInitial:(id _Nullable)initial operation:(id _Nullable (^)(id _Nullable, id<CommonCodeKotlinCoroutineContextElement>))operation __attribute__((swift_name("fold(initial:operation:)")));
- (id<CommonCodeKotlinCoroutineContextElement> _Nullable)getKey:(id<CommonCodeKotlinCoroutineContextKey>)key __attribute__((swift_name("get(key:)")));
- (id<CommonCodeKotlinCoroutineContext>)minusKeyKey:(id<CommonCodeKotlinCoroutineContextKey>)key __attribute__((swift_name("minusKey(key:)")));
- (id<CommonCodeKotlinCoroutineContext>)plusContext:(id<CommonCodeKotlinCoroutineContext>)context __attribute__((swift_name("plus(context:)")));
@end;

__attribute__((swift_name("KotlinCoroutineContextElement")))
@protocol CommonCodeKotlinCoroutineContextElement <CommonCodeKotlinCoroutineContext>
@required
@property (readonly) id<CommonCodeKotlinCoroutineContextKey> key __attribute__((swift_name("key")));
@end;

__attribute__((swift_name("KotlinAbstractCoroutineContextElement")))
@interface CommonCodeKotlinAbstractCoroutineContextElement : KotlinBase <CommonCodeKotlinCoroutineContextElement>
- (instancetype)initWithKey:(id<CommonCodeKotlinCoroutineContextKey>)key __attribute__((swift_name("init(key:)"))) __attribute__((objc_designated_initializer));
@end;

__attribute__((swift_name("KotlinContinuationInterceptor")))
@protocol CommonCodeKotlinContinuationInterceptor <CommonCodeKotlinCoroutineContextElement>
@required
- (id<CommonCodeKotlinContinuation>)interceptContinuationContinuation:(id<CommonCodeKotlinContinuation>)continuation __attribute__((swift_name("interceptContinuation(continuation:)")));
- (void)releaseInterceptedContinuationContinuation:(id<CommonCodeKotlinContinuation>)continuation __attribute__((swift_name("releaseInterceptedContinuation(continuation:)")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreCoroutineDispatcher")))
@interface CommonCodeKotlinx_coroutines_coreCoroutineDispatcher : CommonCodeKotlinAbstractCoroutineContextElement <CommonCodeKotlinContinuationInterceptor>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithKey:(id<CommonCodeKotlinCoroutineContextKey>)key __attribute__((swift_name("init(key:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (void)dispatchContext:(id<CommonCodeKotlinCoroutineContext>)context block:(id<CommonCodeKotlinx_coroutines_coreRunnable>)block __attribute__((swift_name("dispatch(context:block:)")));
- (void)dispatchYieldContext:(id<CommonCodeKotlinCoroutineContext>)context block:(id<CommonCodeKotlinx_coroutines_coreRunnable>)block __attribute__((swift_name("dispatchYield(context:block:)")));
- (BOOL)isDispatchNeededContext:(id<CommonCodeKotlinCoroutineContext>)context __attribute__((swift_name("isDispatchNeeded(context:)")));
- (CommonCodeKotlinx_coroutines_coreCoroutineDispatcher *)plusOther:(CommonCodeKotlinx_coroutines_coreCoroutineDispatcher *)other __attribute__((swift_name("plus(other:)")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreDelay")))
@protocol CommonCodeKotlinx_coroutines_coreDelay
@required
- (id<CommonCodeKotlinx_coroutines_coreDisposableHandle>)invokeOnTimeoutTimeMillis:(int64_t)timeMillis block:(id<CommonCodeKotlinx_coroutines_coreRunnable>)block __attribute__((swift_name("invokeOnTimeout(timeMillis:block:)")));
- (void)scheduleResumeAfterDelayTimeMillis:(int64_t)timeMillis continuation:(id<CommonCodeKotlinx_coroutines_coreCancellableContinuation>)continuation __attribute__((swift_name("scheduleResumeAfterDelay(timeMillis:continuation:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("MainDispatcher")))
@interface CommonCodeMainDispatcher : CommonCodeKotlinx_coroutines_coreCoroutineDispatcher <CommonCodeKotlinx_coroutines_coreDelay>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
@end;

__attribute__((swift_name("Answer")))
@protocol CommonCodeAnswer
@required
@property (readonly) int64_t points __attribute__((swift_name("points")));
@property (readonly) NSString * _Nullable next __attribute__((swift_name("next")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("AnswerResult")))
@interface CommonCodeAnswerResult : KotlinBase
- (instancetype)initWithNextQuestion:(id<CommonCodeQuestion> _Nullable)nextQuestion totalPoints:(int64_t)totalPoints __attribute__((swift_name("init(nextQuestion:totalPoints:)"))) __attribute__((objc_designated_initializer));
- (id<CommonCodeQuestion> _Nullable)component1 __attribute__((swift_name("component1()")));
- (int64_t)component2 __attribute__((swift_name("component2()")));
- (CommonCodeAnswerResult *)doCopyNextQuestion:(id<CommonCodeQuestion> _Nullable)nextQuestion totalPoints:(int64_t)totalPoints __attribute__((swift_name("doCopy(nextQuestion:totalPoints:)")));
@property (readonly) id<CommonCodeQuestion> _Nullable nextQuestion __attribute__((swift_name("nextQuestion")));
@property (readonly) int64_t totalPoints __attribute__((swift_name("totalPoints")));
@end;

__attribute__((swift_name("InputQuestion")))
@protocol CommonCodeInputQuestion <CommonCodeQuestion, CommonCodeAnswer>
@required
@property (readonly) NSString * _Nullable validator __attribute__((swift_name("validator")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("InputQuestionDto")))
@interface CommonCodeInputQuestionDto : KotlinBase <CommonCodeInputQuestion>
- (instancetype)initWithId:(NSString *)id text:(NSString *)text points:(int64_t)points next:(NSString * _Nullable)next validator:(NSString * _Nullable)validator __attribute__((swift_name("init(id:text:points:next:validator:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (NSString *)component2 __attribute__((swift_name("component2()")));
- (int64_t)component3 __attribute__((swift_name("component3()")));
- (NSString * _Nullable)component4 __attribute__((swift_name("component4()")));
- (NSString * _Nullable)component5 __attribute__((swift_name("component5()")));
- (CommonCodeInputQuestionDto *)doCopyId:(NSString *)id text:(NSString *)text points:(int64_t)points next:(NSString * _Nullable)next validator:(NSString * _Nullable)validator __attribute__((swift_name("doCopy(id:text:points:next:validator:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("InputQuestionDto.Companion")))
@interface CommonCodeInputQuestionDtoCompanion : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
- (id<CommonCodeKotlinx_serialization_runtime_nativeKSerializer>)serializer __attribute__((swift_name("serializer()")));
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeSerializationStrategy")))
@protocol CommonCodeKotlinx_serialization_runtime_nativeSerializationStrategy
@required
- (void)serializeEncoder:(id<CommonCodeKotlinx_serialization_runtime_nativeEncoder>)encoder obj:(id _Nullable)obj __attribute__((swift_name("serialize(encoder:obj:)")));
@property (readonly) id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor> descriptor __attribute__((swift_name("descriptor")));
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeDeserializationStrategy")))
@protocol CommonCodeKotlinx_serialization_runtime_nativeDeserializationStrategy
@required
- (id _Nullable)deserializeDecoder:(id<CommonCodeKotlinx_serialization_runtime_nativeDecoder>)decoder __attribute__((swift_name("deserialize(decoder:)")));
- (id _Nullable)patchDecoder:(id<CommonCodeKotlinx_serialization_runtime_nativeDecoder>)decoder old:(id _Nullable)old __attribute__((swift_name("patch(decoder:old:)")));
@property (readonly) id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor> descriptor __attribute__((swift_name("descriptor")));
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeKSerializer")))
@protocol CommonCodeKotlinx_serialization_runtime_nativeKSerializer <CommonCodeKotlinx_serialization_runtime_nativeSerializationStrategy, CommonCodeKotlinx_serialization_runtime_nativeDeserializationStrategy>
@required
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeGeneratedSerializer")))
@protocol CommonCodeKotlinx_serialization_runtime_nativeGeneratedSerializer <CommonCodeKotlinx_serialization_runtime_nativeKSerializer>
@required
- (CommonCodeKotlinArray *)childSerializers __attribute__((swift_name("childSerializers()")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("InputQuestionDto.$serializer")))
@interface CommonCodeInputQuestionDto$serializer : KotlinBase <CommonCodeKotlinx_serialization_runtime_nativeGeneratedSerializer>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)$serializer __attribute__((swift_name("init()")));
- (CommonCodeInputQuestionDto *)deserializeDecoder:(id<CommonCodeKotlinx_serialization_runtime_nativeDecoder>)decoder __attribute__((swift_name("deserialize(decoder:)")));
- (CommonCodeInputQuestionDto *)patchDecoder:(id<CommonCodeKotlinx_serialization_runtime_nativeDecoder>)decoder old:(CommonCodeInputQuestionDto *)old __attribute__((swift_name("patch(decoder:old:)")));
- (void)serializeEncoder:(id<CommonCodeKotlinx_serialization_runtime_nativeEncoder>)encoder obj:(CommonCodeInputQuestionDto *)obj __attribute__((swift_name("serialize(encoder:obj:)")));
@end;

__attribute__((swift_name("OptQuestion")))
@protocol CommonCodeOptQuestion <CommonCodeQuestion>
@required
@property (readonly) NSArray<id<CommonCodeOptAnswer>> *answers __attribute__((swift_name("answers")));
@end;

__attribute__((swift_name("OptAnswer")))
@protocol CommonCodeOptAnswer <CommonCodeAnswer>
@required
@property (readonly) NSString *id __attribute__((swift_name("id")));
@property (readonly) NSString *content __attribute__((swift_name("content")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("OptQuestionDto")))
@interface CommonCodeOptQuestionDto : KotlinBase <CommonCodeOptQuestion>
- (instancetype)initWithId:(NSString *)id text:(NSString *)text answers:(NSArray<CommonCodeOptAnswerDto *> *)answers __attribute__((swift_name("init(id:text:answers:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (NSString *)component2 __attribute__((swift_name("component2()")));
- (NSArray<CommonCodeOptAnswerDto *> *)component3 __attribute__((swift_name("component3()")));
- (CommonCodeOptQuestionDto *)doCopyId:(NSString *)id text:(NSString *)text answers:(NSArray<CommonCodeOptAnswerDto *> *)answers __attribute__((swift_name("doCopy(id:text:answers:)")));
@property (readonly) NSArray<CommonCodeOptAnswerDto *> *answers __attribute__((swift_name("answers")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("OptQuestionDto.Companion")))
@interface CommonCodeOptQuestionDtoCompanion : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
- (id<CommonCodeKotlinx_serialization_runtime_nativeKSerializer>)serializer __attribute__((swift_name("serializer()")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("OptQuestionDto.$serializer")))
@interface CommonCodeOptQuestionDto$serializer : KotlinBase <CommonCodeKotlinx_serialization_runtime_nativeGeneratedSerializer>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)$serializer __attribute__((swift_name("init()")));
- (CommonCodeOptQuestionDto *)deserializeDecoder:(id<CommonCodeKotlinx_serialization_runtime_nativeDecoder>)decoder __attribute__((swift_name("deserialize(decoder:)")));
- (CommonCodeOptQuestionDto *)patchDecoder:(id<CommonCodeKotlinx_serialization_runtime_nativeDecoder>)decoder old:(CommonCodeOptQuestionDto *)old __attribute__((swift_name("patch(decoder:old:)")));
- (void)serializeEncoder:(id<CommonCodeKotlinx_serialization_runtime_nativeEncoder>)encoder obj:(CommonCodeOptQuestionDto *)obj __attribute__((swift_name("serialize(encoder:obj:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("OptAnswerDto")))
@interface CommonCodeOptAnswerDto : KotlinBase <CommonCodeOptAnswer>
- (instancetype)initWithId:(NSString *)id content:(NSString *)content points:(int64_t)points next:(NSString * _Nullable)next __attribute__((swift_name("init(id:content:points:next:)"))) __attribute__((objc_designated_initializer));
- (NSString *)component1 __attribute__((swift_name("component1()")));
- (NSString *)component2 __attribute__((swift_name("component2()")));
- (int64_t)component3 __attribute__((swift_name("component3()")));
- (NSString * _Nullable)component4 __attribute__((swift_name("component4()")));
- (CommonCodeOptAnswerDto *)doCopyId:(NSString *)id content:(NSString *)content points:(int64_t)points next:(NSString * _Nullable)next __attribute__((swift_name("doCopy(id:content:points:next:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("OptAnswerDto.Companion")))
@interface CommonCodeOptAnswerDtoCompanion : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)companion __attribute__((swift_name("init()")));
- (id<CommonCodeKotlinx_serialization_runtime_nativeKSerializer>)serializer __attribute__((swift_name("serializer()")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("OptAnswerDto.$serializer")))
@interface CommonCodeOptAnswerDto$serializer : KotlinBase <CommonCodeKotlinx_serialization_runtime_nativeGeneratedSerializer>
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)$serializer __attribute__((swift_name("init()")));
- (CommonCodeOptAnswerDto *)deserializeDecoder:(id<CommonCodeKotlinx_serialization_runtime_nativeDecoder>)decoder __attribute__((swift_name("deserialize(decoder:)")));
- (CommonCodeOptAnswerDto *)patchDecoder:(id<CommonCodeKotlinx_serialization_runtime_nativeDecoder>)decoder old:(CommonCodeOptAnswerDto *)old __attribute__((swift_name("patch(decoder:old:)")));
- (void)serializeEncoder:(id<CommonCodeKotlinx_serialization_runtime_nativeEncoder>)encoder obj:(CommonCodeOptAnswerDto *)obj __attribute__((swift_name("serialize(encoder:obj:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("TestKt")))
@interface CommonCodeTestKt : KotlinBase
+ (void)runTestSid:(NSString *)sid __attribute__((swift_name("runTest(sid:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ThreadAssertsKt")))
@interface CommonCodeThreadAssertsKt : KotlinBase
+ (void)assertIsMainThread __attribute__((swift_name("assertIsMainThread()")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ThreadCommandsKt")))
@interface CommonCodeThreadCommandsKt : KotlinBase
+ (void)threadSleepMillis:(int64_t)millis __attribute__((swift_name("threadSleep(millis:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("ThreadInfoKt")))
@interface CommonCodeThreadInfoKt : KotlinBase
+ (void)logThreadMsg:(NSString *)msg __attribute__((swift_name("logThread(msg:)")));
@property (class, readonly) CommonCodeKotlinx_coroutines_coreCoroutineDispatcher *mainDispatcher __attribute__((swift_name("mainDispatcher")));
@property (class, readonly) id currentThread __attribute__((swift_name("currentThread")));
@property (class, readonly) NSString *currentThreadName __attribute__((swift_name("currentThreadName")));
@property (class, readonly) BOOL isMainThread __attribute__((swift_name("isMainThread")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("AsyncKt")))
@interface CommonCodeAsyncKt : KotlinBase
+ (void)doJobJobQueue:(NSObject * _Nullable)jobQueue job:(id _Nullable (^)(void))job onSuccess:(CommonCodeKotlinUnit *(^)(id _Nullable))onSuccess onFailure:(CommonCodeKotlinUnit *(^)(CommonCodeKotlinThrowable *))onFailure __attribute__((swift_name("doJob(jobQueue:job:onSuccess:onFailure:)")));
+ (void)doJobJobQueue:(NSObject * _Nullable)jobQueue job:(id _Nullable (^)(void))job consume:(CommonCodeKotlinUnit *(^)(id _Nullable))consume __attribute__((swift_name("doJob(jobQueue:job:consume:)")));
+ (void)consumeOnMain:(int32_t)receiver onSuccess:(CommonCodeKotlinUnit *(^)(id _Nullable))onSuccess onFailure:(CommonCodeKotlinUnit *(^)(CommonCodeKotlinThrowable *))onFailure __attribute__((swift_name("consumeOnMain(_:onSuccess:onFailure:)")));
+ (void)consumeOnMain:(int32_t)receiver block:(CommonCodeKotlinUnit *(^)(id _Nullable))block __attribute__((swift_name("consumeOnMain(_:block:)")));
+ (CommonCodeKotlinUnit *(^)(id _Nullable))asContinuationOnMain:(CommonCodeKotlinUnit *(^)(id _Nullable))receiver __attribute__((swift_name("asContinuationOnMain(_:)")));
+ (void)executeAsyncQueue:(NSObject * _Nullable)queue block:(CommonCodeKotlinUnit *(^)(void))block __attribute__((swift_name("executeAsync(queue:block:)")));
+ (CommonCodeKotlinDetachedObjectGraph *)detachProducer:(id _Nullable (^)(void))producer __attribute__((swift_name("detach(producer:)")));
+ (id _Nullable)attachPointer:(void *)pointer __attribute__((swift_name("attach(pointer:)")));
@property (class, readonly) NSObject * _Nullable globalQueue __attribute__((swift_name("globalQueue")));
@property (class, readonly) NSObject * _Nullable mainQueue __attribute__((swift_name("mainQueue")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("QuizViewModelKt")))
@interface CommonCodeQuizViewModelKt : KotlinBase
+ (CommonCodeQuestionStateValue *)toState:(id<CommonCodeQuestion>)receiver __attribute__((swift_name("toState(_:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DbDriverKt")))
@interface CommonCodeDbDriverKt : KotlinBase
+ (id<CommonCodeKotlinQuizDb>)createDb __attribute__((swift_name("createDb()")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("DbServiceKt")))
@interface CommonCodeDbServiceKt : KotlinBase
+ (CommonCodeDbQuestionAdapter *)createDbQuestionAdapter __attribute__((swift_name("createDbQuestionAdapter()")));
@end;

__attribute__((swift_name("Sqldelight_runtimeQuery")))
@interface CommonCodeSqldelight_runtimeQuery : KotlinBase
- (instancetype)initWithQueries:(NSMutableArray<CommonCodeSqldelight_runtimeQuery *> *)queries mapper:(id (^)(id<CommonCodeSqldelight_runtimeSqlCursor>))mapper __attribute__((swift_name("init(queries:mapper:)"))) __attribute__((objc_designated_initializer));
- (void)addListenerListener:(id<CommonCodeSqldelight_runtimeQueryListener>)listener __attribute__((swift_name("addListener(listener:)")));
- (id<CommonCodeSqldelight_runtimeSqlCursor>)execute __attribute__((swift_name("execute()")));
- (NSArray<id> *)executeAsList __attribute__((swift_name("executeAsList()")));
- (id)executeAsOne __attribute__((swift_name("executeAsOne()")));
- (id _Nullable)executeAsOneOrNull __attribute__((swift_name("executeAsOneOrNull()")));
- (void)notifyDataChanged __attribute__((swift_name("notifyDataChanged()")));
- (void)removeListenerListener:(id<CommonCodeSqldelight_runtimeQueryListener>)listener __attribute__((swift_name("removeListener(listener:)")));
@property (readonly) id (^mapper)(id<CommonCodeSqldelight_runtimeSqlCursor>) __attribute__((swift_name("mapper")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinUnit")))
@interface CommonCodeKotlinUnit : KotlinBase
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
+ (instancetype)unit __attribute__((swift_name("init()")));
@end;

__attribute__((swift_name("Sqldelight_runtimeTransacterTransaction")))
@interface CommonCodeSqldelight_runtimeTransacterTransaction : KotlinBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (void)afterCommitFunction:(CommonCodeKotlinUnit *(^)(void))function __attribute__((swift_name("afterCommit(function:)")));
- (void)afterRollbackFunction:(CommonCodeKotlinUnit *(^)(void))function __attribute__((swift_name("afterRollback(function:)")));
- (void)endTransactionSuccessful:(BOOL)successful __attribute__((swift_name("endTransaction(successful:)")));
- (void)rollback __attribute__((swift_name("rollback()")));
- (void)transactionBody:(CommonCodeKotlinUnit *(^)(CommonCodeSqldelight_runtimeTransacterTransaction *))body __attribute__((swift_name("transaction(body:)")));
@property (readonly) CommonCodeSqldelight_runtimeTransacterTransaction * _Nullable enclosingTransaction __attribute__((swift_name("enclosingTransaction")));
@end;

__attribute__((swift_name("Sqldelight_runtimeCloseable")))
@protocol CommonCodeSqldelight_runtimeCloseable
@required
- (void)close __attribute__((swift_name("close()")));
@end;

__attribute__((swift_name("Sqldelight_runtimeSqlDriver")))
@protocol CommonCodeSqldelight_runtimeSqlDriver <CommonCodeSqldelight_runtimeCloseable>
@required
- (CommonCodeSqldelight_runtimeTransacterTransaction * _Nullable)currentTransaction __attribute__((swift_name("currentTransaction()")));
- (void)executeIdentifier:(CommonCodeInt * _Nullable)identifier sql:(NSString *)sql parameters:(int32_t)parameters binders:(CommonCodeKotlinUnit *(^ _Nullable)(id<CommonCodeSqldelight_runtimeSqlPreparedStatement>))binders __attribute__((swift_name("execute(identifier:sql:parameters:binders:)")));
- (id<CommonCodeSqldelight_runtimeSqlCursor>)executeQueryIdentifier:(CommonCodeInt * _Nullable)identifier sql:(NSString *)sql parameters:(int32_t)parameters binders:(CommonCodeKotlinUnit *(^ _Nullable)(id<CommonCodeSqldelight_runtimeSqlPreparedStatement>))binders __attribute__((swift_name("executeQuery(identifier:sql:parameters:binders:)")));
- (CommonCodeSqldelight_runtimeTransacterTransaction *)doNewTransaction __attribute__((swift_name("doNewTransaction()")));
@end;

__attribute__((swift_name("Sqldelight_runtimeSqlDriverSchema")))
@protocol CommonCodeSqldelight_runtimeSqlDriverSchema
@required
- (void)createDriver:(id<CommonCodeSqldelight_runtimeSqlDriver>)driver __attribute__((swift_name("create(driver:)")));
- (void)migrateDriver:(id<CommonCodeSqldelight_runtimeSqlDriver>)driver oldVersion:(int32_t)oldVersion newVersion:(int32_t)newVersion __attribute__((swift_name("migrate(driver:oldVersion:newVersion:)")));
@property (readonly) int32_t version __attribute__((swift_name("version")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreJob")))
@protocol CommonCodeKotlinx_coroutines_coreJob <CommonCodeKotlinCoroutineContextElement>
@required
- (id<CommonCodeKotlinx_coroutines_coreChildHandle>)attachChildChild:(id<CommonCodeKotlinx_coroutines_coreChildJob>)child __attribute__((swift_name("attachChild(child:)")));
- (void)cancel __attribute__((swift_name("cancel()")));
- (BOOL)cancelCause:(CommonCodeKotlinThrowable * _Nullable)cause __attribute__((swift_name("cancel(cause:)")));
- (void)cancelCause_:(CommonCodeKotlinx_coroutines_coreCancellationException * _Nullable)cause __attribute__((swift_name("cancel(cause_:)")));
- (CommonCodeKotlinx_coroutines_coreCancellationException *)getCancellationException __attribute__((swift_name("getCancellationException()")));
- (id<CommonCodeKotlinx_coroutines_coreDisposableHandle>)invokeOnCompletionOnCancelling:(BOOL)onCancelling invokeImmediately:(BOOL)invokeImmediately handler:(CommonCodeKotlinUnit *(^)(CommonCodeKotlinThrowable * _Nullable))handler __attribute__((swift_name("invokeOnCompletion(onCancelling:invokeImmediately:handler:)")));
- (id<CommonCodeKotlinx_coroutines_coreDisposableHandle>)invokeOnCompletionHandler:(CommonCodeKotlinUnit *(^)(CommonCodeKotlinThrowable * _Nullable))handler __attribute__((swift_name("invokeOnCompletion(handler:)")));
- (id<CommonCodeKotlinx_coroutines_coreJob>)plusOther_:(id<CommonCodeKotlinx_coroutines_coreJob>)other __attribute__((swift_name("plus(other_:)")));
- (BOOL)start __attribute__((swift_name("start()")));
@property (readonly) id<CommonCodeKotlinSequence> children __attribute__((swift_name("children")));
@property (readonly) BOOL isActive __attribute__((swift_name("isActive")));
@property (readonly) BOOL isCancelled __attribute__((swift_name("isCancelled")));
@property (readonly) BOOL isCompleted __attribute__((swift_name("isCompleted")));
@property (readonly) id<CommonCodeKotlinx_coroutines_coreSelectClause0> onJoin __attribute__((swift_name("onJoin")));
@end;

__attribute__((swift_name("KotlinCoroutineContextKey")))
@protocol CommonCodeKotlinCoroutineContextKey
@required
@end;

__attribute__((swift_name("KotlinContinuation")))
@protocol CommonCodeKotlinContinuation
@required
- (void)resumeWithResult:(id _Nullable)result __attribute__((swift_name("resumeWith(result:)")));
@property (readonly) id<CommonCodeKotlinCoroutineContext> context __attribute__((swift_name("context")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreRunnable")))
@protocol CommonCodeKotlinx_coroutines_coreRunnable
@required
- (void)run __attribute__((swift_name("run()")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreDisposableHandle")))
@protocol CommonCodeKotlinx_coroutines_coreDisposableHandle
@required
- (void)dispose __attribute__((swift_name("dispose()")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreCancellableContinuation")))
@protocol CommonCodeKotlinx_coroutines_coreCancellableContinuation <CommonCodeKotlinContinuation>
@required
- (BOOL)cancelCause:(CommonCodeKotlinThrowable * _Nullable)cause __attribute__((swift_name("cancel(cause:)")));
- (void)completeResumeToken:(id)token __attribute__((swift_name("completeResume(token:)")));
- (void)doInitCancellability __attribute__((swift_name("doInitCancellability()")));
- (void)invokeOnCancellationHandler:(CommonCodeKotlinUnit *(^)(CommonCodeKotlinThrowable * _Nullable))handler __attribute__((swift_name("invokeOnCancellation(handler:)")));
- (void)resumeValue:(id _Nullable)value onCancellation:(CommonCodeKotlinUnit *(^)(CommonCodeKotlinThrowable *))onCancellation __attribute__((swift_name("resume(value:onCancellation:)")));
- (id _Nullable)tryResumeValue:(id _Nullable)value idempotent:(id _Nullable)idempotent __attribute__((swift_name("tryResume(value:idempotent:)")));
- (id _Nullable)tryResumeWithExceptionException:(CommonCodeKotlinThrowable *)exception __attribute__((swift_name("tryResumeWithException(exception:)")));
- (void)resumeUndispatched:(CommonCodeKotlinx_coroutines_coreCoroutineDispatcher *)receiver value:(id _Nullable)value __attribute__((swift_name("resumeUndispatched(_:value:)")));
- (void)resumeUndispatchedWithException:(CommonCodeKotlinx_coroutines_coreCoroutineDispatcher *)receiver exception:(CommonCodeKotlinThrowable *)exception __attribute__((swift_name("resumeUndispatchedWithException(_:exception:)")));
@property (readonly) BOOL isActive __attribute__((swift_name("isActive")));
@property (readonly) BOOL isCancelled __attribute__((swift_name("isCancelled")));
@property (readonly) BOOL isCompleted __attribute__((swift_name("isCompleted")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinArray")))
@interface CommonCodeKotlinArray : KotlinBase
+ (instancetype)arrayWithSize:(int32_t)size init:(id _Nullable (^)(CommonCodeInt *))init __attribute__((swift_name("init(size:init:)")));
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (id _Nullable)getIndex:(int32_t)index __attribute__((swift_name("get(index:)")));
- (id<CommonCodeKotlinIterator>)iterator __attribute__((swift_name("iterator()")));
- (void)setIndex:(int32_t)index value:(id _Nullable)value __attribute__((swift_name("set(index:value:)")));
@property (readonly) int32_t size __attribute__((swift_name("size")));
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeEncoder")))
@protocol CommonCodeKotlinx_serialization_runtime_nativeEncoder
@required
- (id<CommonCodeKotlinx_serialization_runtime_nativeCompositeEncoder>)beginCollectionDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc collectionSize:(int32_t)collectionSize typeParams:(CommonCodeKotlinArray *)typeParams __attribute__((swift_name("beginCollection(desc:collectionSize:typeParams:)")));
- (id<CommonCodeKotlinx_serialization_runtime_nativeCompositeEncoder>)beginStructureDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc typeParams:(CommonCodeKotlinArray *)typeParams __attribute__((swift_name("beginStructure(desc:typeParams:)")));
- (void)encodeBooleanValue:(BOOL)value __attribute__((swift_name("encodeBoolean(value:)")));
- (void)encodeByteValue:(int8_t)value __attribute__((swift_name("encodeByte(value:)")));
- (void)encodeCharValue:(unichar)value __attribute__((swift_name("encodeChar(value:)")));
- (void)encodeDoubleValue:(double)value __attribute__((swift_name("encodeDouble(value:)")));
- (void)encodeEnumEnumDescription:(CommonCodeKotlinx_serialization_runtime_nativeEnumDescriptor *)enumDescription ordinal:(int32_t)ordinal __attribute__((swift_name("encodeEnum(enumDescription:ordinal:)")));
- (void)encodeFloatValue:(float)value __attribute__((swift_name("encodeFloat(value:)")));
- (void)encodeIntValue:(int32_t)value __attribute__((swift_name("encodeInt(value:)")));
- (void)encodeLongValue:(int64_t)value __attribute__((swift_name("encodeLong(value:)")));
- (void)encodeNotNullMark __attribute__((swift_name("encodeNotNullMark()")));
- (void)encodeNull __attribute__((swift_name("encodeNull()")));
- (void)encodeNullableSerializableValueSerializer:(id<CommonCodeKotlinx_serialization_runtime_nativeSerializationStrategy>)serializer value:(id _Nullable)value __attribute__((swift_name("encodeNullableSerializableValue(serializer:value:)")));
- (void)encodeSerializableValueSerializer:(id<CommonCodeKotlinx_serialization_runtime_nativeSerializationStrategy>)serializer value:(id _Nullable)value __attribute__((swift_name("encodeSerializableValue(serializer:value:)")));
- (void)encodeShortValue:(int16_t)value __attribute__((swift_name("encodeShort(value:)")));
- (void)encodeStringValue:(NSString *)value __attribute__((swift_name("encodeString(value:)")));
- (void)encodeUnit __attribute__((swift_name("encodeUnit()")));
@property (readonly) id<CommonCodeKotlinx_serialization_runtime_nativeSerialModule> context __attribute__((swift_name("context")));
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeSerialDescriptor")))
@protocol CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor
@required
- (NSArray<id<CommonCodeKotlinAnnotation>> *)getElementAnnotationsIndex:(int32_t)index __attribute__((swift_name("getElementAnnotations(index:)")));
- (id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)getElementDescriptorIndex:(int32_t)index __attribute__((swift_name("getElementDescriptor(index:)")));
- (int32_t)getElementIndexName:(NSString *)name __attribute__((swift_name("getElementIndex(name:)")));
- (NSString *)getElementNameIndex:(int32_t)index __attribute__((swift_name("getElementName(index:)")));
- (NSArray<id<CommonCodeKotlinAnnotation>> *)getEntityAnnotations __attribute__((swift_name("getEntityAnnotations()")));
- (BOOL)isElementOptionalIndex:(int32_t)index __attribute__((swift_name("isElementOptional(index:)")));
@property (readonly) int32_t elementsCount __attribute__((swift_name("elementsCount")));
@property (readonly) BOOL isNullable __attribute__((swift_name("isNullable")));
@property (readonly) CommonCodeKotlinx_serialization_runtime_nativeSerialKind *kind __attribute__((swift_name("kind")));
@property (readonly) NSString *name __attribute__((swift_name("name")));
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeDecoder")))
@protocol CommonCodeKotlinx_serialization_runtime_nativeDecoder
@required
- (id<CommonCodeKotlinx_serialization_runtime_nativeCompositeDecoder>)beginStructureDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc typeParams:(CommonCodeKotlinArray *)typeParams __attribute__((swift_name("beginStructure(desc:typeParams:)")));
- (BOOL)decodeBoolean __attribute__((swift_name("decodeBoolean()")));
- (int8_t)decodeByte __attribute__((swift_name("decodeByte()")));
- (unichar)decodeChar __attribute__((swift_name("decodeChar()")));
- (double)decodeDouble __attribute__((swift_name("decodeDouble()")));
- (int32_t)decodeEnumEnumDescription:(CommonCodeKotlinx_serialization_runtime_nativeEnumDescriptor *)enumDescription __attribute__((swift_name("decodeEnum(enumDescription:)")));
- (float)decodeFloat __attribute__((swift_name("decodeFloat()")));
- (int32_t)decodeInt __attribute__((swift_name("decodeInt()")));
- (int64_t)decodeLong __attribute__((swift_name("decodeLong()")));
- (BOOL)decodeNotNullMark __attribute__((swift_name("decodeNotNullMark()")));
- (CommonCodeKotlinNothing * _Nullable)decodeNull __attribute__((swift_name("decodeNull()")));
- (id _Nullable)decodeNullableSerializableValueDeserializer:(id<CommonCodeKotlinx_serialization_runtime_nativeDeserializationStrategy>)deserializer __attribute__((swift_name("decodeNullableSerializableValue(deserializer:)")));
- (id _Nullable)decodeSerializableValueDeserializer:(id<CommonCodeKotlinx_serialization_runtime_nativeDeserializationStrategy>)deserializer __attribute__((swift_name("decodeSerializableValue(deserializer:)")));
- (int16_t)decodeShort __attribute__((swift_name("decodeShort()")));
- (NSString *)decodeString __attribute__((swift_name("decodeString()")));
- (void)decodeUnit __attribute__((swift_name("decodeUnit()")));
- (id _Nullable)updateNullableSerializableValueDeserializer:(id<CommonCodeKotlinx_serialization_runtime_nativeDeserializationStrategy>)deserializer old:(id _Nullable)old __attribute__((swift_name("updateNullableSerializableValue(deserializer:old:)")));
- (id _Nullable)updateSerializableValueDeserializer:(id<CommonCodeKotlinx_serialization_runtime_nativeDeserializationStrategy>)deserializer old:(id _Nullable)old __attribute__((swift_name("updateSerializableValue(deserializer:old:)")));
@property (readonly) id<CommonCodeKotlinx_serialization_runtime_nativeSerialModule> context __attribute__((swift_name("context")));
@property (readonly) CommonCodeKotlinx_serialization_runtime_nativeUpdateMode *updateMode __attribute__((swift_name("updateMode")));
@end;

__attribute__((swift_name("KotlinThrowable")))
@interface CommonCodeKotlinThrowable : KotlinBase
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(CommonCodeKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(CommonCodeKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));
- (CommonCodeKotlinArray *)getStackTrace __attribute__((swift_name("getStackTrace()")));
- (void)printStackTrace __attribute__((swift_name("printStackTrace()")));
@property (readonly) CommonCodeKotlinThrowable * _Nullable cause __attribute__((swift_name("cause")));
@property (readonly) NSString * _Nullable message __attribute__((swift_name("message")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinDetachedObjectGraph")))
@interface CommonCodeKotlinDetachedObjectGraph : KotlinBase
- (instancetype)initWithMode:(CommonCodeKotlinTransferMode *)mode producer:(id _Nullable (^)(void))producer __attribute__((swift_name("init(mode:producer:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithPointer:(void *)pointer __attribute__((swift_name("init(pointer:)"))) __attribute__((objc_designated_initializer));
- (void *)asCPointer __attribute__((swift_name("asCPointer()")));
@end;

__attribute__((swift_name("Sqldelight_runtimeSqlCursor")))
@protocol CommonCodeSqldelight_runtimeSqlCursor <CommonCodeSqldelight_runtimeCloseable>
@required
- (CommonCodeKotlinByteArray * _Nullable)getBytesIndex:(int32_t)index __attribute__((swift_name("getBytes(index:)")));
- (CommonCodeDouble * _Nullable)getDoubleIndex:(int32_t)index __attribute__((swift_name("getDouble(index:)")));
- (CommonCodeLong * _Nullable)getLongIndex:(int32_t)index __attribute__((swift_name("getLong(index:)")));
- (NSString * _Nullable)getStringIndex:(int32_t)index __attribute__((swift_name("getString(index:)")));
- (BOOL)next_ __attribute__((swift_name("next()")));
@end;

__attribute__((swift_name("Sqldelight_runtimeQueryListener")))
@protocol CommonCodeSqldelight_runtimeQueryListener
@required
- (void)queryResultsChanged __attribute__((swift_name("queryResultsChanged()")));
@end;

__attribute__((swift_name("Sqldelight_runtimeSqlPreparedStatement")))
@protocol CommonCodeSqldelight_runtimeSqlPreparedStatement
@required
- (void)bindBytesIndex:(int32_t)index value:(CommonCodeKotlinByteArray * _Nullable)value __attribute__((swift_name("bindBytes(index:value:)")));
- (void)bindDoubleIndex:(int32_t)index value:(CommonCodeDouble * _Nullable)value __attribute__((swift_name("bindDouble(index:value:)")));
- (void)bindLongIndex:(int32_t)index value:(CommonCodeLong * _Nullable)value __attribute__((swift_name("bindLong(index:value:)")));
- (void)bindStringIndex:(int32_t)index value:(NSString * _Nullable)value __attribute__((swift_name("bindString(index:value:)")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreChildHandle")))
@protocol CommonCodeKotlinx_coroutines_coreChildHandle <CommonCodeKotlinx_coroutines_coreDisposableHandle>
@required
- (BOOL)childCancelledCause:(CommonCodeKotlinThrowable *)cause __attribute__((swift_name("childCancelled(cause:)")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreChildJob")))
@protocol CommonCodeKotlinx_coroutines_coreChildJob <CommonCodeKotlinx_coroutines_coreJob>
@required
- (void)parentCancelledParentJob:(id<CommonCodeKotlinx_coroutines_coreParentJob>)parentJob __attribute__((swift_name("parentCancelled(parentJob:)")));
@end;

__attribute__((swift_name("KotlinException")))
@interface CommonCodeKotlinException : CommonCodeKotlinThrowable
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(CommonCodeKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(CommonCodeKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
@end;

__attribute__((swift_name("KotlinRuntimeException")))
@interface CommonCodeKotlinRuntimeException : CommonCodeKotlinException
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(CommonCodeKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(CommonCodeKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
@end;

__attribute__((swift_name("KotlinIllegalStateException")))
@interface CommonCodeKotlinIllegalStateException : CommonCodeKotlinRuntimeException
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(CommonCodeKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithCause:(CommonCodeKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreCancellationException")))
@interface CommonCodeKotlinx_coroutines_coreCancellationException : CommonCodeKotlinIllegalStateException
- (instancetype)initWithMessage:(NSString * _Nullable)message __attribute__((swift_name("init(message:)"))) __attribute__((objc_designated_initializer));
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
+ (instancetype)new __attribute__((unavailable));
- (instancetype)initWithMessage:(NSString * _Nullable)message cause:(CommonCodeKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(message:cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (instancetype)initWithCause:(CommonCodeKotlinThrowable * _Nullable)cause __attribute__((swift_name("init(cause:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@end;

__attribute__((swift_name("KotlinSequence")))
@protocol CommonCodeKotlinSequence
@required
- (id<CommonCodeKotlinIterator>)iterator __attribute__((swift_name("iterator()")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreSelectClause0")))
@protocol CommonCodeKotlinx_coroutines_coreSelectClause0
@required
- (void)registerSelectClause0Select:(id<CommonCodeKotlinx_coroutines_coreSelectInstance>)select block:(id<CommonCodeKotlinSuspendFunction0>)block __attribute__((swift_name("registerSelectClause0(select:block:)")));
@end;

__attribute__((swift_name("KotlinIterator")))
@protocol CommonCodeKotlinIterator
@required
- (BOOL)hasNext __attribute__((swift_name("hasNext()")));
- (id _Nullable)next__ __attribute__((swift_name("next_()")));
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeCompositeEncoder")))
@protocol CommonCodeKotlinx_serialization_runtime_nativeCompositeEncoder
@required
- (void)encodeBooleanElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index value:(BOOL)value __attribute__((swift_name("encodeBooleanElement(desc:index:value:)")));
- (void)encodeByteElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index value:(int8_t)value __attribute__((swift_name("encodeByteElement(desc:index:value:)")));
- (void)encodeCharElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index value:(unichar)value __attribute__((swift_name("encodeCharElement(desc:index:value:)")));
- (void)encodeDoubleElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index value:(double)value __attribute__((swift_name("encodeDoubleElement(desc:index:value:)")));
- (void)encodeFloatElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index value:(float)value __attribute__((swift_name("encodeFloatElement(desc:index:value:)")));
- (void)encodeIntElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index value:(int32_t)value __attribute__((swift_name("encodeIntElement(desc:index:value:)")));
- (void)encodeLongElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index value:(int64_t)value __attribute__((swift_name("encodeLongElement(desc:index:value:)")));
- (void)encodeNonSerializableElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index value:(id)value __attribute__((swift_name("encodeNonSerializableElement(desc:index:value:)")));
- (void)encodeNullableSerializableElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index serializer:(id<CommonCodeKotlinx_serialization_runtime_nativeSerializationStrategy>)serializer value:(id _Nullable)value __attribute__((swift_name("encodeNullableSerializableElement(desc:index:serializer:value:)")));
- (void)encodeSerializableElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index serializer:(id<CommonCodeKotlinx_serialization_runtime_nativeSerializationStrategy>)serializer value:(id _Nullable)value __attribute__((swift_name("encodeSerializableElement(desc:index:serializer:value:)")));
- (void)encodeShortElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index value:(int16_t)value __attribute__((swift_name("encodeShortElement(desc:index:value:)")));
- (void)encodeStringElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index value:(NSString *)value __attribute__((swift_name("encodeStringElement(desc:index:value:)")));
- (void)encodeUnitElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("encodeUnitElement(desc:index:)")));
- (void)endStructureDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc __attribute__((swift_name("endStructure(desc:)")));
- (BOOL)shouldEncodeElementDefaultDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("shouldEncodeElementDefault(desc:index:)")));
@property (readonly) id<CommonCodeKotlinx_serialization_runtime_nativeSerialModule> context __attribute__((swift_name("context")));
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeSerialClassDescImpl")))
@interface CommonCodeKotlinx_serialization_runtime_nativeSerialClassDescImpl : KotlinBase <CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>
- (instancetype)initWithName:(NSString *)name generatedSerializer:(id<CommonCodeKotlinx_serialization_runtime_nativeGeneratedSerializer> _Nullable)generatedSerializer __attribute__((swift_name("init(name:generatedSerializer:)"))) __attribute__((objc_designated_initializer));
- (void)addElementName:(NSString *)name isOptional:(BOOL)isOptional __attribute__((swift_name("addElement(name:isOptional:)")));
- (void)pushAnnotationA:(id<CommonCodeKotlinAnnotation>)a __attribute__((swift_name("pushAnnotation(a:)")));
- (void)pushClassAnnotationA:(id<CommonCodeKotlinAnnotation>)a __attribute__((swift_name("pushClassAnnotation(a:)")));
- (void)pushDescriptorDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc __attribute__((swift_name("pushDescriptor(desc:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Kotlinx_serialization_runtime_nativeEnumDescriptor")))
@interface CommonCodeKotlinx_serialization_runtime_nativeEnumDescriptor : CommonCodeKotlinx_serialization_runtime_nativeSerialClassDescImpl
- (instancetype)initWithName:(NSString *)name choices:(CommonCodeKotlinArray *)choices __attribute__((swift_name("init(name:choices:)"))) __attribute__((objc_designated_initializer));
- (instancetype)initWithName:(NSString *)name generatedSerializer:(id<CommonCodeKotlinx_serialization_runtime_nativeGeneratedSerializer> _Nullable)generatedSerializer __attribute__((swift_name("init(name:generatedSerializer:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeSerialModule")))
@protocol CommonCodeKotlinx_serialization_runtime_nativeSerialModule
@required
- (void)dumpToCollector:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialModuleCollector>)collector __attribute__((swift_name("dumpTo(collector:)")));
- (id<CommonCodeKotlinx_serialization_runtime_nativeKSerializer> _Nullable)getContextualKclass:(id<CommonCodeKotlinKClass>)kclass __attribute__((swift_name("getContextual(kclass:)")));
- (id<CommonCodeKotlinx_serialization_runtime_nativeKSerializer> _Nullable)getPolymorphicBaseClass:(id<CommonCodeKotlinKClass>)baseClass value:(id)value __attribute__((swift_name("getPolymorphic(baseClass:value:)")));
- (id<CommonCodeKotlinx_serialization_runtime_nativeKSerializer> _Nullable)getPolymorphicBaseClass:(id<CommonCodeKotlinKClass>)baseClass serializedClassName:(NSString *)serializedClassName __attribute__((swift_name("getPolymorphic(baseClass:serializedClassName:)")));
@end;

__attribute__((swift_name("KotlinAnnotation")))
@protocol CommonCodeKotlinAnnotation
@required
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeSerialKind")))
@interface CommonCodeKotlinx_serialization_runtime_nativeSerialKind : KotlinBase
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeCompositeDecoder")))
@protocol CommonCodeKotlinx_serialization_runtime_nativeCompositeDecoder
@required
- (BOOL)decodeBooleanElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("decodeBooleanElement(desc:index:)")));
- (int8_t)decodeByteElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("decodeByteElement(desc:index:)")));
- (unichar)decodeCharElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("decodeCharElement(desc:index:)")));
- (int32_t)decodeCollectionSizeDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc __attribute__((swift_name("decodeCollectionSize(desc:)")));
- (double)decodeDoubleElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("decodeDoubleElement(desc:index:)")));
- (int32_t)decodeElementIndexDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc __attribute__((swift_name("decodeElementIndex(desc:)")));
- (float)decodeFloatElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("decodeFloatElement(desc:index:)")));
- (int32_t)decodeIntElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("decodeIntElement(desc:index:)")));
- (int64_t)decodeLongElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("decodeLongElement(desc:index:)")));
- (id _Nullable)decodeNullableSerializableElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index deserializer:(id<CommonCodeKotlinx_serialization_runtime_nativeDeserializationStrategy>)deserializer __attribute__((swift_name("decodeNullableSerializableElement(desc:index:deserializer:)")));
- (id _Nullable)decodeSerializableElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index deserializer:(id<CommonCodeKotlinx_serialization_runtime_nativeDeserializationStrategy>)deserializer __attribute__((swift_name("decodeSerializableElement(desc:index:deserializer:)")));
- (int16_t)decodeShortElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("decodeShortElement(desc:index:)")));
- (NSString *)decodeStringElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("decodeStringElement(desc:index:)")));
- (void)decodeUnitElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index __attribute__((swift_name("decodeUnitElement(desc:index:)")));
- (void)endStructureDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc __attribute__((swift_name("endStructure(desc:)")));
- (id _Nullable)updateNullableSerializableElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index deserializer:(id<CommonCodeKotlinx_serialization_runtime_nativeDeserializationStrategy>)deserializer old:(id _Nullable)old __attribute__((swift_name("updateNullableSerializableElement(desc:index:deserializer:old:)")));
- (id _Nullable)updateSerializableElementDesc:(id<CommonCodeKotlinx_serialization_runtime_nativeSerialDescriptor>)desc index:(int32_t)index deserializer:(id<CommonCodeKotlinx_serialization_runtime_nativeDeserializationStrategy>)deserializer old:(id _Nullable)old __attribute__((swift_name("updateSerializableElement(desc:index:deserializer:old:)")));
@property (readonly) id<CommonCodeKotlinx_serialization_runtime_nativeSerialModule> context __attribute__((swift_name("context")));
@property (readonly) CommonCodeKotlinx_serialization_runtime_nativeUpdateMode *updateMode __attribute__((swift_name("updateMode")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinNothing")))
@interface CommonCodeKotlinNothing : KotlinBase
@end;

__attribute__((swift_name("KotlinComparable")))
@protocol CommonCodeKotlinComparable
@required
- (int32_t)compareToOther:(id _Nullable)other __attribute__((swift_name("compareTo(other:)")));
@end;

__attribute__((swift_name("KotlinEnum")))
@interface CommonCodeKotlinEnum : KotlinBase <CommonCodeKotlinComparable>
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer));
- (int32_t)compareToOther:(CommonCodeKotlinEnum *)other __attribute__((swift_name("compareTo(other:)")));
@property (readonly) NSString *name __attribute__((swift_name("name")));
@property (readonly) int32_t ordinal __attribute__((swift_name("ordinal")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("Kotlinx_serialization_runtime_nativeUpdateMode")))
@interface CommonCodeKotlinx_serialization_runtime_nativeUpdateMode : CommonCodeKotlinEnum
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
@property (class, readonly) CommonCodeKotlinx_serialization_runtime_nativeUpdateMode *banned __attribute__((swift_name("banned")));
@property (class, readonly) CommonCodeKotlinx_serialization_runtime_nativeUpdateMode *overwrite __attribute__((swift_name("overwrite")));
@property (class, readonly) CommonCodeKotlinx_serialization_runtime_nativeUpdateMode *update __attribute__((swift_name("update")));
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (int32_t)compareToOther:(CommonCodeKotlinx_serialization_runtime_nativeUpdateMode *)other __attribute__((swift_name("compareTo(other:)")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinTransferMode")))
@interface CommonCodeKotlinTransferMode : CommonCodeKotlinEnum
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
@property (class, readonly) CommonCodeKotlinTransferMode *safe __attribute__((swift_name("safe")));
@property (class, readonly) CommonCodeKotlinTransferMode *unsafe __attribute__((swift_name("unsafe")));
- (instancetype)initWithName:(NSString *)name ordinal:(int32_t)ordinal __attribute__((swift_name("init(name:ordinal:)"))) __attribute__((objc_designated_initializer)) __attribute__((unavailable));
- (int32_t)compareToOther:(CommonCodeKotlinTransferMode *)other __attribute__((swift_name("compareTo(other:)")));
@property (readonly) int32_t value __attribute__((swift_name("value")));
@end;

__attribute__((objc_subclassing_restricted))
__attribute__((swift_name("KotlinByteArray")))
@interface CommonCodeKotlinByteArray : KotlinBase
+ (instancetype)arrayWithSize:(int32_t)size __attribute__((swift_name("init(size:)")));
+ (instancetype)arrayWithSize:(int32_t)size init:(CommonCodeByte *(^)(CommonCodeInt *))init __attribute__((swift_name("init(size:init:)")));
+ (instancetype)alloc __attribute__((unavailable));
+ (instancetype)allocWithZone:(struct _NSZone *)zone __attribute__((unavailable));
- (int8_t)getIndex:(int32_t)index __attribute__((swift_name("get(index:)")));
- (CommonCodeKotlinByteIterator *)iterator __attribute__((swift_name("iterator()")));
- (void)setIndex:(int32_t)index value:(int8_t)value __attribute__((swift_name("set(index:value:)")));
@property (readonly) int32_t size __attribute__((swift_name("size")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreParentJob")))
@protocol CommonCodeKotlinx_coroutines_coreParentJob <CommonCodeKotlinx_coroutines_coreJob>
@required
- (CommonCodeKotlinThrowable *)getChildJobCancellationCause __attribute__((swift_name("getChildJobCancellationCause()")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreSelectInstance")))
@protocol CommonCodeKotlinx_coroutines_coreSelectInstance
@required
- (void)disposeOnSelectHandle:(id<CommonCodeKotlinx_coroutines_coreDisposableHandle>)handle __attribute__((swift_name("disposeOnSelect(handle:)")));
- (id _Nullable)performAtomicIfNotSelectedDesc:(CommonCodeKotlinx_coroutines_coreAtomicDesc *)desc __attribute__((swift_name("performAtomicIfNotSelected(desc:)")));
- (id _Nullable)performAtomicTrySelectDesc:(CommonCodeKotlinx_coroutines_coreAtomicDesc *)desc __attribute__((swift_name("performAtomicTrySelect(desc:)")));
- (void)resumeSelectCancellableWithExceptionException:(CommonCodeKotlinThrowable *)exception __attribute__((swift_name("resumeSelectCancellableWithException(exception:)")));
- (BOOL)trySelectIdempotent:(id _Nullable)idempotent __attribute__((swift_name("trySelect(idempotent:)")));
@property (readonly) id<CommonCodeKotlinContinuation> completion __attribute__((swift_name("completion")));
@property (readonly) BOOL isSelected __attribute__((swift_name("isSelected")));
@end;

__attribute__((swift_name("KotlinSuspendFunction")))
@protocol CommonCodeKotlinSuspendFunction
@required
@end;

__attribute__((swift_name("KotlinSuspendFunction0")))
@protocol CommonCodeKotlinSuspendFunction0 <CommonCodeKotlinSuspendFunction>
@required
@end;

__attribute__((swift_name("Kotlinx_serialization_runtime_nativeSerialModuleCollector")))
@protocol CommonCodeKotlinx_serialization_runtime_nativeSerialModuleCollector
@required
- (void)contextualKClass:(id<CommonCodeKotlinKClass>)kClass serializer:(id<CommonCodeKotlinx_serialization_runtime_nativeKSerializer>)serializer __attribute__((swift_name("contextual(kClass:serializer:)")));
- (void)polymorphicBaseClass:(id<CommonCodeKotlinKClass>)baseClass actualClass:(id<CommonCodeKotlinKClass>)actualClass actualSerializer:(id<CommonCodeKotlinx_serialization_runtime_nativeKSerializer>)actualSerializer __attribute__((swift_name("polymorphic(baseClass:actualClass:actualSerializer:)")));
@end;

__attribute__((swift_name("KotlinKDeclarationContainer")))
@protocol CommonCodeKotlinKDeclarationContainer
@required
@end;

__attribute__((swift_name("KotlinKAnnotatedElement")))
@protocol CommonCodeKotlinKAnnotatedElement
@required
@end;

__attribute__((swift_name("KotlinKClassifier")))
@protocol CommonCodeKotlinKClassifier
@required
@end;

__attribute__((swift_name("KotlinKClass")))
@protocol CommonCodeKotlinKClass <CommonCodeKotlinKDeclarationContainer, CommonCodeKotlinKAnnotatedElement, CommonCodeKotlinKClassifier>
@required
- (BOOL)isInstanceValue:(id _Nullable)value __attribute__((swift_name("isInstance(value:)")));
@property (readonly) NSString * _Nullable qualifiedName __attribute__((swift_name("qualifiedName")));
@property (readonly) NSString * _Nullable simpleName __attribute__((swift_name("simpleName")));
@end;

__attribute__((swift_name("KotlinByteIterator")))
@interface CommonCodeKotlinByteIterator : KotlinBase <CommonCodeKotlinIterator>
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (CommonCodeByte *)next__ __attribute__((swift_name("next_()")));
- (int8_t)nextByte __attribute__((swift_name("nextByte()")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreAtomicDesc")))
@interface CommonCodeKotlinx_coroutines_coreAtomicDesc : KotlinBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (void)completeOp:(CommonCodeKotlinx_coroutines_coreAtomicOp *)op failure:(id _Nullable)failure __attribute__((swift_name("complete(op:failure:)")));
- (id _Nullable)prepareOp:(CommonCodeKotlinx_coroutines_coreAtomicOp *)op __attribute__((swift_name("prepare(op:)")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreOpDescriptor")))
@interface CommonCodeKotlinx_coroutines_coreOpDescriptor : KotlinBase
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (id _Nullable)performAffected:(id _Nullable)affected __attribute__((swift_name("perform(affected:)")));
@end;

__attribute__((swift_name("Kotlinx_coroutines_coreAtomicOp")))
@interface CommonCodeKotlinx_coroutines_coreAtomicOp : CommonCodeKotlinx_coroutines_coreOpDescriptor
- (instancetype)init __attribute__((swift_name("init()"))) __attribute__((objc_designated_initializer));
+ (instancetype)new __attribute__((availability(swift, unavailable, message="use object initializers instead")));
- (void)completeAffected:(id _Nullable)affected failure:(id _Nullable)failure __attribute__((swift_name("complete(affected:failure:)")));
- (id _Nullable)prepareAffected:(id _Nullable)affected __attribute__((swift_name("prepare(affected:)")));
- (BOOL)tryDecideDecision:(id _Nullable)decision __attribute__((swift_name("tryDecide(decision:)")));
@property (readonly) BOOL isDecided __attribute__((swift_name("isDecided")));
@end;

NS_ASSUME_NONNULL_END
