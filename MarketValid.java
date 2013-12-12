/**
*　このサンプールコードを使うことによって
*　アンドロイドアプリの提供元を判断することはできます。
* 1- Google Play(c) からのインストールの場合は　Google Wallet(c) APIを実装
* 2- その他のマーケットの場合はAppmartの課金APIを実装
*
*　Google Play
* http://developer.android.com/google/play/billing/billing_integrate.html
*
* Appmartの課金APIはこちら
* https://github.com/info-appmart/inBillingSampleOnePage
**/

//Package manager取得
PackageManager pm = getPackageManager();
String installationSource = pm.getInstallerPackageName(getPackageName());
  
//提供元を判断
if(installationSource.equals("com.android.vending")){
	Log.d("DEBUG", "google Play(c)からインストールされました。");
	//TODO google Wallet(c)のAPIを実装
}else{
	Log.d("DEBUG", "google Play(c)意外のマーケットからインストールされました。");
	//TODO Appmartの課金APIを実装
}

