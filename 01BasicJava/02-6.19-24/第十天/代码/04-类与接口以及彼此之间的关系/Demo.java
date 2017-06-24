/*
类与类之间的关系：
	继承关系，单继承，不能多继承，可以多层继承
类与接口：
	实现关系，单实现，多实现，多层实现；还可以在继承一个类的同时实现多个接口
接口与接口：
	继承关系，单继承，多继承，多层继承
*/
interface Inter{}
interface Inter2 extends Inter,Inter3{}
interface Inter3{}
class Test2{}
class Test extends Test2 implements Inter,Inter2,Inter3{}