# AndroidAnimator
Android 属性动画总结

## 逐帧动画

### 常见的方法

- void start() 开始播放动画
- void stop() 停止播放动画
- boolean isRunning() 判断当前AnimationDrawable是否正在播放
- int getNumberOfFrames() 获取所有的帧数
- Drawable getFrame(int index) 获取指定帧对应的Drawable对象
- int getDuration(int i) 获取指定帧的显示持续时间
- boolean isOneShot() 判断当前AnimationDrawable是否循环执行 true代表执行一次，false循环执行
- void setOneShot(boolean oneShot) 设置AnimationDrawable是否循环执行
- void addFrame(@NonNull Drawable frame, int duration) 为AnimationDrawable添加一帧

### 注意事项

1、在我们使用逐帧动画时，要避免使用大尺寸的图片，以免造成OOM。

