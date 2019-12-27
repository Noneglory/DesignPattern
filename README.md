# DesignPattern
java的设计模式的理解与实现


程序设计原则

1：开闭原则(Open close principle)    
开闭原则就是说对扩展开放，对修改关闭。在程序需要扩展的时候，不能去修改原有的代码，实现一个热拔插的效果，我们就需要使用接口和抽象类   
2：里氏代换原则(liskov Substitution Principle)  
任何基类可以出现的地方，子类一定可以出现    
3：依赖倒转原则(Dependence Inversion Principle)    
对接口变成，依赖于抽象而不依赖于具体  
4：接口隔离原则(Interface Segregation Principle)   
尽量使接口的作用单一，也就是使用多个接口，比使用单个接口要好  
5：迪米特法则(demeter Principle)      
一个实体应当尽量少的与其他实体之间发生相互作用，使得系统功能模块相对独立。   
6：合成复用原则(Composite Reuse Principle)     
原则是尽量使用合成/聚合的方式，而不是使用继承 
