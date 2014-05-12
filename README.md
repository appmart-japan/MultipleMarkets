アプリ提供元確認
===============


![last-version](http://img.shields.io/badge/last%20version-1.0-green.svg "last version:1.0") 

![license apache 2.0](http://img.shields.io/badge/license-apache%202.0-brightgreen.svg "licence apache 2.0")


###提供元取得

マーケットの提供元を取得るために、
【PackageManager】の【getInstallerPackageName】をご利用ください。

```java
PackageManager pm = getPackageManager();
String installationSource = pm.getInstallerPackageName(getPackageName());
```

Google Play(c)からインストールされたものの場合は "com.android.vending"がリターンされます。

```java
if(installationSource.equals("com.android.vending")){
	Log.d("DEBUG", "google Play(c)からインストールされました。");
	//TODO google Wallet(c)のAPIを実装
}else{
	Log.d("DEBUG", "google Play(c)意外のマーケットからインストールされました。");
	//TODO Appmartの課金APIを実装
}
```

 * Google Market(c) からのインストールの場合は　Google Wallet(c) APIを実装します。
 * その他のマーケットの場合はAppmartの課金APIを実装します。

###参照

+ [Google Marketの課金APIはこち](http://developer.android.com/google/play/billing/billing_integrate.html)
+ [Appmartの課金APIはこちら](https://github.com/info-appmart/inBillingSampleOnePage)
 
