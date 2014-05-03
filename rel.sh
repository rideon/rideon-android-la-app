ant release;
zipalign -f -v 4 bin/RideonLAMainActivity-release.apk bin/RideonLAMainActivity-release-out.apk;
adb install -r bin/RideonLAMainActivity-release-out.apk;
