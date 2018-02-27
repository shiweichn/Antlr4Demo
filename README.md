# Antlr4Demo
Antlr v4 demo
使用Antlr基于AST(抽象语法树)开发了一套DSL，用来解析游戏策划配置的技能。
支持变量定义，函数定义，控制结构等。

# 表达式解析案例
```
final CodePointCharStream stream = CharStreams.fromString("1+1\n 2*3\n 6-2\n 1.5*2\n ((1+1)*2+1)/(3+2)\n");
final CodePointCharStream stream = CharStreams.fromString("1==1?2:3\n");
final CodePointCharStream stream = CharStreams.fromString("((1+1)*2+1)/(3+2)==1?1.5*2:((1+1)*2+1)/(3+2)\n");
final CodePointCharStream stream = CharStreams.fromString("list()");
final CodePointCharStream stream = CharStreams.fromString("list(2)");
final CodePointCharStream stream = CharStreams.fromString("1+list().count()*list().count()");
final CodePointCharStream stream = CharStreams.fromString("a=list().count()==4?list():9");
final CodePointCharStream stream = CharStreams.fromString("list().random(2)");
final CodePointCharStream stream = CharStreams.fromString("a=1!=1;b=2;c=3;a?b:c");
final CodePointCharStream stream = CharStreams.fromString("((1+1)*2+1)/(3+2)==1?2:3");
final CodePointCharStream stream = CharStreams.fromString("1-4");
final CodePointCharStream stream = CharStreams.fromString("defers()");
final CodePointCharStream stream = CharStreams.fromString("1==1");
final CodePointCharStream stream = CharStreams.fromString("-1.5");
final CodePointCharStream stream = CharStreams.fromString("-list().count()");
final CodePointCharStream stream = CharStreams.fromString("list().random(3).random(2).random(1)");
final CodePointCharStream stream = CharStreams.fromString("belongto(11111,list())");
final CodePointCharStream stream = CharStreams.fromString("testPrint()testPrint()1+1");
final CodePointCharStream stream = CharStreams.fromString("a=10;" +
		"b=20;" +
		"c=30;" +
		"d=a*b*c;"+
		"2*6;");
final CodePointCharStream stream = CharStreams.fromString("b=10;\n" +
		"for(a : list()){\n" +
		"c=a+b;\n" +
		"log(c);\n" +
		"}");
```
---
# 性能测试
```
final CodePointCharStream stream = CharStreams.fromString("((1+1)*2+1)/(3+2)==1?2:3");
```

普通四则运算+三则运算 十秒计算了22万次
result:2  第219443次计算，耗时：0.036183 毫秒   v:10000.0205

_------平均每次计算：0.04557022  毫秒_

---

```
final CodePointCharStream stream = CharStreams.fromString("list().random(2)");
```
自定义函数 十秒运算了70万次
result:[11111, 33333]  第706486次计算，耗时：0.012965 毫秒   v:10000.011

_------平均每次计算：0.014154597  毫秒_

