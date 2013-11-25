//Package manager
PackageManager pm = getPackageManager();
String installationSource = pm.getInstallerPackageName(getPackageName());
 
String source ;
 
//提供元を判断
if(installationSource.equals("com.android.vending")){
 source= "google play";	//google
}else if(installationSource.equals("com.amazon.venezia")){
 source= "amazon market";	//amazon
}else{
 source= "その他のマーケット";	//その他
}
 Log.d("DEBUG", source + "からインストールされました。");