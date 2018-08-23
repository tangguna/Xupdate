# Xupdate
Android版本更新库，根据CheckVersionLib（https://github.com/AlexLiuSheng/CheckVersionLib）  修改，使用方法一致，修改通知栏创建弹出与音效
，适配到Android O.
# 使用方法:
## 在根构建中添加它
 	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ## 在build.gradle中添加：
  dependencies {
	        implementation 'com.github.tangguna:Xupdate:0.1'
	}
