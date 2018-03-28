# AndroidUtils
Android工具类库

#### 1. 屏幕相关 -> [ScreenUtils.java](https://github.com/leavesC/AndroidUtils/blob/master/app/src/main/java/com/czy/androidutils/sytem/utils/ScreenUtils.java)
 
  - getTitleHeight：获取标题栏高度
  
  - getStatusBarHeight：获取状态栏高度
    
  - getScreenWidth：获取屏幕宽度
  
  - getScreenWidth2：获取屏幕宽度
  
  - getNavigationBarHeight： 获取虚拟按键的高度，不论虚拟按键是否显示都会返回其固定高度
  
  - getNavigationBarHeightIfRoom：获取虚拟按键的高度，会根据当前是否有显示虚拟按键来返回相应的值
  
  - getTotalScreenHeight：返回包括虚拟键在内的总的屏幕高度
  
  - getAvailableScreenHeight：获取不包括虚拟按键在内的屏幕高度
  
<br>

#### 2. 尺寸相关 ->  [DisplayUtils.java](https://github.com/leavesC/AndroidUtils/blob/master/app/src/main/java/com/czy/androidutils/sytem/utils/DisplayUtils.java)

  - dp2px：dp值转换为px值
  
  - px2dp：px值转换为dp值
    
  - px2sp：px值转换为sp值
  
  - sp2px：sp值转换为px值

<br>

#### 3. 应用相关 -> [AppInfoUtils.java](https://github.com/leavesC/AndroidUtils/blob/master/app/src/main/java/com/czy/androidutils/sytem/utils/AppInfoUtils.java)
 
  - isSystemApplication：判断是否是系统应用
  
  - getAllApplication：获取设备所有的应用
    
  - getAllSystemApplication：获取设备所有的系统应用
  
  - getAllNonSystemApplication：获取设备所有的非系统应用

  - getApplicationNameByPackageName：根据应用包名获取应用名

  - appExist：判断指定包名的应用是否存在

<br>

#### 4. 系统参数相关 -> [SystemInfoActivity.java](https://github.com/leavesC/AndroidUtils/blob/master/app/src/main/java/com/czy/androidutils/sytem/SystemInfoActivity.java)

  - getTotalMemory：设备总内存大小
  
  - getAvailMemory：设备可用内存大小
    
  - getThreshold：设备内存不足的阀值
  
  - isLowMemory：设备是否处于低内存状态
  
  - showSystemInfo：更多系统参数~~

<br>

#### 5. 广告相关 -> [AdUtils.java](https://github.com/leavesC/AndroidUtils/blob/master/app/src/main/java/com/czy/androidutils/ad/utils/AdUtils.java)

  - openApplicationMarket：打开应用市场指定应用的详情页

  - openJdShop：打开京东客户端指定商铺

  - openJdGoods：打开京东客户端指定商品详情页

  - openTaoBaoShop：打开淘宝客户端指定商铺

  - openTaoBaoGoods：打开淘宝客户端指定商品详情页

  - openTmallShop：打开天猫客户端指定商铺
  
  - openTmallGoods：打开天猫客户端指定商品详情页

#### 6. Drawable相关 -> [activity_drawable.xml](https://github.com/leavesC/AndroidUtils/blob/master/app/src/main/res/layout/activity_drawable.xml)

  - 圆角按钮

  - 带边框的圆角按钮

  - 单个边框的按钮

  - 渐变按钮

  - 带点击反馈的按钮

  - 带点击反馈的圆角按钮
  
  - 带阴影的按钮
  
  - 带虚线边框的文本

  - 带虚线边框和点击反馈的按钮

  - 着色

  - 图片渐变切换

  - 圆环

  - 红色圆点
  
  - 带阴影的按钮
