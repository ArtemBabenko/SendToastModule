# SendToastModule

[![](https://jitpack.io/v/keygenqt/android-letters.svg)](https://jitpack.io/#keygenqt/android-letters)

Add it to your build.gradle with:

```gradle
allprojects {
	    repositories {
	        // ...
	        maven { url "https://jitpack.io" }
	    }
	}
```
and:	
```gradle
dependencies {
	   compile 'com.github.ArtemBabenko:SendToastModule:0.1.0'
	}
```
## Usage
```java
SendToast.sendShortToast( context, message);
```
