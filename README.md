## 16种MBTI人格相处模拟程序
### 功能：

本项目可以用来模拟两名用户指定的不同MBTI人格的人，在一定时间的交往之后，对相互之间产生的影响以及两人的关系。

---
### 使用方法：
1. 编译src文件夹下的项目文件，再运行Interaction.java
2. 按照程序提示输入两名用户（Adam & Eve)的人格类型
3. 输入两人将要相处的时间
4. 查看结果
---
### 运行逻辑：
项目逻辑的核心是随机数。以下将举例说明随机数是如何运作的：

假设我们的测试对象其中有一名是intj人格的【杨过】，杨过的intj人格中有这样一种性格倾向叫作【独立且蔑视权威】。本程序将这种倾向作了数值化处理如下：
- 每天对自己
    1. 生理满足：区间为[0,3]的随机减值，模拟杨过因不服从权威而导致的无法从社会主流环境提供的资源中摄取生理满足能力的降低；
    2. 安全感：区间为[0,5]的随机减值，模拟杨过因背离权威而导致的极度不安全感；
    3. 自尊：区间为[0,4]的随机减值，模拟杨过遭受社会主流舆论谴责的感受；
    4. 自我实现：区间为[0,2]的随机减值，模拟杨过在社会中实现自我价值能力的削弱；
    5. 超自我实现：区间为[0,2]的随机加值，模拟杨过因现实中的挫败，转而追求超然事物、自我内在价值等超自我价值的追求；
- 每天对他人
    1. 安全感：区间为[0,1]的随机减值，模拟他人与杨过这个社会异类共同生活所感受到的潜在不安全感；
    2. 自尊：区间为[0,1]的随机减值，模拟他人在于杨过的相处过程中，因杨过的鹤立独行而感受不到来自他的尊重；

所以，由于intj人格的杨过的这一种性格倾向，导致每一天都对自己与他人产生两个方向的数值变化，其代码为：
```java
public static void IntjSelf(){
    int randomChanges1 = ThreadLocalRandom.current().nextInt(-3,1);
    int randomChanges2 = ThreadLocalRandom.current().nextInt(-5,1);
    int randomChanges3 = ThreadLocalRandom.current().nextInt(-4,1);
    int randomChanges4 = ThreadLocalRandom.current().nextInt(-2,1);
    int randomChanges5 = ThreadLocalRandom.current().nextInt(0,1+1);
    setPhysical(randomChanges1);
    setSecurity(randomChanges2);
    SetEsteem(randomChanges3);
    setSelfFulfillment(randomChanges4);
    setIntrisicValue(randomChanges5);
}

public static void IntjOpposite(){
    int randomChanges1 = ThreadLocalRandom.current().nextInt(-1,1);
    setSecurity(randomChanges1)；
    setEsteem(randomChanges1);
}
```
用户指定两人交互每n天，上述两个方法就执行n次（当然这只是其中一人的一个性格倾向，实际上两个人的多种性格都会相互影响）。然后将带来的数值变化传递给代表两人的类中，其中包含代表两人的各项指标。最后通过条件判断这些数值来模拟两人各项指标以及关系的变化。

---

### 结果判断：

本程序的运行结果如下例所示，它显示了两名分别为entj/esfj人格类型的人在365天的互动之后，可能产生的结果：
> Please tell us the personal types of Adam:
entj

> Please tell us the personal types of Eve:
esfj

> Please tell us how many days do you want these two people have interactions with each other?
365

>Adam:
>Physical needs 'tremendously' enhanced (Eve brings tremendous changes to Adam's physical needs, now Adam can always feel his animal desire and have unstoppable impulsive to fulfill them.) 

>Sense of safety 'remarkably' enhanced (Eve's tenderness makes Adam reminding of his mother.) 
Social satisfaction 'tremendously' weakened (Adam feels meeting Eve is like walking in a silent cave: Maybe soliloquize at first, then completely mute at last because of the lack of response.) 

>Sense of esteem 'tremendously' weakened (Adam now has a desperate attitude towards life due to Eve's daily humiliation.) 

>Self-fulfillment 'slightly' enhanced (The tips from Eve is helpful on Adam's career.) 

>Intrinsic value 'slightly' weakened (Adam pay less attention to his soul than social identity, so does Eve.) 

>Affection 'tremendously' weakened (Adam is disgusting in others' eyes. They even give him a nickname called 'roach'.) 

>Bond between two people 'slightly' enhanced (The connection between these two grows steadily.) 

从上述结果中可以看出，本程序模拟了一个自然人的如下方面：

1. 生理需求
2. 安全感
3. 社交满足感
4. 自尊
5. 自我实现
6. 超我实现
7. 对另一方的好感
8. 与另一方的感情

在对上述8个方面的数值进行条件判断以后，会有返回如下结果：
1. 增强
    1. 显著地
    2. 明显地
    3. 稍许地
2. 减弱
    1. 显著地
    2. 明显地
    3. 稍许地
    
通过上述条件判断来告诉用户，双方之间究竟带给了对方什么样的影响。由于本程序的运作是根据随机数来完成的，所以每一次同样人格类型经过同样的时间得出来的结果可能有所不同，这也与现实情况相符。



