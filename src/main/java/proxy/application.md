代理和装饰器特别像，
装饰器：装饰者和被装饰者都是实现了一个接口，对原有功能的增强，
代理类：使用代理类，而不用在意实现细节

他们的侧重点不一样,代理更多的是强调对对象的访问控制，用户使用代理对象即可，而不去管实现细节，用户不用知道被代理对象
而装饰器模式更多的强调给对象加强功能，用户需要给一个原始对象，装饰者才能给改对象加强功能。

像本包下Proxy为静态代理，还有动态代理，动态代理分为jdk动态代理和cglib的动态代理，
jdk动态代理是面向接口的，
cglib的动态代理是面向类的。参考连接： https://blog.csdn.net/qq_41854763/article/details/111058947