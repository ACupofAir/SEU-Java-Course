- [工具概况](#工具概况)
- [详细介绍](#详细介绍)
  - [jps(虚拟机进程状况工具)](#jps虚拟机进程状况工具)

# Java Profiling in Terminal
> java命令行性能检测

## 工具概况
|  命令  |              全称              |                                     功能                                      |
|:------:|:------------------------------:|:---------------------------------------------------------------------------:|
|  jps   |    JVM Process Status Tool     |                        显示系统中所有HotSpot虚拟机进程                        |
| jstat  | JVM Statistics Monitoring Tool |                          收集虚拟机各方面的运行数据                           |
| jinfo  |  Configuration Info for Java   |                              显示虚拟机配置信息                               |
|  jmap  |      Memory Map for Java       |                     生成虚拟机内存转储快照(heapdump)文件                      |
|  jhat  |     JVM Heap Dump Browser      | 用于分析heapdump文件，建立一个http/html服务器，让用户可以在浏览器上查看分析结果 |
| jstack |      Stack Trace for Java      |                             显示虚拟机的线程快照                              |

## 详细介绍
### jps(虚拟机进程状况工具)
1. 命令格式： jps -[op] [hostid]
2. op的功能

| op |          功能           |
|:--:|:---------------------:|
| l  |      输出主类全名       |
| q  | 只显示进程id，不显示类名 |
| m  |    显示main函数参数     |
| v  | 显示虚拟机启动时JVM参数 |