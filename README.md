CustomLoading For Android
=============

Android开发中我们经常会用到各种各样的loading，那么自己总结了常用的loading并分享出来。首先先来看下具体效果图：

![Sample image](https://raw.github.com/stormzhang/CustomLoading/master/snap.png)

1. 第一个就是在app中常见的loading效果，主要是用帧动画实现的，所谓帧动画就是一组组图片顺序播放；

2. 第二组也比较常见，其实就是一张图片的轮询旋转动画；

3. 第三个是裁剪动画，主要用到了ClipDrawable，图中的效果是茶杯中的水逐渐涨满的效果；

4. 第四和第五个是自定义的一个组件，通过onDraw来画出来的效果；