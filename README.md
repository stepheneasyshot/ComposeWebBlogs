# ComposeWebBlogs
This is a Kotlin Multiplatform project targeting Web.

因为github使用的开源博客主题在其他网站部署需要昂贵的会员费，所以自己动手写一个博客网页，使用Jetpack Compose来开发。

## 开发计划
* 中文乱码通过引入思源开源字体解决，设置中文专用字体即可

```kotlin
@Composable
fun getChineseFont() = FontFamily(
    Font(resource = Res.font.noto_sans_regular, weight = FontWeight.Normal),
)
```

* 主题方面先采用`Hydejack`同款样式，根据其交互框架来进一步扩展
* markdown显示逻辑还需探索，可能要和原生来搭配使用，之前的开源框架不确定是否可以直接用来展示md文件
* 内存，CPU等性能问题，CMP在网页端的表现如何也需要观察
