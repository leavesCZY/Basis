
# AndroidUtils
Android工具类库

#### 1. 屏幕相关 -> [ScreenUtils.java](https://github.com/leavesC/AndroidUtils/blob/master/app/src/main/java/com/czy/androidutils/sytem/utils/ScreenUtils.java)
 
  - getTitleHeight：&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;获取标题栏高度
  
  - getStatusBarHeight：&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;获取状态栏高度
    
  - getScreenWidth： &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;获取屏幕宽度
  
  - getScreenWidth2：&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; &ensp;获取屏幕宽度
  
  - getNavigationBarHeight： &ensp;&ensp;&ensp;&ensp;&ensp;&ensp; 获取虚拟按键的高度，不论虚拟按键是否显示都会返回其固定高度
  
  - getNavigationBarHeightIfRoom：&ensp;获取虚拟按键的高度，会根据当前是否有显示虚拟按键来返回相应的值
  
  - getTotalScreenHeight： &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; 返回包括虚拟键在内的总的屏幕高度
  
  - getAvailableScreenHeight：&ensp;&ensp;&ensp;&ensp;&ensp; 获取不包括虚拟按键在内的屏幕高度
   
  - getAvailableScreenHeight：&ensp;&ensp;&ensp;&ensp;&ensp; 获取不包括虚拟按键在内的屏幕高度

<br>

#### 2. 尺寸相关 -> [DisplayUtils.java](https://github.com/leavesC/AndroidUtils/blob/master/app/src/main/java/com/czy/androidutils/sytem/utils/DisplayUtils.java)

  - dp2px：&ensp;&ensp;&ensp;dp值转换为px值
  
  - px2dp：&ensp;&ensp;&ensp;px值转换为dp值
    
  - px2sp：&ensp;&ensp;&ensp;px值转换为sp值
  
  - sp2px：&ensp;&ensp;&ensp;sp值转换为px值

<br>

#### 3. 应用相关 -> [AppInfoUtils.java](https://github.com/leavesC/AndroidUtils/blob/master/app/src/main/java/com/czy/androidutils/sytem/utils/AppInfoUtils.java)
 
  - isSystemApplication：   &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;判断是否是系统应用
  
  - getAllApplication：&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;获取设备所有的应用
    
  - getAllSystemApplication：&ensp; &ensp; &ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;获取设备所有的系统应用
  
  - getAllNonSystemApplication：&ensp;&ensp;&ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp;  获取设备所有的非系统应用

  - getApplicationNameByPackageName：&ensp;&ensp; 根据应用包名获取应用名

  - appExist：&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;判断指定包名的应用是否存在

<br>

#### 4. 系统参数相关 -> [SystemInfoActivity.java](https://github.com/leavesC/AndroidUtils/blob/master/app/src/main/java/com/czy/androidutils/sytem/SystemInfoActivity.java)

  - getTotalMemory：   &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;设备总内存大小
  
  - getAvailMemory：&ensp;&ensp;&ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;设备可用内存大小
    
  - getThreshold：&ensp; &ensp; &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; &ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;设备内存不足的阀值
  
  - isLowMemory：&ensp;&ensp;&ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; 设备是否处于低内存状态
  
  - showSystemInfo： &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp; &ensp;&ensp;&ensp;&ensp;&ensp; 更多系统参数~~
