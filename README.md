# PreferenceActivityTest
移动软件开发课堂作业4--扩展的Activity

##实现设置Activity
##使用PreferenceFragment 实现一个菜单

初始界面

![main](https://github.com/Birdie0421/PreferenceActivityTest/blob/master/app/src/main/res/mipmap-xxxhdpi/QQ%E6%88%AA%E5%9B%BE20170328155709.jpg?raw=true)

点击第一个checkbox

![checkbox](https://github.com/Birdie0421/PreferenceActivityTest/blob/master/app/src/main/res/mipmap-xxxhdpi/QQ%E6%88%AA%E5%9B%BE20170328155955.jpg?raw=true)

点击Edit text preference
激活输入栏

![edit](https://github.com/Birdie0421/PreferenceActivityTest/blob/master/app/src/main/res/mipmap-xxxhdpi/QQ%E6%88%AA%E5%9B%BE20170328155755.jpg?raw=true)

点击list preference
出现选择界面

![list](https://github.com/Birdie0421/PreferenceActivityTest/blob/master/app/src/main/res/mipmap-xxxhdpi/QQ%E6%88%AA%E5%9B%BE20170328155805.jpg?raw=true)

点击Screen preference
切换到另一个PreferenceScreen

![screen](https://github.com/Birdie0421/PreferenceActivityTest/blob/master/app/src/main/res/mipmap-xxxhdpi/QQ%E6%88%AA%E5%9B%BE20170328155810.jpg?raw=true)

点击Intent preference
通过Intent 访问百度页面

        <PreferenceScreen
           android:summary="Launches an Activity from an Intent"
           android:title="Intent preference" >
           <intent
               android:action="android.intent.action.VIEW"
               android:data="http://www.baidu.com" />
       </PreferenceScreen>

![Intent](https://github.com/Birdie0421/PreferenceActivityTest/blob/master/app/src/main/res/mipmap-xxxhdpi/QQ%E6%88%AA%E5%9B%BE20170328155913.jpg?raw=true)

通过dependency属性关联两个checkbox,当parentCheckBox选中时,childCheckBox才可用

        <CheckBoxPreference
            android:key="parentKey"
            android:defaultValue="false"
            android:summary="This is visually a parent"
            android:title="Parent checkbox preference" />
            
        <CheckBoxPreference
            android:key="childKey"
            android:defaultValue="false"
            android:dependency="parentKey"
            android:summary="This is visually a child"
            android:title="Child checkbox preference" />

未选中

![un](https://github.com/Birdie0421/PreferenceActivityTest/blob/master/app/src/main/res/mipmap-xxxhdpi/QQ%E6%88%AA%E5%9B%BE20170328155925.jpg?raw=true)xx

选中

![check](https://github.com/Birdie0421/PreferenceActivityTest/blob/master/app/src/main/res/mipmap-xxxhdpi/QQ%E6%88%AA%E5%9B%BE20170328155930.jpg?raw=true)
